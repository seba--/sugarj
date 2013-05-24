package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Line$Comment$Prefix_0_1 extends Strategy 
{ 
  public static smart_$Line$Comment$Prefix_0_1 instance = new smart_$Line$Comment$Prefix_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_165)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_165 = new TermReference(ref_d_165);
    context.push("smart_LineCommentPrefix_0_1");
    Fail448:
    { 
      IStrategoTerm i_165 = null;
      IStrategoTerm r_165 = null;
      IStrategoTerm u_165 = null;
      term = extraction.constNil0;
      lifted193 lifted1930 = new lifted193();
      lifted1930.d_165 = d_165;
      term = try_1_0.instance.invoke(context, term, lifted1930);
      if(term == null)
        break Fail448;
      i_165 = term;
      if(d_165.value == null)
        break Fail448;
      term = (IStrategoTerm)termFactory.makeListCons(d_165.value, (IStrategoList)extraction.constNil0);
      r_165 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_165, NO_STRATEGIES, new IStrategoTerm[]{extraction.const429});
      if(term == null)
        break Fail448;
      u_165 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_165);
      if(term == null)
        break Fail448;
      term = put_syntax_sort_0_1.instance.invoke(context, u_165, term);
      if(term == null)
        break Fail448;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}