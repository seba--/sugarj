package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Scope_0_2 extends Strategy 
{ 
  public static smart_$Scope_0_2 instance = new smart_$Scope_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_261, IStrategoTerm ref_s_261)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_261 = new TermReference(ref_r_261);
    TermReference s_261 = new TermReference(ref_s_261);
    context.push("smart_Scope_0_2");
    Fail593:
    { 
      IStrategoTerm t_261 = null;
      IStrategoTerm d_262 = null;
      IStrategoTerm f_262 = null;
      term = extraction.constNil0;
      lifted363 lifted3630 = new lifted363();
      lifted3630.r_261 = r_261;
      lifted3630.s_261 = s_261;
      term = try_1_0.instance.invoke(context, term, lifted3630);
      if(term == null)
        break Fail593;
      t_261 = term;
      if(r_261.value == null || s_261.value == null)
        break Fail593;
      term = (IStrategoTerm)termFactory.makeListCons(r_261.value, termFactory.makeListCons(s_261.value, (IStrategoList)extraction.constNil0));
      d_262 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_262, NO_STRATEGIES, new IStrategoTerm[]{extraction.const545});
      if(term == null)
        break Fail593;
      f_262 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_261);
      if(term == null)
        break Fail593;
      term = put_syntax_sort_0_1.instance.invoke(context, f_262, term);
      if(term == null)
        break Fail593;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}