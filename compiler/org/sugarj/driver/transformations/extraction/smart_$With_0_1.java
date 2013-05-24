package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$With_0_1 extends Strategy 
{ 
  public static smart_$With_0_1 instance = new smart_$With_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_210)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_210 = new TermReference(ref_z_210);
    context.push("smart_With_0_1");
    Fail514:
    { 
      IStrategoTerm a_211 = null;
      IStrategoTerm h_211 = null;
      IStrategoTerm j_211 = null;
      term = extraction.constNil0;
      lifted273 lifted2730 = new lifted273();
      lifted2730.z_210 = z_210;
      term = try_1_0.instance.invoke(context, term, lifted2730);
      if(term == null)
        break Fail514;
      a_211 = term;
      if(z_210.value == null)
        break Fail514;
      term = (IStrategoTerm)termFactory.makeListCons(z_210.value, (IStrategoList)extraction.constNil0);
      h_211 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_211, NO_STRATEGIES, new IStrategoTerm[]{extraction.const479});
      if(term == null)
        break Fail514;
      j_211 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_211);
      if(term == null)
        break Fail514;
      term = put_syntax_sort_0_1.instance.invoke(context, j_211, term);
      if(term == null)
        break Fail514;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}