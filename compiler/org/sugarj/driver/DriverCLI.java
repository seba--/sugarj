package org.sugarj.driver;

import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getLeftToken;
import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getRightToken;
import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getTokenizer;
import static org.spoofax.terms.Term.tryGetConstructor;
import static org.sugarj.driver.Log.log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.MultiBadTokenException;
import org.spoofax.jsglr.client.ParseTimeoutException;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.ITokenizer;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.jsglr.client.imploder.Token;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.spoofax.terms.TermVisitor;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.runtime.Environment;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 *
 */
public class DriverCLI {
  
  private static class Error {
    public String msg;
    public int lineStart;
    public int lineEnd;
    public int columnStart;
    public int columEnd;
    
    Error(String msg, IToken left, IToken right) {
      this.msg = msg;
      this.lineStart = left.getLine();
      this.columnStart = left.getColumn();
      this.lineEnd = right.getLine();
      this.columEnd = right.getColumn();
    }
    
    /**
     * start of file error
     * @param msg
     */
    Error(String msg) {
      this.msg = msg;
      this.lineStart = 0;
      this.columnStart = 0;
      this.lineEnd = 0;
      this.columEnd = 0;
    }
  }
  
  static void processResultCLI(Result res, String file, String project) throws IOException {
    log.log("");
    
    for (BadTokenException e : res.getCollectedErrors())
      log.log("syntax error: line " + e.getLineNumber() + " column " + e.getColumnNumber() + ": " + e.getMessage());
    
    IToken tok = ImploderAttachment.getRightToken(res.getSugaredSyntaxTree());
    
    IStrategoTerm tuple = ATermCommands.makeTuple(
        tok,
        res.getSugaredSyntaxTree(), 
        ATermCommands.makeString(file, tok), 
        ATermCommands.makeString(project, tok));
    
    List<Error> errors = gatherNonFatalErrors(res.getSugaredSyntaxTree());
    
    for (Error error : errors)
      log.log("error: line " + error.lineStart + " column " + error.columnStart + " to line " + error.lineEnd + " column " + error.columEnd + ":\n  " + error.msg);
    
    IStrategoTerm errorTree = STRCommands.assimilate("sugarj-analyze", res.getDesugaringsFile(), tuple, new HybridInterpreter());
    
    assert errorTree.getTermType() == IStrategoTerm.TUPLE && errorTree.getSubtermCount() == 4 :
      "error in sugarj-analyze, did not return tuple with 4 elements";
    
    IStrategoList semErrors = Tools.termAt(errorTree, 1);
    IStrategoList warnings = Tools.termAt(errorTree, 2);
    IStrategoList notes = Tools.termAt(errorTree, 3);
    
    
    for (IStrategoTerm error : semErrors.getAllSubterms())
      if (error.getTermType() == IStrategoTerm.LIST)
        for (IStrategoTerm deepError : error.getAllSubterms())
          reportCLI(deepError, "error");
      else
        reportCLI(error, "error");
    for (IStrategoTerm warning : warnings.getAllSubterms())
      if (warning.getTermType() == IStrategoTerm.LIST)
        for (IStrategoTerm deepWarning : warning.getAllSubterms())
          reportCLI(deepWarning, "warning");
      else
        reportCLI(warning, "warning");
    for (IStrategoTerm note : notes.getAllSubterms())
      if (note.getTermType() == IStrategoTerm.LIST)
        for (IStrategoTerm deepNote : note.getAllSubterms())
          reportCLI(deepNote, "note");
      else
        reportCLI(note, "note");
    
    System.out.println(ATermCommands.atermToFile(errorTree));
  }
  
  private static void reportCLI(IStrategoTerm pairOrList, String kind) throws IOException {
    assert pairOrList.getTermType() == IStrategoTerm.TUPLE && pairOrList.getSubtermCount() == 2;
    
    IStrategoTerm term = Tools.termAt(pairOrList, 0);
    IStrategoString msg = Tools.termAt(pairOrList, 1);
    
    IToken left = ImploderAttachment.getLeftToken(term);
    IToken right = ImploderAttachment.getRightToken(term);
    
    if (left == null && right != null)
      left = right;
    else if (left != null && right == null)
      right = left;
    
    if (left == null || right == null)
      log.log("error: " + msg + "\n  in tree " + ATermCommands.atermToFile(term));
    else
      log.log("error: line " + left.getLine() + " column " + left.getColumn() + " to line " + right.getLine() + " column " + right.getColumn() + ":\n  " + msg);
  }
  
  
  
  /**
   * Report WATER + INSERT errors from parse tree
   */
  private static List<Error> gatherNonFatalErrors(IStrategoTerm top) {
    List<Error> errors = new ArrayList<Error>();
    ITokenizer tokenizer = getTokenizer(top);
    for (int i = 0, max = tokenizer.getTokenCount(); i < max; i++) {
      IToken token = tokenizer.getTokenAt(i);
      String error = token.getError();
      if (error != null) {
        if (error == ITokenizer.ERROR_SKIPPED_REGION) {
          i = findRightMostWithSameError(token, null);
          reportSkippedRegion(token, tokenizer.getTokenAt(i), errors);
        } else if (error.startsWith(ITokenizer.ERROR_WARNING_PREFIX)) {
          i = findRightMostWithSameError(token, null);
          reportWarningAtTokens(token, tokenizer.getTokenAt(i), error, errors);
        } else if (error.startsWith(ITokenizer.ERROR_WATER_PREFIX)) {
          i = findRightMostWithSameError(token, ITokenizer.ERROR_WATER_PREFIX);
          reportErrorAtTokens(token, tokenizer.getTokenAt(i), error, errors);
        } else {
          i = findRightMostWithSameError(token, null);
          // UNDONE: won't work for multi-token errors (as seen in SugarJ)
          reportErrorAtTokens(token, tokenizer.getTokenAt(i), error, errors);
        }
      }
    }
    gatherAmbiguities(top, errors);
    
    return errors;
  }

