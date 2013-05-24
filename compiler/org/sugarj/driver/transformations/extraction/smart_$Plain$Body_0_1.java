package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Plain$Body_0_1 extends Strategy 
{ 
  public static smart_$Plain$Body_0_1 instance = new smart_$Plain$Body_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_331)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_331 = new TermReference(ref_x_331);
    context.push("smart_PlainBody_0_1");
    Fail702:
    { 
      IStrategoTerm y_331 = null;
      IStrategoTerm g_332 = null;
      IStrategoTerm i_332 = null;
      term = extraction.constNil0;
      lifted484 lifted4840 = new lifted484();
      lifted4840.x_331 = x_331;
      term = try_1_0.instance.invoke(context, term, lifted4840);
      if(term == null)
        break Fail702;
      y_331 = term;
      if(x_331.value == null)
        break Fail702;
      term = (IStrategoTerm)termFactory.makeListCons(x_331.value, (IStrategoList)extraction.constNil0);
      g_332 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_332, NO_STRATEGIES, new IStrategoTerm[]{extraction.const650});
      if(term == null)
        break Fail702;
      i_332 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_331);
      if(term == null)
        break Fail702;
      term = put_syntax_sort_0_1.instance.invoke(context, i_332, term);
      if(term == null)
        break Fail702;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}