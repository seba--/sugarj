package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Outliner_0_2 extends Strategy 
{ 
  public static smart_$Outliner_0_2 instance = new smart_$Outliner_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_146, IStrategoTerm ref_b_146)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_146 = new TermReference(ref_a_146);
    TermReference b_146 = new TermReference(ref_b_146);
    context.push("smart_Outliner_0_2");
    Fail425:
    { 
      IStrategoTerm c_146 = null;
      IStrategoTerm q_146 = null;
      IStrategoTerm s_146 = null;
      term = extraction.constNil0;
      lifted159 lifted1590 = new lifted159();
      lifted1590.a_146 = a_146;
      lifted1590.b_146 = b_146;
      term = try_1_0.instance.invoke(context, term, lifted1590);
      if(term == null)
        break Fail425;
      c_146 = term;
      if(a_146.value == null || b_146.value == null)
        break Fail425;
      term = (IStrategoTerm)termFactory.makeListCons(a_146.value, termFactory.makeListCons(b_146.value, (IStrategoList)extraction.constNil0));
      q_146 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_146, NO_STRATEGIES, new IStrategoTerm[]{extraction.const411});
      if(term == null)
        break Fail425;
      s_146 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_146);
      if(term == null)
        break Fail425;
      term = put_syntax_sort_0_1.instance.invoke(context, s_146, term);
      if(term == null)
        break Fail425;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}