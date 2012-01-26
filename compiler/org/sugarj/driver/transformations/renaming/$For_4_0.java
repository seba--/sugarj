package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $For_4_0 extends Strategy 
{ 
  public static $For_4_0 instance = new $For_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_19, Strategy q_19, Strategy r_19, Strategy s_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("For_4_0");
    Fail80:
    { 
      IStrategoTerm x_113 = null;
      IStrategoTerm t_113 = null;
      IStrategoTerm u_113 = null;
      IStrategoTerm v_113 = null;
      IStrategoTerm w_113 = null;
      IStrategoTerm y_113 = null;
      IStrategoTerm z_113 = null;
      IStrategoTerm a_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFor_4 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      t_113 = term.getSubterm(0);
      u_113 = term.getSubterm(1);
      v_113 = term.getSubterm(2);
      w_113 = term.getSubterm(3);
      IStrategoList annos68 = term.getAnnotations();
      x_113 = annos68;
      term = p_19.invoke(context, t_113);
      if(term == null)
        break Fail80;
      y_113 = term;
      term = q_19.invoke(context, u_113);
      if(term == null)
        break Fail80;
      z_113 = term;
      term = r_19.invoke(context, v_113);
      if(term == null)
        break Fail80;
      a_114 = term;
      term = s_19.invoke(context, w_113);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFor_4, new IStrategoTerm[]{y_113, z_113, a_114, term}), checkListAnnos(termFactory, x_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}