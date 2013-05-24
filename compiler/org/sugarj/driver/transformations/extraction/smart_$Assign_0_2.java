package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Assign_0_2 extends Strategy 
{ 
  public static smart_$Assign_0_2 instance = new smart_$Assign_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_226, IStrategoTerm ref_y_226)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_226 = new TermReference(ref_x_226);
    TermReference y_226 = new TermReference(ref_y_226);
    context.push("smart_Assign_0_2");
    Fail540:
    { 
      IStrategoTerm z_226 = null;
      IStrategoTerm j_227 = null;
      IStrategoTerm l_227 = null;
      term = extraction.constNil0;
      lifted299 lifted2990 = new lifted299();
      lifted2990.x_226 = x_226;
      lifted2990.y_226 = y_226;
      term = try_1_0.instance.invoke(context, term, lifted2990);
      if(term == null)
        break Fail540;
      z_226 = term;
      if(x_226.value == null || y_226.value == null)
        break Fail540;
      term = (IStrategoTerm)termFactory.makeListCons(x_226.value, termFactory.makeListCons(y_226.value, (IStrategoList)extraction.constNil0));
      j_227 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_227, NO_STRATEGIES, new IStrategoTerm[]{extraction.const503});
      if(term == null)
        break Fail540;
      l_227 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_226);
      if(term == null)
        break Fail540;
      term = put_syntax_sort_0_1.instance.invoke(context, l_227, term);
      if(term == null)
        break Fail540;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}