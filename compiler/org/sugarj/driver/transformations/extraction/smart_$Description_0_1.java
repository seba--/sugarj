package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Description_0_1 extends Strategy 
{ 
  public static smart_$Description_0_1 instance = new smart_$Description_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_159)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_159 = new TermReference(ref_n_159);
    context.push("smart_Description_0_1");
    Fail440:
    { 
      IStrategoTerm o_159 = null;
      IStrategoTerm v_159 = null;
      IStrategoTerm x_159 = null;
      term = extraction.constNil0;
      lifted184 lifted1840 = new lifted184();
      lifted1840.n_159 = n_159;
      term = try_1_0.instance.invoke(context, term, lifted1840);
      if(term == null)
        break Fail440;
      o_159 = term;
      if(n_159.value == null)
        break Fail440;
      term = (IStrategoTerm)termFactory.makeListCons(n_159.value, (IStrategoList)extraction.constNil0);
      v_159 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_159, NO_STRATEGIES, new IStrategoTerm[]{extraction.const423});
      if(term == null)
        break Fail440;
      x_159 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_159);
      if(term == null)
        break Fail440;
      term = put_syntax_sort_0_1.instance.invoke(context, x_159, term);
      if(term == null)
        break Fail440;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}