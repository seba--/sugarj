package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Rec_0_2 extends Strategy 
{ 
  public static smart_$Rec_0_2 instance = new smart_$Rec_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_209, IStrategoTerm ref_o_209)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_209 = new TermReference(ref_n_209);
    TermReference o_209 = new TermReference(ref_o_209);
    context.push("smart_Rec_0_2");
    Fail511:
    { 
      IStrategoTerm p_209 = null;
      IStrategoTerm z_209 = null;
      IStrategoTerm b_210 = null;
      term = extraction.constNil0;
      lifted270 lifted2700 = new lifted270();
      lifted2700.n_209 = n_209;
      lifted2700.o_209 = o_209;
      term = try_1_0.instance.invoke(context, term, lifted2700);
      if(term == null)
        break Fail511;
      p_209 = term;
      if(n_209.value == null || o_209.value == null)
        break Fail511;
      term = (IStrategoTerm)termFactory.makeListCons(n_209.value, termFactory.makeListCons(o_209.value, (IStrategoList)extraction.constNil0));
      z_209 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_209, NO_STRATEGIES, new IStrategoTerm[]{extraction.const476});
      if(term == null)
        break Fail511;
      b_210 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_209);
      if(term == null)
        break Fail511;
      term = put_syntax_sort_0_1.instance.invoke(context, b_210, term);
      if(term == null)
        break Fail511;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}