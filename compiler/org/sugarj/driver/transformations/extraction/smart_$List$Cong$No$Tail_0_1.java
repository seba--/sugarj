package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$List$Cong$No$Tail_0_1 extends Strategy 
{ 
  public static smart_$List$Cong$No$Tail_0_1 instance = new smart_$List$Cong$No$Tail_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_218)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_218 = new TermReference(ref_i_218);
    context.push("smart_ListCongNoTail_0_1");
    Fail527:
    { 
      IStrategoTerm j_218 = null;
      IStrategoTerm x_218 = null;
      IStrategoTerm b_219 = null;
      term = extraction.constNil0;
      lifted286 lifted2860 = new lifted286();
      lifted2860.i_218 = i_218;
      term = try_1_0.instance.invoke(context, term, lifted2860);
      if(term == null)
        break Fail527;
      j_218 = term;
      if(i_218.value == null)
        break Fail527;
      term = (IStrategoTerm)termFactory.makeListCons(i_218.value, (IStrategoList)extraction.constNil0);
      x_218 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_218, NO_STRATEGIES, new IStrategoTerm[]{extraction.const491});
      if(term == null)
        break Fail527;
      b_219 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_218);
      if(term == null)
        break Fail527;
      term = put_syntax_sort_0_1.instance.invoke(context, b_219, term);
      if(term == null)
        break Fail527;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}