package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Add$Dyn$Rule_0_2 extends Strategy 
{ 
  public static smart_$Add$Dyn$Rule_0_2 instance = new smart_$Add$Dyn$Rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_181, IStrategoTerm ref_r_181)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_181 = new TermReference(ref_q_181);
    TermReference r_181 = new TermReference(ref_r_181);
    context.push("smart_AddDynRule_0_2");
    Fail475:
    { 
      IStrategoTerm s_181 = null;
      IStrategoTerm c_182 = null;
      IStrategoTerm e_182 = null;
      term = extraction.constNil0;
      lifted223 lifted2230 = new lifted223();
      lifted2230.q_181 = q_181;
      lifted2230.r_181 = r_181;
      term = try_1_0.instance.invoke(context, term, lifted2230);
      if(term == null)
        break Fail475;
      s_181 = term;
      if(q_181.value == null || r_181.value == null)
        break Fail475;
      term = (IStrategoTerm)termFactory.makeListCons(q_181.value, termFactory.makeListCons(r_181.value, (IStrategoList)extraction.constNil0));
      c_182 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", c_182, NO_STRATEGIES, new IStrategoTerm[]{extraction.const444});
      if(term == null)
        break Fail475;
      e_182 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_181);
      if(term == null)
        break Fail475;
      term = put_syntax_sort_0_1.instance.invoke(context, e_182, term);
      if(term == null)
        break Fail475;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}