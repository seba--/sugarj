package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Literal_0_1 extends Strategy 
{ 
  public static smart_$Literal_0_1 instance = new smart_$Literal_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_136)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_136 = new TermReference(ref_w_136);
    context.push("smart_Literal_0_1");
    Fail407:
    { 
      IStrategoTerm x_136 = null;
      IStrategoTerm h_137 = null;
      IStrategoTerm j_137 = null;
      term = extraction.constNil0;
      lifted140 lifted1400 = new lifted140();
      lifted1400.w_136 = w_136;
      term = try_1_0.instance.invoke(context, term, lifted1400);
      if(term == null)
        break Fail407;
      x_136 = term;
      if(w_136.value == null)
        break Fail407;
      term = (IStrategoTerm)termFactory.makeListCons(w_136.value, (IStrategoList)extraction.constNil0);
      h_137 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_137, NO_STRATEGIES, new IStrategoTerm[]{extraction.const394});
      if(term == null)
        break Fail407;
      j_137 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_136);
      if(term == null)
        break Fail407;
      term = put_syntax_sort_0_1.instance.invoke(context, j_137, term);
      if(term == null)
        break Fail407;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}