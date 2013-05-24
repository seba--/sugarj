package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Op_0_2 extends Strategy 
{ 
  public static smart_$Op_0_2 instance = new smart_$Op_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_250, IStrategoTerm ref_a_251)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_250 = new TermReference(ref_z_250);
    TermReference a_251 = new TermReference(ref_a_251);
    context.push("smart_Op_0_2");
    Fail577:
    { 
      IStrategoTerm b_251 = null;
      IStrategoTerm m_251 = null;
      IStrategoTerm o_251 = null;
      term = extraction.constNil0;
      lifted345 lifted3450 = new lifted345();
      lifted3450.z_250 = z_250;
      lifted3450.a_251 = a_251;
      term = try_1_0.instance.invoke(context, term, lifted3450);
      if(term == null)
        break Fail577;
      b_251 = term;
      if(z_250.value == null || a_251.value == null)
        break Fail577;
      term = (IStrategoTerm)termFactory.makeListCons(z_250.value, termFactory.makeListCons(a_251.value, (IStrategoList)extraction.constNil0));
      m_251 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_251, NO_STRATEGIES, new IStrategoTerm[]{extraction.const531});
      if(term == null)
        break Fail577;
      o_251 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_251);
      if(term == null)
        break Fail577;
      term = put_syntax_sort_0_1.instance.invoke(context, o_251, term);
      if(term == null)
        break Fail577;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}