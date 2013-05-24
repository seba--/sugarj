package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Tuple_0_1 extends Strategy 
{ 
  public static smart_$Tuple_0_1 instance = new smart_$Tuple_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_234)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_234 = new TermReference(ref_r_234);
    context.push("smart_Tuple_0_1");
    Fail550:
    { 
      IStrategoTerm s_234 = null;
      IStrategoTerm b_235 = null;
      IStrategoTerm d_235 = null;
      term = extraction.constNil0;
      lifted313 lifted3130 = new lifted313();
      lifted3130.r_234 = r_234;
      term = try_1_0.instance.invoke(context, term, lifted3130);
      if(term == null)
        break Fail550;
      s_234 = term;
      if(r_234.value == null)
        break Fail550;
      term = (IStrategoTerm)termFactory.makeListCons(r_234.value, (IStrategoList)extraction.constNil0);
      b_235 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_235, NO_STRATEGIES, new IStrategoTerm[]{extraction.const511});
      if(term == null)
        break Fail550;
      d_235 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_234);
      if(term == null)
        break Fail550;
      term = put_syntax_sort_0_1.instance.invoke(context, d_235, term);
      if(term == null)
        break Fail550;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}