package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class prefix_fun_4_0 extends Strategy 
{ 
  public static prefix_fun_4_0 instance = new prefix_fun_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_28, Strategy j_28, Strategy k_28, Strategy l_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prefix_fun_4_0");
    Fail230:
    { 
      IStrategoTerm v_143 = null;
      IStrategoTerm q_143 = null;
      IStrategoTerm r_143 = null;
      IStrategoTerm t_143 = null;
      IStrategoTerm u_143 = null;
      IStrategoTerm w_143 = null;
      IStrategoTerm x_143 = null;
      IStrategoTerm z_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consprefix_fun_4 != ((IStrategoAppl)term).getConstructor())
        break Fail230;
      q_143 = term.getSubterm(0);
      r_143 = term.getSubterm(1);
      t_143 = term.getSubterm(2);
      u_143 = term.getSubterm(3);
      IStrategoList annos191 = term.getAnnotations();
      v_143 = annos191;
      term = i_28.invoke(context, q_143);
      if(term == null)
        break Fail230;
      w_143 = term;
      term = j_28.invoke(context, r_143);
      if(term == null)
        break Fail230;
      x_143 = term;
      term = k_28.invoke(context, t_143);
      if(term == null)
        break Fail230;
      z_143 = term;
      term = l_28.invoke(context, u_143);
      if(term == null)
        break Fail230;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consprefix_fun_4, new IStrategoTerm[]{w_143, x_143, z_143, term}), checkListAnnos(termFactory, v_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}