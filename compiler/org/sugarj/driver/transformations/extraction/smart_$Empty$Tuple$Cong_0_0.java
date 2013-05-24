package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Empty$Tuple$Cong_0_0 extends Strategy 
{ 
  public static smart_$Empty$Tuple$Cong_0_0 instance = new smart_$Empty$Tuple$Cong_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_EmptyTupleCong_0_0");
    Fail525:
    { 
      IStrategoTerm m_216 = null;
      IStrategoTerm u_216 = null;
      IStrategoTerm z_216 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted284.instance);
      if(term == null)
        break Fail525;
      m_216 = term;
      u_216 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_216, NO_STRATEGIES, new IStrategoTerm[]{extraction.const489});
      if(term == null)
        break Fail525;
      z_216 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, m_216);
      if(term == null)
        break Fail525;
      term = put_syntax_sort_0_1.instance.invoke(context, z_216, term);
      if(term == null)
        break Fail525;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}