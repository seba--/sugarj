package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Plain$Dec_0_2 extends Strategy 
{ 
  public static smart_$Plain$Dec_0_2 instance = new smart_$Plain$Dec_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_330, IStrategoTerm ref_d_330)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_330 = new TermReference(ref_c_330);
    TermReference d_330 = new TermReference(ref_d_330);
    context.push("smart_PlainDec_0_2");
    Fail700:
    { 
      IStrategoTerm e_330 = null;
      IStrategoTerm x_330 = null;
      IStrategoTerm z_330 = null;
      term = extraction.constNil0;
      lifted481 lifted4811 = new lifted481();
      lifted4811.c_330 = c_330;
      lifted4811.d_330 = d_330;
      term = try_1_0.instance.invoke(context, term, lifted4811);
      if(term == null)
        break Fail700;
      lifted482 lifted4820 = new lifted482();
      lifted4820.c_330 = c_330;
      lifted4820.d_330 = d_330;
      term = try_1_0.instance.invoke(context, term, lifted4820);
      if(term == null)
        break Fail700;
      e_330 = term;
      if(c_330.value == null || d_330.value == null)
        break Fail700;
      term = (IStrategoTerm)termFactory.makeListCons(c_330.value, termFactory.makeListCons(d_330.value, (IStrategoList)extraction.constNil0));
      x_330 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_330, NO_STRATEGIES, new IStrategoTerm[]{extraction.const649});
      if(term == null)
        break Fail700;
      z_330 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_330);
      if(term == null)
        break Fail700;
      term = put_syntax_sort_0_1.instance.invoke(context, z_330, term);
      if(term == null)
        break Fail700;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}