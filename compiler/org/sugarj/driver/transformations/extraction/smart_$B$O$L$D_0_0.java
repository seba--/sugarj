package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$B$O$L$D_0_0 extends Strategy 
{ 
  public static smart_$B$O$L$D_0_0 instance = new smart_$B$O$L$D_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_BOLD_0_0");
    Fail418:
    { 
      IStrategoTerm v_141 = null;
      IStrategoTerm m_142 = null;
      IStrategoTerm o_142 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted151.instance);
      if(term == null)
        break Fail418;
      v_141 = term;
      m_142 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_142, NO_STRATEGIES, new IStrategoTerm[]{extraction.const405});
      if(term == null)
        break Fail418;
      o_142 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_141);
      if(term == null)
        break Fail418;
      term = put_syntax_sort_0_1.instance.invoke(context, o_142, term);
      if(term == null)
        break Fail418;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}