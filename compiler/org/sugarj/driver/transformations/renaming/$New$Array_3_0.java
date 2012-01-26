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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_15, Strategy d_15, Strategy e_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewArray_3_0");
    Fail29:
    { 
      IStrategoTerm b_102 = null;
      IStrategoTerm y_101 = null;
      IStrategoTerm z_101 = null;
      IStrategoTerm a_102 = null;
      IStrategoTerm c_102 = null;
      IStrategoTerm d_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNewArray_3 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      y_101 = term.getSubterm(0);
      z_101 = term.getSubterm(1);
      a_102 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      b_102 = annos20;
      term = c_15.invoke(context, y_101);
      if(term == null)
        break Fail29;
      c_102 = term;
      term = d_15.invoke(context, z_101);
      if(term == null)
        break Fail29;
      d_102 = term;
      term = e_15.invoke(context, a_102);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNewArray_3, new IStrategoTerm[]{c_102, d_102, term}), checkListAnnos(termFactory, b_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}