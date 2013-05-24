package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Language$Name_0_1 extends Strategy 
{ 
  public static smart_$Language$Name_0_1 instance = new smart_$Language$Name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_157)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_157 = new TermReference(ref_q_157);
    context.push("smart_LanguageName_0_1");
    Fail437:
    { 
      IStrategoTerm r_157 = null;
      IStrategoTerm g_158 = null;
      IStrategoTerm i_158 = null;
      term = extraction.constNil0;
      lifted181 lifted1810 = new lifted181();
      lifted1810.q_157 = q_157;
      term = try_1_0.instance.invoke(context, term, lifted1810);
      if(term == null)
        break Fail437;
      r_157 = term;
      if(q_157.value == null)
        break Fail437;
      term = (IStrategoTerm)termFactory.makeListCons(q_157.value, (IStrategoList)extraction.constNil0);
      g_158 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_158, NO_STRATEGIES, new IStrategoTerm[]{extraction.const420});
      if(term == null)
        break Fail437;
      i_158 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, r_157);
      if(term == null)
        break Fail437;
      term = put_syntax_sort_0_1.instance.invoke(context, i_158, term);
      if(term == null)
        break Fail437;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}