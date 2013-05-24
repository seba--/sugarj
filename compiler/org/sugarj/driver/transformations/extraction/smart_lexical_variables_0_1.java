package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_lexical_variables_0_1 extends Strategy 
{ 
  public static smart_lexical_variables_0_1 instance = new smart_lexical_variables_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_100)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_100 = new TermReference(ref_z_100);
    context.push("smart_lexical_variables_0_1");
    Fail357:
    { 
      IStrategoTerm a_101 = null;
      IStrategoTerm o_101 = null;
      IStrategoTerm q_101 = null;
      term = extraction.constNil0;
      lifted69 lifted690 = new lifted69();
      lifted690.z_100 = z_100;
      term = try_1_0.instance.invoke(context, term, lifted690);
      if(term == null)
        break Fail357;
      lifted70 lifted700 = new lifted70();
      lifted700.z_100 = z_100;
      term = try_1_0.instance.invoke(context, term, lifted700);
      if(term == null)
        break Fail357;
      a_101 = term;
      if(z_100.value == null)
        break Fail357;
      term = (IStrategoTerm)termFactory.makeListCons(z_100.value, (IStrategoList)extraction.constNil0);
      o_101 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_101, NO_STRATEGIES, new IStrategoTerm[]{extraction.const347});
      if(term == null)
        break Fail357;
      q_101 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_101);
      if(term == null)
        break Fail357;
      term = put_syntax_sort_0_1.instance.invoke(context, q_101, term);
      if(term == null)
        break Fail357;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}