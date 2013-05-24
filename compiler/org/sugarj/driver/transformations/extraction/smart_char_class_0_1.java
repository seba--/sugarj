package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_char_class_0_1 extends Strategy 
{ 
  public static smart_char_class_0_1 instance = new smart_char_class_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_268)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_268 = new TermReference(ref_m_268);
    context.push("smart_char_class_0_1");
    Fail603:
    { 
      IStrategoTerm o_268 = null;
      IStrategoTerm d_269 = null;
      IStrategoTerm f_269 = null;
      term = extraction.constNil0;
      lifted374 lifted3740 = new lifted374();
      lifted3740.m_268 = m_268;
      term = try_1_0.instance.invoke(context, term, lifted3740);
      if(term == null)
        break Fail603;
      lifted375 lifted3750 = new lifted375();
      lifted3750.m_268 = m_268;
      term = try_1_0.instance.invoke(context, term, lifted3750);
      if(term == null)
        break Fail603;
      o_268 = term;
      if(m_268.value == null)
        break Fail603;
      term = (IStrategoTerm)termFactory.makeListCons(m_268.value, (IStrategoList)extraction.constNil0);
      d_269 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_269, NO_STRATEGIES, new IStrategoTerm[]{extraction.const554});
      if(term == null)
        break Fail603;
      f_269 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_268);
      if(term == null)
        break Fail603;
      term = put_syntax_sort_0_1.instance.invoke(context, f_269, term);
      if(term == null)
        break Fail603;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}