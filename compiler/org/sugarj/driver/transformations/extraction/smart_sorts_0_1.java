package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_sorts_0_1 extends Strategy 
{ 
  public static smart_sorts_0_1 instance = new smart_sorts_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_97)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_97 = new TermReference(ref_m_97);
    context.push("smart_sorts_0_1");
    Fail352:
    { 
      IStrategoTerm n_97 = null;
      IStrategoTerm f_98 = null;
      IStrategoTerm h_98 = null;
      term = extraction.constNil0;
      lifted59 lifted590 = new lifted59();
      lifted590.m_97 = m_97;
      term = try_1_0.instance.invoke(context, term, lifted590);
      if(term == null)
        break Fail352;
      lifted60 lifted600 = new lifted60();
      lifted600.m_97 = m_97;
      term = try_1_0.instance.invoke(context, term, lifted600);
      if(term == null)
        break Fail352;
      n_97 = term;
      if(m_97.value == null)
        break Fail352;
      term = (IStrategoTerm)termFactory.makeListCons(m_97.value, (IStrategoList)extraction.constNil0);
      f_98 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_98, NO_STRATEGIES, new IStrategoTerm[]{extraction.const342});
      if(term == null)
        break Fail352;
      h_98 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_97);
      if(term == null)
        break Fail352;
      term = put_syntax_sort_0_1.instance.invoke(context, h_98, term);
      if(term == null)
        break Fail352;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}