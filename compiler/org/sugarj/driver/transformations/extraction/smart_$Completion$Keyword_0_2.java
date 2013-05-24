package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Completion$Keyword_0_2 extends Strategy 
{ 
  public static smart_$Completion$Keyword_0_2 instance = new smart_$Completion$Keyword_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_117, IStrategoTerm ref_o_117)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_117 = new TermReference(ref_n_117);
    TermReference o_117 = new TermReference(ref_o_117);
    context.push("smart_CompletionKeyword_0_2");
    Fail386:
    { 
      IStrategoTerm p_117 = null;
      IStrategoTerm z_117 = null;
      IStrategoTerm b_118 = null;
      term = extraction.constNil0;
      lifted109 lifted1090 = new lifted109();
      lifted1090.n_117 = n_117;
      lifted1090.o_117 = o_117;
      term = try_1_0.instance.invoke(context, term, lifted1090);
      if(term == null)
        break Fail386;
      p_117 = term;
      if(n_117.value == null || o_117.value == null)
        break Fail386;
      term = (IStrategoTerm)termFactory.makeListCons(n_117.value, termFactory.makeListCons(o_117.value, (IStrategoList)extraction.constNil0));
      z_117 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_117, NO_STRATEGIES, new IStrategoTerm[]{extraction.const377});
      if(term == null)
        break Fail386;
      b_118 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_117);
      if(term == null)
        break Fail386;
      term = put_syntax_sort_0_1.instance.invoke(context, b_118, term);
      if(term == null)
        break Fail386;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}