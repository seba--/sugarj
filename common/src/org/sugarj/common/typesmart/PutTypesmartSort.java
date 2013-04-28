package org.sugarj.common.typesmart;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;

/**
 * Stores a typesmart sort attachment.
 * 
 * @author seba
 */
public class PutTypesmartSort extends AbstractPrimitive {

  public PutTypesmartSort() {
    super("SUGARJ_put_typesmart_sort", 0, 1);
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    IStrategoTerm term = context.current();
    TypesmartSortAttachment.put(term, tvars[0]);
    return true;
  }
  
}