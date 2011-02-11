package org.sugarj.driver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.terms.StrategoListIterator;
import org.spoofax.terms.TermFactory;
import org.spoofax.terms.io.TAFTermReader;
import org.strategoxt.lang.StrategoExit;
import org.sugarj.driver.transformations.extractSdf;
import org.sugarj.driver.transformations.extractStr;
import org.sugarj.driver.transformations.sdf_desugar;

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
  
  public static TermFactory factory = new TermFactory();

  public static IStrategoTerm atermFromFile(String filename) throws IOException {
    return new TAFTermReader(factory).parseFromFile(filename);
  }
  
  public static IStrategoTerm atermFromString(String s) throws IOException {
    return factory.parseFromString(s);
  }

  public static void atermToFile(IStrategoTerm aterm, String filename)
      throws IOException {
    FileOutputStream os = new FileOutputStream(filename);
    os.write(aterm.toString().getBytes());
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
}
