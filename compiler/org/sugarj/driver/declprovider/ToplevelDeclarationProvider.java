package org.sugarj.driver.declprovider;

import java.io.IOException;
import java.text.ParseException;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr_layout.client.InvalidParseTableException;
import org.spoofax.jsglr_layout.client.imploder.IToken;
import org.spoofax.jsglr_layout.shared.SGLRException;

/**
 * @author jp
 * @author seba
 */
public interface ToplevelDeclarationProvider {
  public IStrategoTerm getNextToplevelDecl(boolean recovery) throws IOException, ParseException, InvalidParseTableException, SGLRException;
  public void retract(IStrategoTerm term);
  public boolean hasNextToplevelDecl();
  public int getSourceHashCode();
  public IToken getStartToken();
}
