package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Block$Comment$Defs_0_1 extends Strategy 
{ 
  public static smart_$Block$Comment$Defs_0_1 instance = new smart_$Block$Comment$Defs_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_165)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_165 = new TermReference(ref_v_165);
    context.push("smart_BlockCommentDefs_0_1");
    Fail449:
    { 
      IStrategoTerm w_165 = null;
      IStrategoTerm f_166 = null;
      IStrategoTerm j_166 = null;
      term = extraction.constNil0;
      lifted194 lifted1940 = new lifted194();
      lifted1940.v_165 = v_165;
      term = try_1_0.instance.invoke(context, term, lifted1940);
      if(term == null)
        break Fail449;
      w_165 = term;
      if(v_165.value == null)
        break Fail449;
      term = (IStrategoTerm)termFactory.makeListCons(v_165.value, (IStrategoList)extraction.constNil0);
      f_166 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_166, NO_STRATEGIES, new IStrategoTerm[]{extraction.const430});
      if(term == null)
        break Fail449;
      j_166 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_165);
      if(term == null)
        break Fail449;
      term = put_syntax_sort_0_1.instance.invoke(context, j_166, term);
      if(term == null)
        break Fail449;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}