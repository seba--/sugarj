package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$If$Then_0_2 extends Strategy 
{ 
  public static smart_$If$Then_0_2 instance = new smart_$If$Then_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_224, IStrategoTerm ref_h_224)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference g_224 = new TermReference(ref_g_224);
    TermReference h_224 = new TermReference(ref_h_224);
    context.push("smart_IfThen_0_2");
    Fail536:
    { 
      IStrategoTerm j_224 = null;
      IStrategoTerm x_224 = null;
      IStrategoTerm z_224 = null;
      term = extraction.constNil0;
      lifted295 lifted2950 = new lifted295();
      lifted2950.g_224 = g_224;
      lifted2950.h_224 = h_224;
      term = try_1_0.instance.invoke(context, term, lifted2950);
      if(term == null)
        break Fail536;
      j_224 = term;
      if(g_224.value == null || h_224.value == null)
        break Fail536;
      term = (IStrategoTerm)termFactory.makeListCons(g_224.value, termFactory.makeListCons(h_224.value, (IStrategoList)extraction.constNil0));
      x_224 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_224, NO_STRATEGIES, new IStrategoTerm[]{extraction.const500});
      if(term == null)
        break Fail536;
      z_224 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_224);
      if(term == null)
        break Fail536;
      term = put_syntax_sort_0_1.instance.invoke(context, z_224, term);
      if(term == null)
        break Fail536;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}