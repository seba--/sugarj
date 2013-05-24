package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Strategies_0_1 extends Strategy 
{ 
  public static smart_$Strategies_0_1 instance = new smart_$Strategies_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_93)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_93 = new TermReference(ref_d_93);
    context.push("smart_Strategies_0_1");
    Fail345:
    { 
      IStrategoTerm e_93 = null;
      IStrategoTerm s_93 = null;
      IStrategoTerm u_93 = null;
      term = extraction.constNil0;
      lifted48 lifted4810 = new lifted48();
      lifted4810.d_93 = d_93;
      term = try_1_0.instance.invoke(context, term, lifted4810);
      if(term == null)
        break Fail345;
      lifted49 lifted4910 = new lifted49();
      lifted4910.d_93 = d_93;
      term = try_1_0.instance.invoke(context, term, lifted4910);
      if(term == null)
        break Fail345;
      e_93 = term;
      if(d_93.value == null)
        break Fail345;
      term = (IStrategoTerm)termFactory.makeListCons(d_93.value, (IStrategoList)extraction.constNil0);
      s_93 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_93, NO_STRATEGIES, new IStrategoTerm[]{extraction.const334});
      if(term == null)
        break Fail345;
      u_93 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_93);
      if(term == null)
        break Fail345;
      term = put_syntax_sort_0_1.instance.invoke(context, u_93, term);
      if(term == null)
        break Fail345;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}