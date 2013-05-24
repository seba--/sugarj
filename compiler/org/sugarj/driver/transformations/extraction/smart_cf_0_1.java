package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_cf_0_1 extends Strategy 
{ 
  public static smart_cf_0_1 instance = new smart_cf_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_318)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_318 = new TermReference(ref_z_318);
    context.push("smart_cf_0_1");
    Fail677:
    { 
      IStrategoTerm a_319 = null;
      IStrategoTerm l_319 = null;
      IStrategoTerm o_319 = null;
      term = extraction.constNil0;
      lifted458 lifted4580 = new lifted458();
      lifted4580.z_318 = z_318;
      term = try_1_0.instance.invoke(context, term, lifted4580);
      if(term == null)
        break Fail677;
      a_319 = term;
      if(z_318.value == null)
        break Fail677;
      term = (IStrategoTerm)termFactory.makeListCons(z_318.value, (IStrategoList)extraction.constNil0);
      l_319 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_319, NO_STRATEGIES, new IStrategoTerm[]{extraction.const625});
      if(term == null)
        break Fail677;
      o_319 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_319);
      if(term == null)
        break Fail677;
      term = put_syntax_sort_0_1.instance.invoke(context, o_319, term);
      if(term == null)
        break Fail677;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}