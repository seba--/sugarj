package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Placeholder_0_1 extends Strategy 
{ 
  public static smart_$Placeholder_0_1 instance = new smart_$Placeholder_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_122)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_122 = new TermReference(ref_h_122);
    context.push("smart_Placeholder_0_1");
    Fail390:
    { 
      IStrategoTerm i_122 = null;
      IStrategoTerm r_122 = null;
      IStrategoTerm t_122 = null;
      term = extraction.constNil0;
      lifted116 lifted1160 = new lifted116();
      lifted1160.h_122 = h_122;
      term = try_1_0.instance.invoke(context, term, lifted1160);
      if(term == null)
        break Fail390;
      i_122 = term;
      if(h_122.value == null)
        break Fail390;
      term = (IStrategoTerm)termFactory.makeListCons(h_122.value, (IStrategoList)extraction.constNil0);
      r_122 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_122, NO_STRATEGIES, new IStrategoTerm[]{extraction.const10});
      if(term == null)
        break Fail390;
      t_122 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_122);
      if(term == null)
        break Fail390;
      term = put_syntax_sort_0_1.instance.invoke(context, t_122, term);
      if(term == null)
        break Fail390;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}