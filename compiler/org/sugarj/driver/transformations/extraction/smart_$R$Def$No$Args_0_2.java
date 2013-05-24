package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$R$Def$No$Args_0_2 extends Strategy 
{ 
  public static smart_$R$Def$No$Args_0_2 instance = new smart_$R$Def$No$Args_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_200, IStrategoTerm ref_r_200)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_200 = new TermReference(ref_q_200);
    TermReference r_200 = new TermReference(ref_r_200);
    context.push("smart_RDefNoArgs_0_2");
    Fail498:
    { 
      IStrategoTerm s_200 = null;
      IStrategoTerm c_201 = null;
      IStrategoTerm e_201 = null;
      term = extraction.constNil0;
      lifted256 lifted2560 = new lifted256();
      lifted2560.q_200 = q_200;
      lifted2560.r_200 = r_200;
      term = try_1_0.instance.invoke(context, term, lifted2560);
      if(term == null)
        break Fail498;
      s_200 = term;
      if(q_200.value == null || r_200.value == null)
        break Fail498;
      term = (IStrategoTerm)termFactory.makeListCons(q_200.value, termFactory.makeListCons(r_200.value, (IStrategoList)extraction.constNil0));
      c_201 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", c_201, NO_STRATEGIES, new IStrategoTerm[]{extraction.const464});
      if(term == null)
        break Fail498;
      e_201 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_200);
      if(term == null)
        break Fail498;
      term = put_syntax_sort_0_1.instance.invoke(context, e_201, term);
      if(term == null)
        break Fail498;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}