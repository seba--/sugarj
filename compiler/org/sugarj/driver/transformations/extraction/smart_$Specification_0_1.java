package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Specification_0_1 extends Strategy 
{ 
  public static smart_$Specification_0_1 instance = new smart_$Specification_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_266)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_266 = new TermReference(ref_v_266);
    context.push("smart_Specification_0_1");
    Fail600:
    { 
      IStrategoTerm w_266 = null;
      IStrategoTerm d_267 = null;
      IStrategoTerm g_267 = null;
      term = extraction.constNil0;
      lifted371 lifted3710 = new lifted371();
      lifted3710.v_266 = v_266;
      term = try_1_0.instance.invoke(context, term, lifted3710);
      if(term == null)
        break Fail600;
      w_266 = term;
      if(v_266.value == null)
        break Fail600;
      term = (IStrategoTerm)termFactory.makeListCons(v_266.value, (IStrategoList)extraction.constNil0);
      d_267 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_267, NO_STRATEGIES, new IStrategoTerm[]{extraction.const551});
      if(term == null)
        break Fail600;
      g_267 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_266);
      if(term == null)
        break Fail600;
      term = put_syntax_sort_0_1.instance.invoke(context, g_267, term);
      if(term == null)
        break Fail600;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}