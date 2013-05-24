package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Cong$Q_0_2 extends Strategy 
{ 
  public static smart_$Cong$Q_0_2 instance = new smart_$Cong$Q_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_214, IStrategoTerm ref_r_214)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_214 = new TermReference(ref_q_214);
    TermReference r_214 = new TermReference(ref_r_214);
    context.push("smart_CongQ_0_2");
    Fail522:
    { 
      IStrategoTerm s_214 = null;
      IStrategoTerm d_215 = null;
      IStrategoTerm f_215 = null;
      term = extraction.constNil0;
      lifted281 lifted2810 = new lifted281();
      lifted2810.q_214 = q_214;
      lifted2810.r_214 = r_214;
      term = try_1_0.instance.invoke(context, term, lifted2810);
      if(term == null)
        break Fail522;
      s_214 = term;
      if(q_214.value == null || r_214.value == null)
        break Fail522;
      term = (IStrategoTerm)termFactory.makeListCons(q_214.value, termFactory.makeListCons(r_214.value, (IStrategoList)extraction.constNil0));
      d_215 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_215, NO_STRATEGIES, new IStrategoTerm[]{extraction.const487});
      if(term == null)
        break Fail522;
      f_215 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_214);
      if(term == null)
        break Fail522;
      term = put_syntax_sort_0_1.instance.invoke(context, f_215, term);
      if(term == null)
        break Fail522;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}