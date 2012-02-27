package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $New$Array_3_0 extends Strategy 
{ 
  public static $New$Array_3_0 instance = new $New$Array_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_15, Strategy a_16, Strategy b_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewArray_3_0");
    Fail34:
    { 
      IStrategoTerm z_102 = null;
      IStrategoTerm w_102 = null;
      IStrategoTerm x_102 = null;
      IStrategoTerm y_102 = null;
      IStrategoTerm a_103 = null;
      IStrategoTerm b_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNewArray_3 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      w_102 = term.getSubterm(0);
      x_102 = term.getSubterm(1);
      y_102 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      z_102 = annos20;
      term = z_15.invoke(context, w_102);
      if(term == null)
        break Fail34;
      a_103 = term;
      term = a_16.invoke(context, x_102);
      if(term == null)
        break Fail34;
      b_103 = term;
      term = b_16.invoke(context, y_102);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNewArray_3, new IStrategoTerm[]{a_103, b_103, term}), checkListAnnos(termFactory, z_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}