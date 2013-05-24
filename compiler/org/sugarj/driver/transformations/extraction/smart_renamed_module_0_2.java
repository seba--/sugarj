package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_renamed_module_0_2 extends Strategy 
{ 
  public static smart_renamed_module_0_2 instance = new smart_renamed_module_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_318, IStrategoTerm ref_h_318)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference g_318 = new TermReference(ref_g_318);
    TermReference h_318 = new TermReference(ref_h_318);
    context.push("smart_renamed_module_0_2");
    Fail676:
    { 
      IStrategoTerm i_318 = null;
      IStrategoTerm s_318 = null;
      IStrategoTerm x_318 = null;
      term = extraction.constNil0;
      lifted457 lifted4570 = new lifted457();
      lifted4570.g_318 = g_318;
      lifted4570.h_318 = h_318;
      term = try_1_0.instance.invoke(context, term, lifted4570);
      if(term == null)
        break Fail676;
      i_318 = term;
      if(g_318.value == null || h_318.value == null)
        break Fail676;
      term = (IStrategoTerm)termFactory.makeListCons(g_318.value, termFactory.makeListCons(h_318.value, (IStrategoList)extraction.constNil0));
      s_318 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_318, NO_STRATEGIES, new IStrategoTerm[]{extraction.const624});
      if(term == null)
        break Fail676;
      x_318 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_318);
      if(term == null)
        break Fail676;
      term = put_syntax_sort_0_1.instance.invoke(context, x_318, term);
      if(term == null)
        break Fail676;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}