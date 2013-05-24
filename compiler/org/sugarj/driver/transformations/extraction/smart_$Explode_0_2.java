package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Explode_0_2 extends Strategy 
{ 
  public static smart_$Explode_0_2 instance = new smart_$Explode_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_236, IStrategoTerm ref_j_236)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_236 = new TermReference(ref_i_236);
    TermReference j_236 = new TermReference(ref_j_236);
    context.push("smart_Explode_0_2");
    Fail553:
    { 
      IStrategoTerm k_236 = null;
      IStrategoTerm n_237 = null;
      IStrategoTerm p_237 = null;
      term = extraction.constNil0;
      lifted316 lifted3160 = new lifted316();
      lifted3160.i_236 = i_236;
      lifted3160.j_236 = j_236;
      term = try_1_0.instance.invoke(context, term, lifted3160);
      if(term == null)
        break Fail553;
      lifted317 lifted3170 = new lifted317();
      lifted3170.i_236 = i_236;
      lifted3170.j_236 = j_236;
      term = try_1_0.instance.invoke(context, term, lifted3170);
      if(term == null)
        break Fail553;
      lifted318 lifted3180 = new lifted318();
      lifted3180.i_236 = i_236;
      lifted3180.j_236 = j_236;
      term = try_1_0.instance.invoke(context, term, lifted3180);
      if(term == null)
        break Fail553;
      k_236 = term;
      if(i_236.value == null || j_236.value == null)
        break Fail553;
      term = (IStrategoTerm)termFactory.makeListCons(i_236.value, termFactory.makeListCons(j_236.value, (IStrategoList)extraction.constNil0));
      n_237 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_237, NO_STRATEGIES, new IStrategoTerm[]{extraction.const513});
      if(term == null)
        break Fail553;
      p_237 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_236);
      if(term == null)
        break Fail553;
      term = put_syntax_sort_0_1.instance.invoke(context, p_237, term);
      if(term == null)
        break Fail553;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}