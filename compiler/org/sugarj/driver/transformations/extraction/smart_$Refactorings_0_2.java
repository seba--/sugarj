package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Refactorings_0_2 extends Strategy 
{ 
  public static smart_$Refactorings_0_2 instance = new smart_$Refactorings_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_108, IStrategoTerm ref_p_108)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_108 = new TermReference(ref_o_108);
    TermReference p_108 = new TermReference(ref_p_108);
    context.push("smart_Refactorings_0_2");
    Fail369:
    { 
      IStrategoTerm q_108 = null;
      IStrategoTerm a_109 = null;
      IStrategoTerm c_109 = null;
      term = extraction.constNil0;
      lifted89 lifted890 = new lifted89();
      lifted890.o_108 = o_108;
      lifted890.p_108 = p_108;
      term = try_1_0.instance.invoke(context, term, lifted890);
      if(term == null)
        break Fail369;
      q_108 = term;
      if(o_108.value == null || p_108.value == null)
        break Fail369;
      term = (IStrategoTerm)termFactory.makeListCons(o_108.value, termFactory.makeListCons(p_108.value, (IStrategoList)extraction.constNil0));
      a_109 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_109, NO_STRATEGIES, new IStrategoTerm[]{extraction.const360});
      if(term == null)
        break Fail369;
      c_109 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_108);
      if(term == null)
        break Fail369;
      term = put_syntax_sort_0_1.instance.invoke(context, c_109, term);
      if(term == null)
        break Fail369;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}