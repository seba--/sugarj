package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Sort$Tuple_0_1 extends Strategy 
{ 
  public static smart_$Sort$Tuple_0_1 instance = new smart_$Sort$Tuple_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_240)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_240 = new TermReference(ref_o_240);
    context.push("smart_SortTuple_0_1");
    Fail557:
    { 
      IStrategoTerm q_240 = null;
      IStrategoTerm x_240 = null;
      IStrategoTerm z_240 = null;
      term = extraction.constNil0;
      lifted325 lifted3250 = new lifted325();
      lifted3250.o_240 = o_240;
      term = try_1_0.instance.invoke(context, term, lifted3250);
      if(term == null)
        break Fail557;
      q_240 = term;
      if(o_240.value == null)
        break Fail557;
      term = (IStrategoTerm)termFactory.makeListCons(o_240.value, (IStrategoList)extraction.constNil0);
      x_240 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_240, NO_STRATEGIES, new IStrategoTerm[]{extraction.const517});
      if(term == null)
        break Fail557;
      z_240 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_240);
      if(term == null)
        break Fail557;
      term = put_syntax_sort_0_1.instance.invoke(context, z_240, term);
      if(term == null)
        break Fail557;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}