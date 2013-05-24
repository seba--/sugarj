package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Not_0_1 extends Strategy 
{ 
  public static smart_$Not_0_1 instance = new smart_$Not_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_210)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_210 = new TermReference(ref_c_210);
    context.push("smart_Not_0_1");
    Fail512:
    { 
      IStrategoTerm d_210 = null;
      IStrategoTerm k_210 = null;
      IStrategoTerm m_210 = null;
      term = extraction.constNil0;
      lifted271 lifted2711 = new lifted271();
      lifted2711.c_210 = c_210;
      term = try_1_0.instance.invoke(context, term, lifted2711);
      if(term == null)
        break Fail512;
      d_210 = term;
      if(c_210.value == null)
        break Fail512;
      term = (IStrategoTerm)termFactory.makeListCons(c_210.value, (IStrategoList)extraction.constNil0);
      k_210 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_210, NO_STRATEGIES, new IStrategoTerm[]{extraction.const477});
      if(term == null)
        break Fail512;
      m_210 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_210);
      if(term == null)
        break Fail512;
      term = put_syntax_sort_0_1.instance.invoke(context, m_210, term);
      if(term == null)
        break Fail512;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}