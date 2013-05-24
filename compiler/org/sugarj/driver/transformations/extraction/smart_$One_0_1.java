package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$One_0_1 extends Strategy 
{ 
  public static smart_$One_0_1 instance = new smart_$One_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_264)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_264 = new TermReference(ref_t_264);
    context.push("smart_One_0_1");
    Fail596:
    { 
      IStrategoTerm u_264 = null;
      IStrategoTerm f_265 = null;
      IStrategoTerm h_265 = null;
      term = extraction.constNil0;
      lifted367 lifted3670 = new lifted367();
      lifted3670.t_264 = t_264;
      term = try_1_0.instance.invoke(context, term, lifted3670);
      if(term == null)
        break Fail596;
      u_264 = term;
      if(t_264.value == null)
        break Fail596;
      term = (IStrategoTerm)termFactory.makeListCons(t_264.value, (IStrategoList)extraction.constNil0);
      f_265 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_265, NO_STRATEGIES, new IStrategoTerm[]{extraction.const548});
      if(term == null)
        break Fail596;
      h_265 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_264);
      if(term == null)
        break Fail596;
      term = put_syntax_sort_0_1.instance.invoke(context, h_265, term);
      if(term == null)
        break Fail596;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}