package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$T_3_0 extends Strategy 
{ 
  public static $Call$T_3_0 instance = new $Call$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_23, Strategy c_23, Strategy d_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallT_3_0");
    Fail123:
    { 
      IStrategoTerm u_122 = null;
      IStrategoTerm r_122 = null;
      IStrategoTerm s_122 = null;
      IStrategoTerm t_122 = null;
      IStrategoTerm v_122 = null;
      IStrategoTerm w_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      r_122 = term.getSubterm(0);
      s_122 = term.getSubterm(1);
      t_122 = term.getSubterm(2);
      IStrategoList annos97 = term.getAnnotations();
      u_122 = annos97;
      term = b_23.invoke(context, r_122);
      if(term == null)
        break Fail123;
      v_122 = term;
      term = c_23.invoke(context, s_122);
      if(term == null)
        break Fail123;
      w_122 = term;
      term = d_23.invoke(context, t_122);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consCallT_3, new IStrategoTerm[]{v_122, w_122, term}), checkListAnnos(termFactory, u_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}