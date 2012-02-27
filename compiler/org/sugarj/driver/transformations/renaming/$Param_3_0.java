package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Param_3_0 extends Strategy 
{ 
  public static $Param_3_0 instance = new $Param_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_18, Strategy a_19, Strategy b_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Param_3_0");
    Fail66:
    { 
      IStrategoTerm s_110 = null;
      IStrategoTerm p_110 = null;
      IStrategoTerm q_110 = null;
      IStrategoTerm r_110 = null;
      IStrategoTerm t_110 = null;
      IStrategoTerm u_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      p_110 = term.getSubterm(0);
      q_110 = term.getSubterm(1);
      r_110 = term.getSubterm(2);
      IStrategoList annos51 = term.getAnnotations();
      s_110 = annos51;
      term = z_18.invoke(context, p_110);
      if(term == null)
        break Fail66;
      t_110 = term;
      term = a_19.invoke(context, q_110);
      if(term == null)
        break Fail66;
      u_110 = term;
      term = b_19.invoke(context, r_110);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consParam_3, new IStrategoTerm[]{t_110, u_110, term}), checkListAnnos(termFactory, s_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}