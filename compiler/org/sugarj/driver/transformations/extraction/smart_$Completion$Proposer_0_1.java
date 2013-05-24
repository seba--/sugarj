package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Completion$Proposer_0_1 extends Strategy 
{ 
  public static smart_$Completion$Proposer_0_1 instance = new smart_$Completion$Proposer_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_116)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_116 = new TermReference(ref_h_116);
    context.push("smart_CompletionProposer_0_1");
    Fail384:
    { 
      IStrategoTerm i_116 = null;
      IStrategoTerm p_116 = null;
      IStrategoTerm r_116 = null;
      term = extraction.constNil0;
      lifted105 lifted1050 = new lifted105();
      lifted1050.h_116 = h_116;
      term = try_1_0.instance.invoke(context, term, lifted1050);
      if(term == null)
        break Fail384;
      i_116 = term;
      if(h_116.value == null)
        break Fail384;
      term = (IStrategoTerm)termFactory.makeListCons(h_116.value, (IStrategoList)extraction.constNil0);
      p_116 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_116, NO_STRATEGIES, new IStrategoTerm[]{extraction.const375});
      if(term == null)
        break Fail384;
      r_116 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_116);
      if(term == null)
        break Fail384;
      term = put_syntax_sort_0_1.instance.invoke(context, r_116, term);
      if(term == null)
        break Fail384;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}