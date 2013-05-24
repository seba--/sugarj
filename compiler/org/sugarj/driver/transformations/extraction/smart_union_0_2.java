package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_union_0_2 extends Strategy 
{ 
  public static smart_union_0_2 instance = new smart_union_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_299, IStrategoTerm ref_j_299)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_299 = new TermReference(ref_i_299);
    TermReference j_299 = new TermReference(ref_j_299);
    context.push("smart_union_0_2");
    Fail639:
    { 
      IStrategoTerm k_299 = null;
      IStrategoTerm v_299 = null;
      IStrategoTerm y_299 = null;
      term = extraction.constNil0;
      lifted418 lifted4180 = new lifted418();
      lifted4180.i_299 = i_299;
      lifted4180.j_299 = j_299;
      term = try_1_0.instance.invoke(context, term, lifted4180);
      if(term == null)
        break Fail639;
      k_299 = term;
      if(i_299.value == null || j_299.value == null)
        break Fail639;
      term = (IStrategoTerm)termFactory.makeListCons(i_299.value, termFactory.makeListCons(j_299.value, (IStrategoList)extraction.constNil0));
      v_299 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_299, NO_STRATEGIES, new IStrategoTerm[]{extraction.const590});
      if(term == null)
        break Fail639;
      y_299 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_299);
      if(term == null)
        break Fail639;
      term = put_syntax_sort_0_1.instance.invoke(context, y_299, term);
      if(term == null)
        break Fail639;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}