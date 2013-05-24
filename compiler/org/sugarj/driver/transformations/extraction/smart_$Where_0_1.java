package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Where_0_1 extends Strategy 
{ 
  public static smart_$Where_0_1 instance = new smart_$Where_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_210)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_210 = new TermReference(ref_n_210);
    context.push("smart_Where_0_1");
    Fail513:
    { 
      IStrategoTerm o_210 = null;
      IStrategoTerm v_210 = null;
      IStrategoTerm y_210 = null;
      term = extraction.constNil0;
      lifted272 lifted2720 = new lifted272();
      lifted2720.n_210 = n_210;
      term = try_1_0.instance.invoke(context, term, lifted2720);
      if(term == null)
        break Fail513;
      o_210 = term;
      if(n_210.value == null)
        break Fail513;
      term = (IStrategoTerm)termFactory.makeListCons(n_210.value, (IStrategoList)extraction.constNil0);
      v_210 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_210, NO_STRATEGIES, new IStrategoTerm[]{extraction.const478});
      if(term == null)
        break Fail513;
      y_210 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_210);
      if(term == null)
        break Fail513;
      term = put_syntax_sort_0_1.instance.invoke(context, y_210, term);
      if(term == null)
        break Fail513;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}