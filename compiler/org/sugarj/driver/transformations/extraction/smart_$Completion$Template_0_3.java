package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Completion$Template_0_3 extends Strategy 
{ 
  public static smart_$Completion$Template_0_3 instance = new smart_$Completion$Template_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_118, IStrategoTerm ref_d_118, IStrategoTerm ref_e_118)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_118 = new TermReference(ref_c_118);
    TermReference d_118 = new TermReference(ref_d_118);
    TermReference e_118 = new TermReference(ref_e_118);
    context.push("smart_CompletionTemplate_0_3");
    Fail387:
    { 
      IStrategoTerm f_118 = null;
      IStrategoTerm o_119 = null;
      IStrategoTerm q_119 = null;
      term = extraction.constNil0;
      lifted110 lifted1100 = new lifted110();
      lifted1100.c_118 = c_118;
      lifted1100.d_118 = d_118;
      lifted1100.e_118 = e_118;
      term = try_1_0.instance.invoke(context, term, lifted1100);
      if(term == null)
        break Fail387;
      lifted111 lifted1110 = new lifted111();
      lifted1110.c_118 = c_118;
      lifted1110.d_118 = d_118;
      lifted1110.e_118 = e_118;
      term = try_1_0.instance.invoke(context, term, lifted1110);
      if(term == null)
        break Fail387;
      lifted112 lifted1120 = new lifted112();
      lifted1120.c_118 = c_118;
      lifted1120.d_118 = d_118;
      lifted1120.e_118 = e_118;
      term = try_1_0.instance.invoke(context, term, lifted1120);
      if(term == null)
        break Fail387;
      f_118 = term;
      if(c_118.value == null || (d_118.value == null || e_118.value == null))
        break Fail387;
      term = (IStrategoTerm)termFactory.makeListCons(c_118.value, termFactory.makeListCons(d_118.value, termFactory.makeListCons(e_118.value, (IStrategoList)extraction.constNil0)));
      o_119 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_119, NO_STRATEGIES, new IStrategoTerm[]{extraction.const378});
      if(term == null)
        break Fail387;
      q_119 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_118);
      if(term == null)
        break Fail387;
      term = put_syntax_sort_0_1.instance.invoke(context, q_119, term);
      if(term == null)
        break Fail387;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}