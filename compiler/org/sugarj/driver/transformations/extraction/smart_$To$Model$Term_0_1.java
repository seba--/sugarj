package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$To$Model$Term_0_1 extends Strategy 
{ 
  public static smart_$To$Model$Term_0_1 instance = new smart_$To$Model$Term_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_91)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_91 = new TermReference(ref_w_91);
    context.push("smart_ToModelTerm_0_1");
    Fail343:
    { 
      IStrategoTerm x_91 = null;
      IStrategoTerm e_92 = null;
      IStrategoTerm g_92 = null;
      term = extraction.constNil0;
      lifted46 lifted4610 = new lifted46();
      lifted4610.w_91 = w_91;
      term = try_1_0.instance.invoke(context, term, lifted4610);
      if(term == null)
        break Fail343;
      x_91 = term;
      if(w_91.value == null)
        break Fail343;
      term = (IStrategoTerm)termFactory.makeListCons(w_91.value, (IStrategoList)extraction.constNil0);
      e_92 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_92, NO_STRATEGIES, new IStrategoTerm[]{extraction.const332});
      if(term == null)
        break Fail343;
      g_92 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_91);
      if(term == null)
        break Fail343;
      term = put_syntax_sort_0_1.instance.invoke(context, g_92, term);
      if(term == null)
        break Fail343;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}