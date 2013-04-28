package org.sugarj.common.typesmart;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;

/**
 * Looks up a typesmart sort attachment.
 * 
 * @author seba
 */
public class GetTypesmartSort extends AbstractPrimitive {

  public GetTypesmartSort() {
    super("SUGARJ_get_typesmart_sort", 0, 0);
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    IStrategoTerm term = context.current();
    IStrategoTerm sort = TypesmartSortAttachment.getSort(term);
    if (sort == null)
      return false;
    context.setCurrent(sort);
    return true;
  }
  
}