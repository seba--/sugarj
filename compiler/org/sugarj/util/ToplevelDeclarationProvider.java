package org.sugarj.util;

import java.io.IOException;
import java.text.ParseException;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;

/**
 * @author jp
 *
 */
public interface ToplevelDeclarationProvider {
  public IStrategoTerm getNextToplevelDecl(boolean recovery) throws IOException, ParseException, InvalidParseTableException, SGLRException;
  public void retract(IStrategoTerm term);
  public IStrategoTerm desugarToplevelDecl(IStrategoTerm term) throws TokenExpectedException, BadTokenException, IOException, InvalidParseTableException, SGLRException;
  public boolean hasNextToplevelDecl();
  public int getSourceHashCode();
}
