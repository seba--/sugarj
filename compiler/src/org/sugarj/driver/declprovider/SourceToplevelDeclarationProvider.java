package org.sugarj.driver.declprovider;

import static org.sugarj.common.Log.log;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.TimeoutException;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.FilterException;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.SGLR;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.strategoxt.lang.StrategoException;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.Path;
import org.sugarj.driver.Driver;
import org.sugarj.driver.IncrementalParseResult;
import org.sugarj.driver.RetractableTokenizer;
import org.sugarj.driver.RetractableTreeBuilder;
import org.sugarj.util.Pair;

public class SourceToplevelDeclarationProvider implements ToplevelDeclarationProvider {

  private Driver driver;
  private String lastRemainingInput;
  private String remainingInput;
  private final int hash;
  private RetractableTreeBuilder treeBuilder;

  public SourceToplevelDeclarationProvider(Driver driver, String source) {
    this.driver = driver;
    this.remainingInput = source;
    this.treeBuilder = new RetractableTreeBuilder();
    hash = source.hashCode();
    // XXX need to load ANY parse table, preferably an empty one.
  }

  @Override
  public IStrategoTerm getNextToplevelDecl(boolean recovery, boolean lookahead) throws IOException, ParseException, InvalidParseTableException, SGLRException {
    IncrementalParseResult parseResult = parseNextToplevelDeclaration(remainingInput, recovery, lookahead);
    lastRemainingInput = remainingInput;
    remainingInput = parseResult.getRest();
    return parseResult.getToplevelDecl();
  }

  private IncrementalParseResult parseNextToplevelDeclaration(String input, boolean recovery, boolean lookahead)
      throws IOException, ParseException, InvalidParseTableException, TokenExpectedException, SGLRException {
    int start = treeBuilder.getTokenizer() == null ? 0 : treeBuilder.getTokenizer().getStartOffset();
    log.beginTask("parsing", "PARSE next toplevel declaration.", Log.CORE);
    try {
      Pair<IStrategoTerm, Integer> parseResult = null;
      
      try {
        parseResult = driver.currentParse(input, treeBuilder, recovery);
      } catch (SGLRException e) {
        if (e.getCause() instanceof TimeoutException)
          parseResult = driver.currentParse(input, treeBuilder, false);
        
        if (parseResult == null)
          throw e;
      }

      if (parseResult == null || parseResult.a == null)
        throw new ParseException("could not parse toplevel declaration in:\n" + input, -1);

      IStrategoTerm toplevelDecl = parseResult.a;
      String rest = input.substring(Math.min(parseResult.b, input.length()));

      if (input.equals(rest))
        if (driver.getParser().getCollectedErrors().isEmpty())
          throw new SGLRException(driver.getParser(), "empty toplevel declaration parse rule");
        else
          throw driver.getParser().getCollectedErrors().iterator().next();
      
//      try {
//        if (!rest.isEmpty())
//          inputTreeBuilder.retract(restTerm);
//      } catch (Throwable t) {
//        t.printStackTrace();
//      }
      
      Path tmpFile = FileCommands.newTempFile("aterm");
      FileCommands.writeToFile(tmpFile, toplevelDecl.toString());
      log.log("next toplevel declaration parsed: " + tmpFile, Log.PARSE);

      return new IncrementalParseResult(toplevelDecl, rest);
    } catch (Exception e) {
//      if (!recovery)
//        throw new SGLRException(driver.getParser(), "parsing failed", e);
      
      String msg = e.getClass().getName() + " " + e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.toString();
      
      if (!(e instanceof StrategoException) && !(e instanceof ParseException) && (!(e instanceof SGLRException) || (e instanceof FilterException)))
        e.printStackTrace();
      else
        log.logErr(msg, Log.DETAIL);
      
      if (!treeBuilder.isInitialized()) {
    	  SGLR parser = driver.getParser();
    	  if (parser == null && (e instanceof SGLRException))
    	    parser = ((SGLRException) e).getParser();
    	  if (parser == null)
    		  return new IncrementalParseResult(ATermCommands.factory.makeString(input), "");
        treeBuilder.initializeTable(parser.getParseTable(), 0, 0, 0);
        treeBuilder.initializeInput(input, null);
      }
      else if (treeBuilder.getTokenizer().getStartOffset() > start) {
        IToken token = treeBuilder.getTokenizer().getTokenAtOffset(start);
        ((RetractableTokenizer) treeBuilder.getTokenizer()).retractTo(token.getIndex());
        treeBuilder.setOffset(start);
      }
      
      IToken right = treeBuilder.getTokenizer().makeToken(start + input.length() - 1, IToken.TK_STRING, true);
      IToken left = treeBuilder.getTokenizer().getTokenAtOffset(start);
      treeBuilder.getTokenizer().makeToken(treeBuilder.getTokenizer().getStartOffset() - 1, IToken.TK_EOF, true);
      IStrategoTerm term = ATermCommands.factory.makeString(input);
      ImploderAttachment.putImploderAttachment(term, false, "String", left, right);
      if (!lookahead)
        driver.setErrorMessage(term, msg);
      return new IncrementalParseResult(term, "");
    } finally {
      log.endTask();
    }
  }

  @Override
  public void retract(IStrategoTerm term) {
    if (lastRemainingInput == null)
      throw new IllegalStateException("cannot retract now");

    if (term != null) {
      remainingInput = lastRemainingInput;
      lastRemainingInput = null;
      treeBuilder.retract(term);
    }
  }

  @Override
  public boolean hasNextToplevelDecl() {
    return !remainingInput.isEmpty();
  }

  @Override
  public int getSourceHashCode() {
    return hash;
  }

  @Override
  public IToken getStartToken() {
    if (treeBuilder != null && treeBuilder.getTokenizer() != null)
      return treeBuilder.getTokenizer().getTokenAt(0);
    return null;
  }

}