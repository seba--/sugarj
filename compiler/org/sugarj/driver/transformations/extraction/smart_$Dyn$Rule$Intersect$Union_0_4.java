package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Intersect$Union_0_4 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Intersect$Union_0_4 instance = new smart_$Dyn$Rule$Intersect$Union_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_195, IStrategoTerm ref_w_195, IStrategoTerm ref_x_195, IStrategoTerm ref_y_195)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_195 = new TermReference(ref_v_195);
    TermReference w_195 = new TermReference(ref_w_195);
    TermReference x_195 = new TermReference(ref_x_195);
    TermReference y_195 = new TermReference(ref_y_195);
    context.push("smart_DynRuleIntersectUnion_0_4");
    Fail494:
    { 
      IStrategoTerm z_195 = null;
      IStrategoTerm f_197 = null;
      IStrategoTerm k_197 = null;
      term = extraction.constNil0;
      lifted247 lifted2470 = new lifted247();
      lifted2470.v_195 = v_195;
      lifted2470.w_195 = w_195;
      lifted2470.x_195 = x_195;
      lifted2470.y_195 = y_195;
      term = try_1_0.instance.invoke(context, term, lifted2470);
      if(term == null)
        break Fail494;
      lifted248 lifted2480 = new lifted248();
      lifted2480.v_195 = v_195;
      lifted2480.w_195 = w_195;
      lifted2480.x_195 = x_195;
      lifted2480.y_195 = y_195;
      term = try_1_0.instance.invoke(context, term, lifted2480);
      if(term == null)
        break Fail494;
      z_195 = term;
      if(v_195.value == null || (w_195.value == null || (x_195.value == null || y_195.value == null)))
        break Fail494;
      term = (IStrategoTerm)termFactory.makeListCons(v_195.value, termFactory.makeListCons(w_195.value, termFactory.makeListCons(x_195.value, termFactory.makeListCons(y_195.value, (IStrategoList)extraction.constNil0))));
      f_197 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_197, NO_STRATEGIES, new IStrategoTerm[]{extraction.const460});
      if(term == null)
        break Fail494;
      k_197 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_195);
      if(term == null)
        break Fail494;
      term = put_syntax_sort_0_1.instance.invoke(context, k_197, term);
      if(term == null)
        break Fail494;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}