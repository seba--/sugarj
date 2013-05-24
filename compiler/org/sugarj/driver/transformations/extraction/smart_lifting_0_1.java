package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_lifting_0_1 extends Strategy 
{ 
  public static smart_lifting_0_1 instance = new smart_lifting_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_306)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_306 = new TermReference(ref_p_306);
    context.push("smart_lifting_0_1");
    Fail654:
    { 
      IStrategoTerm q_306 = null;
      IStrategoTerm x_306 = null;
      IStrategoTerm z_306 = null;
      term = extraction.constNil0;
      lifted435 lifted4350 = new lifted435();
      lifted4350.p_306 = p_306;
      term = try_1_0.instance.invoke(context, term, lifted4350);
      if(term == null)
        break Fail654;
      q_306 = term;
      if(p_306.value == null)
        break Fail654;
      term = (IStrategoTerm)termFactory.makeListCons(p_306.value, (IStrategoList)extraction.constNil0);
      x_306 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_306, NO_STRATEGIES, new IStrategoTerm[]{extraction.const603});
      if(term == null)
        break Fail654;
      z_306 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_306);
      if(term == null)
        break Fail654;
      term = put_syntax_sort_0_1.instance.invoke(context, z_306, term);
      if(term == null)
        break Fail654;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}