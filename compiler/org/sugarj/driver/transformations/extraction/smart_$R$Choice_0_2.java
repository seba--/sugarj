package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$R$Choice_0_2 extends Strategy 
{ 
  public static smart_$R$Choice_0_2 instance = new smart_$R$Choice_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_222, IStrategoTerm ref_u_222)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_222 = new TermReference(ref_t_222);
    TermReference u_222 = new TermReference(ref_u_222);
    context.push("smart_RChoice_0_2");
    Fail534:
    { 
      IStrategoTerm x_222 = null;
      IStrategoTerm k_223 = null;
      IStrategoTerm m_223 = null;
      term = extraction.constNil0;
      lifted293 lifted2930 = new lifted293();
      lifted2930.t_222 = t_222;
      lifted2930.u_222 = u_222;
      term = try_1_0.instance.invoke(context, term, lifted2930);
      if(term == null)
        break Fail534;
      x_222 = term;
      if(t_222.value == null || u_222.value == null)
        break Fail534;
      term = (IStrategoTerm)termFactory.makeListCons(t_222.value, termFactory.makeListCons(u_222.value, (IStrategoList)extraction.constNil0));
      k_223 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_223, NO_STRATEGIES, new IStrategoTerm[]{extraction.const498});
      if(term == null)
        break Fail534;
      m_223 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_222);
      if(term == null)
        break Fail534;
      term = put_syntax_sort_0_1.instance.invoke(context, m_223, term);
      if(term == null)
        break Fail534;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}