package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Intersect_0_3 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Intersect_0_3 instance = new smart_$Dyn$Rule$Intersect_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_193, IStrategoTerm ref_e_193, IStrategoTerm ref_f_193)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_193 = new TermReference(ref_d_193);
    TermReference e_193 = new TermReference(ref_e_193);
    TermReference f_193 = new TermReference(ref_f_193);
    context.push("smart_DynRuleIntersect_0_3");
    Fail492:
    { 
      IStrategoTerm g_193 = null;
      IStrategoTerm m_194 = null;
      IStrategoTerm o_194 = null;
      term = extraction.constNil0;
      lifted243 lifted2430 = new lifted243();
      lifted2430.d_193 = d_193;
      lifted2430.e_193 = e_193;
      lifted2430.f_193 = f_193;
      term = try_1_0.instance.invoke(context, term, lifted2430);
      if(term == null)
        break Fail492;
      lifted244 lifted2440 = new lifted244();
      lifted2440.d_193 = d_193;
      lifted2440.e_193 = e_193;
      lifted2440.f_193 = f_193;
      term = try_1_0.instance.invoke(context, term, lifted2440);
      if(term == null)
        break Fail492;
      g_193 = term;
      if(d_193.value == null || (e_193.value == null || f_193.value == null))
        break Fail492;
      term = (IStrategoTerm)termFactory.makeListCons(d_193.value, termFactory.makeListCons(e_193.value, termFactory.makeListCons(f_193.value, (IStrategoList)extraction.constNil0)));
      m_194 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_194, NO_STRATEGIES, new IStrategoTerm[]{extraction.const458});
      if(term == null)
        break Fail492;
      o_194 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_193);
      if(term == null)
        break Fail492;
      term = put_syntax_sort_0_1.instance.invoke(context, o_194, term);
      if(term == null)
        break Fail492;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}