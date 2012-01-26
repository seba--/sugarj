package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $New$Instance_4_0 extends Strategy 
{ 
  public static $New$Instance_4_0 instance = new $New$Instance_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_24, Strategy f_24, Strategy g_24, Strategy h_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewInstance_4_0");
    Fail145:
    { 
      IStrategoTerm u_126 = null;
      IStrategoTerm q_126 = null;
      IStrategoTerm r_126 = null;
      IStrategoTerm s_126 = null;
      IStrategoTerm t_126 = null;
      IStrategoTerm v_126 = null;
      IStrategoTerm w_126 = null;
      IStrategoTerm x_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNewInstance_4 != ((IStrategoAppl)term).getConstructor())
        break Fail145;
      q_126 = term.getSubterm(0);
      r_126 = term.getSubterm(1);
      s_126 = term.getSubterm(2);
      t_126 = term.getSubterm(3);
      IStrategoList annos130 = term.getAnnotations();
      u_126 = annos130;
      term = e_24.invoke(context, q_126);
      if(term == null)
        break Fail145;
      v_126 = term;
      term = f_24.invoke(context, r_126);
      if(term == null)
        break Fail145;
      w_126 = term;
      term = g_24.invoke(context, s_126);
      if(term == null)
        break Fail145;
      x_126 = term;
      term = h_24.invoke(context, t_126);
      if(term == null)
        break Fail145;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNewInstance_4, new IStrategoTerm[]{v_126, w_126, x_126, term}), checkListAnnos(termFactory, u_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}