  private static int findRightMostWithSameError(IToken token, String prefix) {
    String expectedError = token.getError();
    ITokenizer tokenizer = token.getTokenizer();
    int i = token.getIndex();
    for (int max = tokenizer.getTokenCount(); i + 1 < max; i++) {
      String error = tokenizer.getTokenAt(i + 1).getError();
      if (error != expectedError
          && (error == null || prefix == null || !error.startsWith(prefix)))
        break;
    }
    return i;
  }

  
  private static final IStrategoConstructor ambCons = Environment.getTermFactory().makeConstructor("amb", 1);
  
    /**
     * Report recoverable errors (e.g., inserted brackets).
     * 
     * @param outerBeginOffset  The begin offset of the enclosing construct.
     */
  private static void gatherAmbiguities(IStrategoTerm term, final List<Error> errors) {
    new TermVisitor() {
      IStrategoTerm ambStart;
      
      public void preVisit(IStrategoTerm term) {
        if (ambStart == null && ambCons == tryGetConstructor(term)) {
          reportAmbiguity(term, errors);
          ambStart = term;
        }
      }
      
      @Override
      public void postVisit(IStrategoTerm term) {
        if (term == ambStart) ambStart = null;
      }
    }.visit(term);
  }
  
  private static void reportAmbiguity(IStrategoTerm amb, List<Error> errors) {
    reportWarningAtTokens(getLeftToken(amb), getRightToken(amb),
        "Fragment is ambiguous", errors);
  }
  

  private static void reportSkippedRegion(IToken left, IToken right, List<Error> errors) {
    // Report entire region
    reportErrorAtTokens(left, right, ITokenizer.ERROR_SKIPPED_REGION, errors);
  }


  private static void reportTokenExpected(ITokenizer tokenizer, TokenExpectedException exception, List<Error> errors) {
    String message = exception.getShortMessage();
    reportErrorNearOffset(tokenizer, exception.getOffset(), message, errors);
  }
  
  private static void reportBadToken(ITokenizer tokenizer, BadTokenException exception, List<Error> errors) {
    String message;
    if (exception.isEOFToken() || tokenizer.getTokenCount() <= 1) {
      message = exception.getShortMessage();
    } else {
      IToken token = tokenizer.getTokenAtOffset(exception.getOffset());
      token = findNextNonEmptyToken(token);
      message = ITokenizer.ERROR_WATER_PREFIX + ": " + token.toString().trim();
    }
    reportErrorNearOffset(tokenizer, exception.getOffset(), message, errors);
  }
  
  private static void reportMultiBadToken(ITokenizer tokenizer, MultiBadTokenException exception, List<Error> errors) {
    for (BadTokenException e : exception.getCauses()) {
      reportException(tokenizer, e, errors); // use double dispatch
    }
  }
  
  private static void reportTimeOut(ITokenizer tokenizer, ParseTimeoutException exception, List<Error> errors) {
    String message = "Internal parsing error: " + exception.getMessage();
    reportErrorAtFirstLine(message, errors);
    reportMultiBadToken(tokenizer, exception, errors);
  }
  
  private static void reportException(ITokenizer tokenizer, Exception exception, List<Error> errors) {
    try {
      throw exception;
    } catch (ParseTimeoutException e) {
      reportTimeOut(tokenizer, (ParseTimeoutException) exception, errors);
    } catch (TokenExpectedException e) {
      reportTokenExpected(tokenizer, (TokenExpectedException) exception, errors);
    } catch (MultiBadTokenException e) {
      reportMultiBadToken(tokenizer, (MultiBadTokenException) exception, errors);
    } catch (BadTokenException e) {
      reportBadToken(tokenizer, (BadTokenException) exception, errors);
    } catch (Exception e) {
      String message = "Internal parsing error: " + exception;
      reportErrorAtFirstLine(message, errors);
    }
  }

  private static void reportErrorNearOffset(ITokenizer tokenizer, int offset, String message, List<Error> errors) {
    IToken errorToken = tokenizer.getErrorTokenOrAdjunct(offset);
    reportErrorAtTokens(errorToken, errorToken, message, errors);
  }
   
  private static IToken findNextNonEmptyToken(IToken token) {
    ITokenizer tokenizer = token.getTokenizer();
    IToken result = null;
    for (int i = token.getIndex(), max = tokenizer.getTokenCount(); i < max; i++) {
      result = tokenizer.getTokenAt(i);
      if (result.getLength() != 0 && !Token.isWhiteSpace(result)) break;
    }
    return result;
  }
  
  private static void reportErrorAtTokens(final IToken left, final IToken right, String message, List<Error> errors) {
    if (left.getStartOffset() > right.getEndOffset()) {
      reportErrorNearOffset(left.getTokenizer(), left.getStartOffset(), message, errors);
    } else {
      errors.add(new Error(message, left, right));
    }
  }
  
  private static void reportWarningAtTokens(final IToken left, final IToken right, final String message, List<Error> errors) {
    errors.add(new Error(message, left, right));
  }
  
  private static void reportErrorAtFirstLine(String message, List<Error> errors) {
    errors.add(new Error(message));
  }
}
