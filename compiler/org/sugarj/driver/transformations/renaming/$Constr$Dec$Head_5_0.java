package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Dec$Head_5_0 extends Strategy 
{ 
  public static $Constr$Dec$Head_5_0 instance = new $Constr$Dec$Head_5_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_23, Strategy q_23, Strategy r_23, Strategy s_23, Strategy t_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDecHead_5_0");
    Fail105:
    { 
      IStrategoTerm x_121 = null;
      IStrategoTerm q_121 = null;
      IStrategoTerm s_121 = null;
      IStrategoTerm t_121 = null;
      IStrategoTerm u_121 = null;
      IStrategoTerm w_121 = null;
      IStrategoTerm y_121 = null;
      IStrategoTerm z_121 = null;
      IStrategoTerm a_122 = null;
      IStrategoTerm b_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail105;
      q_121 = term.getSubterm(0);
      s_121 = term.getSubterm(1);
      t_121 = term.getSubterm(2);
      u_121 = term.getSubterm(3);
      w_121 = term.getSubterm(4);
      IStrategoList annos86 = term.getAnnotations();
      x_121 = annos86;
      term = p_23.invoke(context, q_121);
      if(term == null)
        break Fail105;
      y_121 = term;
      term = q_23.invoke(context, s_121);
      if(term == null)
        break Fail105;
      z_121 = term;
      term = r_23.invoke(context, t_121);
      if(term == null)
        break Fail105;
      a_122 = term;
      term = s_23.invoke(context, u_121);
      if(term == null)
        break Fail105;
      b_122 = term;
      term = t_23.invoke(context, w_121);
      if(term == null)
        break Fail105;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrDecHead_5, new IStrategoTerm[]{y_121, z_121, a_122, b_122, term}), checkListAnnos(termFactory, x_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}