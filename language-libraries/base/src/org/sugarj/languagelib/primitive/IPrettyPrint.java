package org.sugarj.languagelib.primitive;

import org.spoofax.interpreter.terms.IStrategoTerm;

/**
 * Interface for pretty printing an aterm.
 * 
 * @author seba
 *
 */
public interface IPrettyPrint {
  public String prettyPrint(IStrategoTerm t);
}
