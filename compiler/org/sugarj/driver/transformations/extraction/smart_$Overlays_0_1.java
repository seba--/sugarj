package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Overlays_0_1 extends Strategy 
{ 
  public static smart_$Overlays_0_1 instance = new smart_$Overlays_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_95)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_95 = new TermReference(ref_e_95);
    context.push("smart_Overlays_0_1");
    Fail348:
    { 
      IStrategoTerm f_95 = null;
      IStrategoTerm u_95 = null;
      IStrategoTerm w_95 = null;
      term = extraction.constNil0;
      lifted54 lifted540 = new lifted54();
      lifted540.e_95 = e_95;
      term = try_1_0.instance.invoke(context, term, lifted540);
      if(term == null)
        break Fail348;
      lifted55 lifted550 = new lifted55();
      lifted550.e_95 = e_95;
      term = try_1_0.instance.invoke(context, term, lifted550);
      if(term == null)
        break Fail348;
      f_95 = term;
      if(e_95.value == null)
        break Fail348;
      term = (IStrategoTerm)termFactory.makeListCons(e_95.value, (IStrategoList)extraction.constNil0);
      u_95 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_95, NO_STRATEGIES, new IStrategoTerm[]{extraction.const337});
      if(term == null)
        break Fail348;
      w_95 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_95);
      if(term == null)
        break Fail348;
      term = put_syntax_sort_0_1.instance.invoke(context, w_95, term);
      if(term == null)
        break Fail348;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}