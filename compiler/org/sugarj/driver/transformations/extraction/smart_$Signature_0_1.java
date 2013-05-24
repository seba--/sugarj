package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Signature_0_1 extends Strategy 
{ 
  public static smart_$Signature_0_1 instance = new smart_$Signature_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_93)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_93 = new TermReference(ref_w_93);
    context.push("smart_Signature_0_1");
    Fail346:
    { 
      IStrategoTerm x_93 = null;
      IStrategoTerm j_94 = null;
      IStrategoTerm l_94 = null;
      term = extraction.constNil0;
      lifted50 lifted505 = new lifted50();
      lifted505.w_93 = w_93;
      term = try_1_0.instance.invoke(context, term, lifted505);
      if(term == null)
        break Fail346;
      lifted51 lifted510 = new lifted51();
      lifted510.w_93 = w_93;
      term = try_1_0.instance.invoke(context, term, lifted510);
      if(term == null)
        break Fail346;
      x_93 = term;
      if(w_93.value == null)
        break Fail346;
      term = (IStrategoTerm)termFactory.makeListCons(w_93.value, (IStrategoList)extraction.constNil0);
      j_94 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_94, NO_STRATEGIES, new IStrategoTerm[]{extraction.const335});
      if(term == null)
        break Fail346;
      l_94 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_93);
      if(term == null)
        break Fail346;
      term = put_syntax_sort_0_1.instance.invoke(context, l_94, term);
      if(term == null)
        break Fail346;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}