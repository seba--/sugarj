package org.sugarj.driver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.terms.StrategoListIterator;
import org.spoofax.terms.attachments.ParentAttachment;
import org.spoofax.terms.attachments.ParentTermFactory;
import org.spoofax.terms.io.TAFTermReader;
import org.strategoxt.imp.runtime.Environment;
import org.strategoxt.lang.StrategoExit;
import org.sugarj.driver.transformations.extractSdf;
import org.sugarj.driver.transformations.extractStr;
import org.sugarj.driver.transformations.sdf_desugar;

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
      super("Error while matching " + kind);
      
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
  
  public static ITermFactory factory = new ParentTermFactory(Environment.getTermFactory());

  public static IStrategoTerm atermFromFile(String filename) throws IOException {
    IStrategoTerm term = org.sugarj.driver.Environment.terms.get(filename);
    
    if (term != null)
      return term;
    
    return new TAFTermReader(factory).parseFromFile(filename);
  }
  
  public static IStrategoTerm atermFromString(String s) throws IOException {
    return factory.parseFromString(s);
  }

  public static void atermToFile(IStrategoTerm aterm, String filename)
      throws IOException {
    org.sugarj.driver.Environment.terms.put(filename, aterm);

    FileWriter writer = new FileWriter(new File(filename));
    aterm.writeAsString(writer, Integer.MAX_VALUE);
    writer.close();
  }

  public static boolean isApplication(IStrategoTerm term, String cons) {
    return term.getTermType() == IStrategoTerm.APPL &&
           ((IStrategoAppl) term).getConstructor().getName().equals(cons);
  }
  
  public static IStrategoTerm getApplicationSubterm(IStrategoTerm term, String cons, int index) {
    if (isApplication(term, cons))
      return term.getSubterm(index);
    
    throw new MatchError(term, "application", cons);
  }
  
  public static String getString(IStrategoTerm term) {
    if (term.getTermType() == IStrategoTerm.STRING)
      return ((IStrategoString) term).stringValue();
    
    throw new MatchError(term, "string");
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
    return factory.makeTuple(ts);
  }
  
  public static IStrategoTerm makeSome(IStrategoTerm term, IToken noneToken) {
    if (term != null)
      return makeAppl("Some", "Some", 1, noneToken, term);
    
    return makeAppl("None", "Some", 0, noneToken);
  }
  
  public static IStrategoList makeList(String sort, IToken emptyListToken, IStrategoTerm... ts) {
    IStrategoList term = factory.makeList(ts);
    
    setAttachment(term, sort, emptyListToken, ts);
    return term;
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
      left = emptyToken;
      right = emptyToken;
    }
    else {
      left = ImploderAttachment.getLeftToken(children[0]);
      right = ImploderAttachment.getRightToken(children[children.length - 1]);
    }
    
    ImploderAttachment.putImploderAttachment(
        term,
        false,
        sort, 
        left,
        right);
    
    
    for (IStrategoTerm arg : children)
      ParentAttachment.putParent(arg, term, null);
  }
  
  /**
   * Filters SDF statements from the given term and
   * compiles assimilation statements to SDF.
   * 
   * @param term a file containing a list of SDF 
   *             and Stratego statements.
   * @param sdf result file
   * @throws InvalidParseTableException 
   */
  public static void extractSDF(String term, String sdf) throws IOException, InvalidParseTableException {
    try {
      extractSdf.mainNoExit("-i", term, "-o", sdf);
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0)
        throw new RuntimeException("Sdf extraction failed", e);
    }
    // STRCommands.assimilate(STRCommands.getExtractSDFProg(), term, sdf);
  }
  
  /**
   * Filters Stratego statements from the given term
   * and compiles assimilation statements to Stratego.
   * 
   * @param term a file containing a list of SDF 
   *             and Stratego statements.
   * @param str result file
   * @throws InvalidParseTableException 
   */
  public static void extractSTR(String term, String str) throws IOException, InvalidParseTableException {
    try {
      extractStr.mainNoExit("-i", term, "-o", str);
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0)
        throw new RuntimeException("Stratego extraction failed", e);
    }
    // STRCommands.assimilate(STRCommands.getExtractSTRProg(), term, str);
  }
  
  public static void fixSDF(String term, String fixed) throws IOException, InvalidParseTableException {
    try {
      sdf_desugar.mainNoExit("-i", term, "-o", fixed);
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0)
        throw new RuntimeException("Sdf desugaring failed", e);
    }
    // STRCommands.assimilate(STRCommands.getSDFDesugarProg(), term, fixed);
  }
  
  
  public static Collection<String> extractModuleNames(IStrategoTerm term) {
    if (term.getTermType() != IStrategoTerm.LIST)
      return null;
    
    Collection<String> names = new ArrayList<String>();
    IStrategoList list = (IStrategoList) term;
    
    while (!list.isEmpty())
    {
      IStrategoTerm listEntry = list.head();
      if (listEntry.getTermType() != IStrategoTerm.LIST)
        throw new IllegalStateException("unexpected term type in imports " + list);

      list = list.tail();
      IStrategoList imports = (IStrategoList) listEntry;
      
      while (!imports.isEmpty()) {
        IStrategoTerm module = imports.head();
        imports = imports.tail();
        
        IStrategoTerm unparameterized = getApplicationSubterm(module, "module", 0);
        IStrategoTerm moduleName = getApplicationSubterm(unparameterized, "unparameterized", 0);
        names.add(getString(moduleName));
      }
    }
    
    return names;
  }
}
