package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_comp_0_1 extends Strategy 
{ 
  public static smart_comp_0_1 instance = new smart_comp_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_288)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_288 = new TermReference(ref_h_288);
    context.push("smart_comp_0_1");
    Fail636:
    { 
      IStrategoTerm i_288 = null;
      IStrategoTerm x_297 = null;
      IStrategoTerm z_297 = null;
      term = extraction.constNil0;
      lifted415 lifted4150 = new lifted415();
      lifted4150.h_288 = h_288;
      term = try_1_0.instance.invoke(context, term, lifted4150);
      if(term == null)
        break Fail636;
      i_288 = term;
      if(h_288.value == null)
        break Fail636;
      term = (IStrategoTerm)termFactory.makeListCons(h_288.value, (IStrategoList)extraction.constNil0);
      x_297 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_297, NO_STRATEGIES, new IStrategoTerm[]{extraction.const587});
      if(term == null)
        break Fail636;
      z_297 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_288);
      if(term == null)
        break Fail636;
      term = put_syntax_sort_0_1.instance.invoke(context, z_297, term);
      if(term == null)
        break Fail636;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}