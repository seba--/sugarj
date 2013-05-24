package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$L$Rule_0_1 extends Strategy 
{ 
  public static smart_$L$Rule_0_1 instance = new smart_$L$Rule_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_221)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_221 = new TermReference(ref_b_221);
    context.push("smart_LRule_0_1");
    Fail531:
    { 
      IStrategoTerm c_221 = null;
      IStrategoTerm m_221 = null;
      IStrategoTerm o_221 = null;
      term = extraction.constNil0;
      lifted290 lifted2900 = new lifted290();
      lifted2900.b_221 = b_221;
      term = try_1_0.instance.invoke(context, term, lifted2900);
      if(term == null)
        break Fail531;
      c_221 = term;
      if(b_221.value == null)
        break Fail531;
      term = (IStrategoTerm)termFactory.makeListCons(b_221.value, (IStrategoList)extraction.constNil0);
      m_221 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_221, NO_STRATEGIES, new IStrategoTerm[]{extraction.const495});
      if(term == null)
        break Fail531;
      o_221 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_221);
      if(term == null)
        break Fail531;
      term = put_syntax_sort_0_1.instance.invoke(context, o_221, term);
      if(term == null)
        break Fail531;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}