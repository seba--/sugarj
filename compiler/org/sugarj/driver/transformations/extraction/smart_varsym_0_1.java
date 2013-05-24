package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_varsym_0_1 extends Strategy 
{ 
  public static smart_varsym_0_1 instance = new smart_varsym_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_320)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_320 = new TermReference(ref_b_320);
    context.push("smart_varsym_0_1");
    Fail679:
    { 
      IStrategoTerm c_320 = null;
      IStrategoTerm j_320 = null;
      IStrategoTerm m_320 = null;
      term = extraction.constNil0;
      lifted460 lifted4600 = new lifted460();
      lifted4600.b_320 = b_320;
      term = try_1_0.instance.invoke(context, term, lifted4600);
      if(term == null)
        break Fail679;
      c_320 = term;
      if(b_320.value == null)
        break Fail679;
      term = (IStrategoTerm)termFactory.makeListCons(b_320.value, (IStrategoList)extraction.constNil0);
      j_320 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_320, NO_STRATEGIES, new IStrategoTerm[]{extraction.const627});
      if(term == null)
        break Fail679;
      m_320 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_320);
      if(term == null)
        break Fail679;
      term = put_syntax_sort_0_1.instance.invoke(context, m_320, term);
      if(term == null)
        break Fail679;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}