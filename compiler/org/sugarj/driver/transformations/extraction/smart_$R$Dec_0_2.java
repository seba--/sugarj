package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$R$Dec_0_2 extends Strategy 
{ 
  public static smart_$R$Dec_0_2 instance = new smart_$R$Dec_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_188, IStrategoTerm ref_b_188)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_188 = new TermReference(ref_a_188);
    TermReference b_188 = new TermReference(ref_b_188);
    context.push("smart_RDec_0_2");
    Fail486:
    { 
      IStrategoTerm c_188 = null;
      IStrategoTerm m_188 = null;
      IStrategoTerm o_188 = null;
      term = extraction.constNil0;
      lifted234 lifted2340 = new lifted234();
      lifted2340.a_188 = a_188;
      lifted2340.b_188 = b_188;
      term = try_1_0.instance.invoke(context, term, lifted2340);
      if(term == null)
        break Fail486;
      c_188 = term;
      if(a_188.value == null || b_188.value == null)
        break Fail486;
      term = (IStrategoTerm)termFactory.makeListCons(a_188.value, termFactory.makeListCons(b_188.value, (IStrategoList)extraction.constNil0));
      m_188 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_188, NO_STRATEGIES, new IStrategoTerm[]{extraction.const453});
      if(term == null)
        break Fail486;
      o_188 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_188);
      if(term == null)
        break Fail486;
      term = put_syntax_sort_0_1.instance.invoke(context, o_188, term);
      if(term == null)
        break Fail486;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}