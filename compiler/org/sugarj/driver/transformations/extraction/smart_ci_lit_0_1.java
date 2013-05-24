package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_ci_lit_0_1 extends Strategy 
{ 
  public static smart_ci_lit_0_1 instance = new smart_ci_lit_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_278)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_278 = new TermReference(ref_c_278);
    context.push("smart_ci_lit_0_1");
    Fail618:
    { 
      IStrategoTerm e_278 = null;
      IStrategoTerm o_278 = null;
      IStrategoTerm t_278 = null;
      term = extraction.constNil0;
      lifted395 lifted3950 = new lifted395();
      lifted3950.c_278 = c_278;
      term = try_1_0.instance.invoke(context, term, lifted3950);
      if(term == null)
        break Fail618;
      e_278 = term;
      if(c_278.value == null)
        break Fail618;
      term = (IStrategoTerm)termFactory.makeListCons(c_278.value, (IStrategoList)extraction.constNil0);
      o_278 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_278, NO_STRATEGIES, new IStrategoTerm[]{extraction.const569});
      if(term == null)
        break Fail618;
      t_278 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_278);
      if(term == null)
        break Fail618;
      term = put_syntax_sort_0_1.instance.invoke(context, t_278, term);
      if(term == null)
        break Fail618;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}