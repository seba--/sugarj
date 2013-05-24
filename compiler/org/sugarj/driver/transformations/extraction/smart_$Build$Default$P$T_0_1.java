package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Build$Default$P$T_0_1 extends Strategy 
{ 
  public static smart_$Build$Default$P$T_0_1 instance = new smart_$Build$Default$P$T_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_228)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_228 = new TermReference(ref_n_228);
    context.push("smart_BuildDefaultPT_0_1");
    Fail543:
    { 
      IStrategoTerm o_228 = null;
      IStrategoTerm v_228 = null;
      IStrategoTerm z_228 = null;
      term = extraction.constNil0;
      lifted303 lifted3030 = new lifted303();
      lifted3030.n_228 = n_228;
      term = try_1_0.instance.invoke(context, term, lifted3030);
      if(term == null)
        break Fail543;
      o_228 = term;
      if(n_228.value == null)
        break Fail543;
      term = (IStrategoTerm)termFactory.makeListCons(n_228.value, (IStrategoList)extraction.constNil0);
      v_228 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_228, NO_STRATEGIES, new IStrategoTerm[]{extraction.const505});
      if(term == null)
        break Fail543;
      z_228 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_228);
      if(term == null)
        break Fail543;
      term = put_syntax_sort_0_1.instance.invoke(context, z_228, term);
      if(term == null)
        break Fail543;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}