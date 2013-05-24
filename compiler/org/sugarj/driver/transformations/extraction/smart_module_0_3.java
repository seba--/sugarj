package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_module_0_3 extends Strategy 
{ 
  public static smart_module_0_3 instance = new smart_module_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_313, IStrategoTerm ref_s_313, IStrategoTerm ref_w_313)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_313 = new TermReference(ref_r_313);
    TermReference s_313 = new TermReference(ref_s_313);
    TermReference w_313 = new TermReference(ref_w_313);
    context.push("smart_module_0_3");
    Fail667:
    { 
      IStrategoTerm x_313 = null;
      IStrategoTerm m_314 = null;
      IStrategoTerm o_314 = null;
      term = extraction.constNil0;
      lifted448 lifted4480 = new lifted448();
      lifted4480.r_313 = r_313;
      lifted4480.s_313 = s_313;
      lifted4480.w_313 = w_313;
      term = try_1_0.instance.invoke(context, term, lifted4480);
      if(term == null)
        break Fail667;
      x_313 = term;
      if(r_313.value == null || (s_313.value == null || w_313.value == null))
        break Fail667;
      term = (IStrategoTerm)termFactory.makeListCons(r_313.value, termFactory.makeListCons(s_313.value, termFactory.makeListCons(w_313.value, (IStrategoList)extraction.constNil0)));
      m_314 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_314, NO_STRATEGIES, new IStrategoTerm[]{extraction.const616});
      if(term == null)
        break Fail667;
      o_314 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_313);
      if(term == null)
        break Fail667;
      term = put_syntax_sort_0_1.instance.invoke(context, o_314, term);
      if(term == null)
        break Fail667;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}