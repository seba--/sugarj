package org.sugarj.driver;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.spoofax.jsglr.InvalidParseTableException;
import org.strategoxt.lang.StrategoExit;
import org.sugarj.driver.transformations.extractSdf;
import org.sugarj.driver.transformations.extractStr;
import org.sugarj.driver.transformations.sdf_desugar;

import aterm.ATerm;
import aterm.ATermFactory;
import aterm.pure.PureFactory;

public class ATermCommands {
  
  public static class MatchError extends Error {
    private final ATerm scrutinee;
    private final ATerm lowlevelPattern;
    private final String highlevelPattern;
    
    public MatchError(ATerm scrutinee, ATerm lowlevelPattern, String highlevelPattern) {
      super("Error while matching against " + highlevelPattern);
      
      this.scrutinee = scrutinee;
      this.lowlevelPattern = lowlevelPattern;
      this.highlevelPattern = highlevelPattern;
    }

    public ATerm getScrutinee() {
      return scrutinee;
    }

    public ATerm getLowlevelPattern() {
      return lowlevelPattern;
    }

    public String getHighlevelPattern() {
      return highlevelPattern;
    }
  }
  
  public static ATermFactory factory = new PureFactory();

  public static ATerm atermFromFile(String filename) throws IOException {
    return factory.readFromFile(filename);
  }
  
  public static ATerm atermFromString(String s) throws IOException {
    return factory.parse(s);
  }

  public static void atermToFile(ATerm aterm, String filename)
      throws IOException {
    FileOutputStream os = new FileOutputStream(filename);
    os.write(aterm.toString().getBytes());
  }

  public static ATerm splitToplevel(ATerm aterm) {
    return extractTerm(aterm, "NextToplevelDeclaration(?, _)");
  }

  public static String splitRest(ATerm aterm) {
    return extractString(aterm, "NextToplevelDeclaration(_, ?)");
  }
  
  public static String extractString(ATerm term, String pattern) {
    return (String) extract(term, pattern, "str");
  }

  public static ATerm extractTerm(ATerm term, String pattern) {
    return (ATerm) extract(term, pattern, "term");
  }
  
  public static String extractJava(ATerm term, String pattern) throws IOException {
    return SDFCommands.prettyPrintJavaTerm(extractTerm(term, pattern));
  }
  
  public static boolean match(ATerm term, String pattern) {
    ATermFactory factory = term.getFactory();
	  String converted = convertPattern(pattern, "term");
	  ATerm parsed = factory.parse(converted);
	  
	  return term.match(parsed) != null;
  }

  @SuppressWarnings("unchecked")
  private static Object extract(ATerm term, String pattern, String type) {
    ATermFactory factory = term.getFactory();
    String converted = convertPattern(pattern, type);
    ATerm parsed = factory.parse(converted);
    int index = countUnderscores(pattern);

    List l = term.match(parsed);
    
    if (l == null || index >= l.size())
      throw new MatchError(term, parsed, pattern);
    
    return l.get(index);
  }
  
  public static ATerm injectTerms(String pattern, ATerm... terms) {
    List<ATerm> l = new ArrayList<ATerm>();
    
    for (ATerm t : terms)
      l.add(t);
    
    return factory.make(convertPattern(pattern, "term"), l);
  }

  private static String convertPattern(String pattern, String type) {
    return pattern.replace("_", "<term>").replace("?", "<" + type + ">");
  }

  private static int countUnderscores(String pattern) {
    return pattern.substring(0, pattern.indexOf('?')).split("_").length - 1;
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
