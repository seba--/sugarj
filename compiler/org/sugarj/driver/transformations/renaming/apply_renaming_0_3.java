package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class apply_renaming_0_3 extends Strategy 
{ 
  public static apply_renaming_0_3 instance = new apply_renaming_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_23, IStrategoTerm ref_s_23, IStrategoTerm ref_t_23)
  { 
    TermReference r_23 = new TermReference(ref_r_23);
    TermReference s_23 = new TermReference(ref_s_23);
    TermReference t_23 = new TermReference(ref_t_23);
    context.push("apply_renaming_0_3");
    Fail6:
    { 
      lifted5 lifted50 = new lifted5();
      lifted50.r_23 = r_23;
      lifted50.s_23 = s_23;
      lifted50.t_23 = t_23;
      term = topdown_1_0.instance.invoke(context, term, lifted50);
      if(term == null)
        break Fail6;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}