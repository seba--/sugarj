package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Default$Var$Dec_0_1 extends Strategy 
{ 
  public static smart_$Default$Var$Dec_0_1 instance = new smart_$Default$Var$Dec_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_207)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_207 = new TermReference(ref_k_207);
    context.push("smart_DefaultVarDec_0_1");
    Fail507:
    { 
      IStrategoTerm l_207 = null;
      IStrategoTerm s_207 = null;
      IStrategoTerm u_207 = null;
      term = extraction.constNil0;
      lifted266 lifted2660 = new lifted266();
      lifted2660.k_207 = k_207;
      term = try_1_0.instance.invoke(context, term, lifted2660);
      if(term == null)
        break Fail507;
      l_207 = term;
      if(k_207.value == null)
        break Fail507;
      term = (IStrategoTerm)termFactory.makeListCons(k_207.value, (IStrategoList)extraction.constNil0);
      s_207 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_207, NO_STRATEGIES, new IStrategoTerm[]{extraction.const472});
      if(term == null)
        break Fail507;
      u_207 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_207);
      if(term == null)
        break Fail507;
      term = put_syntax_sort_0_1.instance.invoke(context, u_207, term);
      if(term == null)
        break Fail507;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}