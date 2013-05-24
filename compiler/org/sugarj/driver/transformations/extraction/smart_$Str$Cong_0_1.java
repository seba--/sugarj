package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Str$Cong_0_1 extends Strategy 
{ 
  public static smart_$Str$Cong_0_1 instance = new smart_$Str$Cong_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_212)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_212 = new TermReference(ref_x_212);
    context.push("smart_StrCong_0_1");
    Fail518:
    { 
      IStrategoTerm y_212 = null;
      IStrategoTerm f_213 = null;
      IStrategoTerm h_213 = null;
      term = extraction.constNil0;
      lifted277 lifted2770 = new lifted277();
      lifted2770.x_212 = x_212;
      term = try_1_0.instance.invoke(context, term, lifted2770);
      if(term == null)
        break Fail518;
      y_212 = term;
      if(x_212.value == null)
        break Fail518;
      term = (IStrategoTerm)termFactory.makeListCons(x_212.value, (IStrategoList)extraction.constNil0);
      f_213 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_213, NO_STRATEGIES, new IStrategoTerm[]{extraction.const483});
      if(term == null)
        break Fail518;
      h_213 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_212);
      if(term == null)
        break Fail518;
      term = put_syntax_sort_0_1.instance.invoke(context, h_213, term);
      if(term == null)
        break Fail518;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}