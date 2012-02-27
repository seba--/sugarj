package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method_3_0 extends Strategy 
{ 
  public static $Method_3_0 instance = new $Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_15, Strategy p_15, Strategy q_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_3_0");
    Fail27:
    { 
      IStrategoTerm w_101 = null;
      IStrategoTerm t_101 = null;
      IStrategoTerm u_101 = null;
      IStrategoTerm v_101 = null;
      IStrategoTerm x_101 = null;
      IStrategoTerm y_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      t_101 = term.getSubterm(0);
      u_101 = term.getSubterm(1);
      v_101 = term.getSubterm(2);
      IStrategoList annos13 = term.getAnnotations();
      w_101 = annos13;
      term = o_15.invoke(context, t_101);
      if(term == null)
        break Fail27;
      x_101 = term;
      term = p_15.invoke(context, u_101);
      if(term == null)
        break Fail27;
      y_101 = term;
      term = q_15.invoke(context, v_101);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethod_3, new IStrategoTerm[]{x_101, y_101, term}), checkListAnnos(termFactory, w_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}