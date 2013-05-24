package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_simple_charclass_0_1 extends Strategy 
{ 
  public static smart_simple_charclass_0_1 instance = new smart_simple_charclass_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_287)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_287 = new TermReference(ref_w_287);
    context.push("smart_simple_charclass_0_1");
    Fail635:
    { 
      IStrategoTerm x_287 = null;
      IStrategoTerm e_288 = null;
      IStrategoTerm g_288 = null;
      term = extraction.constNil0;
      lifted414 lifted4140 = new lifted414();
      lifted4140.w_287 = w_287;
      term = try_1_0.instance.invoke(context, term, lifted4140);
      if(term == null)
        break Fail635;
      x_287 = term;
      if(w_287.value == null)
        break Fail635;
      term = (IStrategoTerm)termFactory.makeListCons(w_287.value, (IStrategoList)extraction.constNil0);
      e_288 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_288, NO_STRATEGIES, new IStrategoTerm[]{extraction.const586});
      if(term == null)
        break Fail635;
      g_288 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_287);
      if(term == null)
        break Fail635;
      term = put_syntax_sort_0_1.instance.invoke(context, g_288, term);
      if(term == null)
        break Fail635;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}