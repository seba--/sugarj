package org.sugarj.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoInt;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoPlaceholder;
import org.spoofax.interpreter.terms.IStrategoReal;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.jsglr_layout.client.InvalidParseTableException;
import org.spoofax.jsglr_layout.client.imploder.IToken;
import org.spoofax.jsglr_layout.client.imploder.ImploderAttachment;
import org.spoofax.jsglr_layout.client.imploder.Token;
import org.spoofax.jsglr_layout.io.ParseTableManager;
import org.spoofax.terms.StrategoListIterator;
import org.spoofax.terms.TermFactory;
import org.spoofax.terms.attachments.ParentAttachment;
import org.spoofax.terms.attachments.ParentTermFactory;
import org.spoofax.terms.io.InlinePrinter;
import org.spoofax.terms.io.TAFTermReader;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.tools.sdf_desugar_0_0;
import org.sugarj.common.path.Path;
import org.sugarj.common.FileCommands;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class ATermCommands {
  
  public static class MatchError extends Error {
    private static final long serialVersionUID = -3329736288449173760L;
    private final IStrategoTerm scrutinee;
    private final String kind;
    private final String highlevelPattern;
    
    public MatchError(IStrategoTerm scrutinee, String kind, String highlevelPattern) {
      super("Error while matching " + kind + " of " + highlevelPattern);
      
      this.scrutinee = scrutinee;
      this.kind = kind;
      this.highlevelPattern = highlevelPattern;
    }

    public MatchError(IStrategoTerm scrutinee, String kind) {
      super("Error while matching " + kind + " against " + scrutinee.toString());
      
      this.scrutinee = scrutinee;
      this.kind = kind;
      this.highlevelPattern = null;
    }

    public IStrategoTerm getScrutinee() {
      return scrutinee;
    }
    
    public String getKind() {
      return kind;
    }

    public String getHighlevelPattern() {
      return highlevelPattern;
    }
  }
  
  public static ITermFactory factory = new ParentTermFactory(new TermFactory().getFactoryWithStorageType(IStrategoTerm.MUTABLE));
  public static ParseTableManager parseTableManager = new ParseTableManager(factory, false);

  public static IStrategoTerm atermFromFile(String filename) throws IOException {
    IStrategoTerm term = Environment.terms.get(filename);
    
    if (term != null)
      return term;
    
    return new TAFTermReader(factory).parseFromFile(filename);
  }
  
  public static IStrategoTerm atermFromString(String s) throws IOException {
    return new TAFTermReader(factory).parseFromString(s);
  }

  public static Path atermToFile(IStrategoTerm aterm) throws IOException {
    Path file = FileCommands.newTempFile("ast");
    atermToFile(aterm, file);
    return file;
  }
  
  public static void atermToFile(IStrategoTerm aterm, Path filename)
      throws IOException {
    Environment.terms.put(filename, aterm);
    FileCommands.writeToFile(filename, atermToString(aterm));
  }
  
  public static String atermToString(IStrategoTerm aterm) {
    InlinePrinter printer = new InlinePrinter();
    aterm.prettyPrint(printer);
    return printer.getString();
  }

  public static boolean isApplication(IStrategoTerm term, String cons) {
    return term.getTermType() == IStrategoTerm.APPL &&
           ((IStrategoAppl) term).getConstructor().getName().equals(cons);
  }
  
  public static IStrategoTerm getApplicationSubterm(IStrategoTerm term, String cons, int index) {
    if (cons == null || isApplication(term, cons))
      return term.getSubterm(index);
    
    throw new MatchError(term, "application", cons);
  }
  
  public static String getString(IStrategoTerm term) {
    if (term.getTermType() == IStrategoTerm.STRING)
      return ((IStrategoString) term).stringValue();
    
    throw new MatchError(term, "string");
  }

  public static boolean isList(IStrategoTerm term) {
    return term.getTermType() == IStrategoTerm.LIST;
  }
  
  public static boolean isString(IStrategoTerm term) {
    return term.getTermType() == IStrategoTerm.STRING;
  }

  
  public static List<IStrategoTerm> getList(IStrategoTerm term) {
    
    if (term.getTermType() == IStrategoTerm.LIST)
    {
      List<IStrategoTerm> l = new ArrayList<IStrategoTerm>();
      
      for (Iterator<IStrategoTerm> it = new StrategoListIterator((IStrategoList) term);
           it.hasNext(); )
        l.add(it.next());
      
      return l;
    }
    
    throw new MatchError(term, "list");
  }
  
  public static IStrategoTerm makeTuple(IStrategoTerm... ts) {
    return makeTuple(null, ts);
  }
  
  public static IStrategoTerm makeTuple(IToken tok, IStrategoTerm... ts) {
    IStrategoTerm t = factory.makeTuple(ts);
    setAttachment(t, "Tuple", tok, ts);
    return t;
  }
  
  public static IStrategoTerm makeSome(IStrategoTerm term, IToken noneToken) {
    if (term != null)
      return makeAppl("Some", "Some", 1, noneToken, term);
    
    return makeAppl("None", "Some", 0, noneToken);
  }

  public static IStrategoTerm makeString(String s) {
    IStrategoTerm t = factory.makeString(s);
    setAttachment(t, "String", null);
    return t;
  }

  public static IStrategoTerm makeString(String s, IToken token) {
    IStrategoTerm t = factory.makeString(s);
    setAttachment(t, "String", token);
    return t;
  }
  
  public static IStrategoList makeList(String sort, IStrategoTerm... ts) {
    assert ts.length > 0;
    return makeList(sort, null, ts);
  }
  
  public static IStrategoList makeList(String sort, IToken emptyListToken, IStrategoTerm... ts) {
    IStrategoList term = factory.makeList(ts);
    
    setAttachment(term, sort, emptyListToken, ts);
    return term;
  }

  public static IStrategoList makeList(String sort, Collection<IStrategoTerm> ts) {
    return makeList(sort, ts.toArray(new IStrategoTerm[ts.size()]));
  }
  
  public static IStrategoList makeList(String sort, IToken emptyListToken, Collection<IStrategoTerm> ts) {
    return makeList(sort, emptyListToken, ts.toArray(new IStrategoTerm[ts.size()]));
  }
  
  public static IStrategoTerm makeAppl(String cons, String sort, int arity, IStrategoTerm... args) {
    assert args.length > 0;
    return makeAppl(cons, sort, arity, null, args);
  }
  
  public static IStrategoTerm makeAppl(String cons, String sort, int arity, IToken emptyArgsToken, IStrategoTerm... args) {
    assert emptyArgsToken != null || args.length > 0;
    
    IStrategoTerm appl =
      factory.makeAppl(
             factory.makeConstructor(cons, arity),
             args);
    
    setAttachment(appl, sort, emptyArgsToken, args);
    
    return appl;
  }
  
  private static void setAttachment(IStrategoTerm term, String sort, IToken emptyToken, IStrategoTerm... children) {
    IToken left;
    IToken right;
    
    if (children.length == 0) {
      if (emptyToken == null)
        return;
      
      left = emptyToken;
      right = emptyToken;
    }
    else {
      left = ImploderAttachment.getLeftToken(children[0]);
      right = ImploderAttachment.getRightToken(children[children.length - 1]);
    }
    
    if (left != null && right != null)
      ImploderAttachment.putImploderAttachment(
          term,
          term.isList(),
          sort, 
          left,
          right);
    
    
    for (IStrategoTerm arg : children)
      ParentAttachment.putParent(arg, term, null);
  }
  

  
  public static IStrategoTerm fixSDF(IStrategoTerm term, HybridInterpreter interp) throws IOException, InvalidParseTableException {
    IStrategoTerm result = null;
    try {
      result = sdf_desugar_0_0.instance.invoke(interp.getCompiledContext(), term);
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0 || result == null)
        throw new RuntimeException("Sdf desugaring failed", e);
    }
    
    return result;
  }
  
  public static List<IStrategoTerm> registerSemanticProvider(Collection<IStrategoTerm> editorServices, Path jarfile) throws IOException {
    String jarfilePath = jarfile.getAbsolutePath().replace("\\", "\\\\").replace("\"", "\\\"");
    IStrategoTerm semanticProvider = atermFromString("SemanticProvider(\"" + jarfilePath + "\")");
    
    List<IStrategoTerm> newServices = new ArrayList<IStrategoTerm>();
    
    for (IStrategoTerm service : editorServices)
    {
      if (ATermCommands.isApplication(service, "Builders")) {
        IStrategoTerm name = ATermCommands.getApplicationSubterm(service, "Builders", 0);
        IStrategoTerm builders = ATermCommands.getApplicationSubterm(service, "Builders", 1);
        if (ATermCommands.isList(builders)) {
          List<IStrategoTerm> builderList = new ArrayList<IStrategoTerm>();
          builderList.add(semanticProvider);
          builderList.addAll(getList(builders));
          builders = ATermCommands.makeList("SemanticRule*", builderList);
        }
        
        service = ATermCommands.makeAppl("Builders", "Section", 2, name, builders);
      }
      
      newServices.add(service);
    }
    
    return newServices;
  }

  public static void setErrorMessage(IStrategoTerm toplevelDecl, String msg) {
    IToken left = ImploderAttachment.getLeftToken(toplevelDecl);
    IToken right = ImploderAttachment.getRightToken(toplevelDecl);
    
    Path file = null;
    try {
      file = atermToFile(toplevelDecl);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    if (left == null || right == null)
      throw new IllegalStateException(msg + ": " + file);
    
    for (int i = left.getIndex(), max = right.getIndex(); i <= max; i++) {
      Token tok = ((Token) left.getTokenizer().getTokenAt(i));
      if (tok.getError() == null || tok.getError().isEmpty())
        tok.setError(msg);
      
      if (tok.getTokenizer().getInput().length() <= tok.getStartOffset() || tok.getTokenizer().getInput().charAt(tok.getStartOffset()) == '\n')
        break;
    }
  }

  public static IStrategoTerm makeMutable(IStrategoTerm term) {
    if (term.getStorageType() == IStrategoTerm.MUTABLE)
      return term;
    
    IStrategoTerm[] kids = new IStrategoTerm[term.getSubtermCount()];
    
    for (int i = 0; i < kids.length; i++)
      kids[i] = makeMutable(term.getSubterm(i));
    
    switch (term.getTermType()) {
      case IStrategoTerm.APPL :
        return factory.makeAppl(((IStrategoAppl) term).getConstructor(), kids, term.getAnnotations());
      case IStrategoTerm.LIST :
        return factory.makeList(kids, term.getAnnotations());
      case IStrategoTerm.INT :
        return factory.makeInt(((IStrategoInt) term).intValue());
      case IStrategoTerm.REAL :
        return factory.makeReal(((IStrategoReal) term).realValue());
      case IStrategoTerm.STRING :
        return factory.makeString(((IStrategoString) term).stringValue());
      case IStrategoTerm.CTOR :
        return factory.makeConstructor(((IStrategoConstructor) term).getName(), ((IStrategoConstructor) term).getArity());
      case IStrategoTerm.TUPLE :
        return factory.makeTuple(kids, term.getAnnotations());
      case IStrategoTerm.PLACEHOLDER :
        return factory.makePlaceholder(((IStrategoPlaceholder) term).getTemplate());
      default :
        throw new UnsupportedOperationException();
    }
  }


  public static IStrategoTerm pushAmbiguities(IStrategoTerm term) {
    if (isApplication(term, "amb") && term.getSubterm(0).isList() && term.getSubterm(0).getSubtermCount() == 2) {
      IStrategoTerm left = pushAmbiguities(term.getSubterm(0).getSubterm(0));
      IStrategoTerm right = pushAmbiguities(term.getSubterm(0).getSubterm(1));
      
      if (left.getTermType() == IStrategoTerm.APPL &&
          right.getTermType() == IStrategoTerm.APPL &&
          left.getSubtermCount() == right.getSubtermCount() &&
          ((IStrategoAppl) left).getConstructor().equals(((IStrategoAppl) right).getConstructor())) {
        
        IStrategoTerm[] ambKids = new IStrategoTerm[left.getSubtermCount()];
        
        for (int i = 0; i < left.getSubtermCount(); i++)
          ambKids[i] = makeAppl("amb", 
                                ImploderAttachment.getElementSort(left.getSubterm(i)), 
                                2, 
                                makeList(ImploderAttachment.getElementSort(term.getSubterm(0)), 
                                         left.getSubterm(i), right.getSubterm(i)));
        
        return makeAppl(
            ((IStrategoAppl) left).getConstructor().getName(), 
            ImploderAttachment.getElementSort(left),
            left.getSubtermCount(), 
            ambKids);
      }
      
      return term;
    }
    
    return term;
  }
}
