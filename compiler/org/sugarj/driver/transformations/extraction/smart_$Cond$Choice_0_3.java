package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Cond$Choice_0_3 extends Strategy 
{ 
  public static smart_$Cond$Choice_0_3 instance = new smart_$Cond$Choice_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_223, IStrategoTerm ref_o_223, IStrategoTerm ref_p_223)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_223 = new TermReference(ref_n_223);
    TermReference o_223 = new TermReference(ref_o_223);
    TermReference p_223 = new TermReference(ref_p_223);
    context.push("smart_CondChoice_0_3");
    Fail535:
    { 
      IStrategoTerm q_223 = null;
      IStrategoTerm d_224 = null;
      IStrategoTerm f_224 = null;
      term = extraction.constNil0;
      lifted294 lifted2940 = new lifted294();
      lifted2940.n_223 = n_223;
      lifted2940.o_223 = o_223;
      lifted2940.p_223 = p_223;
      term = try_1_0.instance.invoke(context, term, lifted2940);
      if(term == null)
        break Fail535;
      q_223 = term;
      if(n_223.value == null || (o_223.value == null || p_223.value == null))
        break Fail535;
      term = (IStrategoTerm)termFactory.makeListCons(n_223.value, termFactory.makeListCons(o_223.value, termFactory.makeListCons(p_223.value, (IStrategoList)extraction.constNil0)));
      d_224 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_224, NO_STRATEGIES, new IStrategoTerm[]{extraction.const499});
      if(term == null)
        break Fail535;
      f_224 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_223);
      if(term == null)
        break Fail535;
      term = put_syntax_sort_0_1.instance.invoke(context, f_224, term);
      if(term == null)
        break Fail535;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}