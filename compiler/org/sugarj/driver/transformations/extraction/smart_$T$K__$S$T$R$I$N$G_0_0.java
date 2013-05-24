package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$T$K__$S$T$R$I$N$G_0_0 extends Strategy 
{ 
  public static smart_$T$K__$S$T$R$I$N$G_0_0 instance = new smart_$T$K__$S$T$R$I$N$G_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_TK__STRING_0_0");
    Fail411:
    { 
      IStrategoTerm i_138 = null;
      IStrategoTerm m_138 = null;
      IStrategoTerm o_138 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted144.instance);
      if(term == null)
        break Fail411;
      i_138 = term;
      m_138 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_138, NO_STRATEGIES, new IStrategoTerm[]{extraction.const398});
      if(term == null)
        break Fail411;
      o_138 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_138);
      if(term == null)
        break Fail411;
      term = put_syntax_sort_0_1.instance.invoke(context, o_138, term);
      if(term == null)
        break Fail411;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}