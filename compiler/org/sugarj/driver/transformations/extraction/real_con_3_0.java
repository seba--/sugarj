package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class real_con_3_0 extends Strategy 
{ 
  public static real_con_3_0 instance = new real_con_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_351, Strategy v_351, Strategy w_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("real_con_3_0");
    Fail1065:
    { 
      IStrategoTerm z_470 = null;
      IStrategoTerm w_470 = null;
      IStrategoTerm x_470 = null;
      IStrategoTerm y_470 = null;
      IStrategoTerm a_471 = null;
      IStrategoTerm b_471 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consreal_con_3 != ((IStrategoAppl)term).getConstructor())
        break Fail1065;
      w_470 = term.getSubterm(0);
      x_470 = term.getSubterm(1);
      y_470 = term.getSubterm(2);
      IStrategoList annos290 = term.getAnnotations();
      z_470 = annos290;
      term = u_351.invoke(context, w_470);
      if(term == null)
        break Fail1065;
      a_471 = term;
      term = v_351.invoke(context, x_470);
      if(term == null)
        break Fail1065;
      b_471 = term;
      term = w_351.invoke(context, y_470);
      if(term == null)
        break Fail1065;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consreal_con_3, new IStrategoTerm[]{a_471, b_471, term}), checkListAnnos(termFactory, z_470));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}