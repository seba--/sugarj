package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Import$Term_0_1 extends Strategy 
{ 
  public static smart_$Import$Term_0_1 instance = new smart_$Import$Term_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_265)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_265 = new TermReference(ref_t_265);
    context.push("smart_ImportTerm_0_1");
    Fail598:
    { 
      IStrategoTerm u_265 = null;
      IStrategoTerm c_266 = null;
      IStrategoTerm e_266 = null;
      term = extraction.constNil0;
      lifted369 lifted3690 = new lifted369();
      lifted3690.t_265 = t_265;
      term = try_1_0.instance.invoke(context, term, lifted3690);
      if(term == null)
        break Fail598;
      u_265 = term;
      if(t_265.value == null)
        break Fail598;
      term = (IStrategoTerm)termFactory.makeListCons(t_265.value, (IStrategoList)extraction.constNil0);
      c_266 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", c_266, NO_STRATEGIES, new IStrategoTerm[]{extraction.const550});
      if(term == null)
        break Fail598;
      e_266 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_265);
      if(term == null)
        break Fail598;
      term = put_syntax_sort_0_1.instance.invoke(context, e_266, term);
      if(term == null)
        break Fail598;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}