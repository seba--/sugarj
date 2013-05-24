package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Choice_0_2 extends Strategy 
{ 
  public static smart_$Choice_0_2 instance = new smart_$Choice_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_222, IStrategoTerm ref_e_222)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_222 = new TermReference(ref_d_222);
    TermReference e_222 = new TermReference(ref_e_222);
    context.push("smart_Choice_0_2");
    Fail533:
    { 
      IStrategoTerm f_222 = null;
      IStrategoTerm p_222 = null;
      IStrategoTerm r_222 = null;
      term = extraction.constNil0;
      lifted292 lifted2920 = new lifted292();
      lifted2920.d_222 = d_222;
      lifted2920.e_222 = e_222;
      term = try_1_0.instance.invoke(context, term, lifted2920);
      if(term == null)
        break Fail533;
      f_222 = term;
      if(d_222.value == null || e_222.value == null)
        break Fail533;
      term = (IStrategoTerm)termFactory.makeListCons(d_222.value, termFactory.makeListCons(e_222.value, (IStrategoList)extraction.constNil0));
      p_222 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_222, NO_STRATEGIES, new IStrategoTerm[]{extraction.const497});
      if(term == null)
        break Fail533;
      r_222 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_222);
      if(term == null)
        break Fail533;
      term = put_syntax_sort_0_1.instance.invoke(context, r_222, term);
      if(term == null)
        break Fail533;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}