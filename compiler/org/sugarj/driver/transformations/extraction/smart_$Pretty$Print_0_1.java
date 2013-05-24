package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Pretty$Print_0_1 extends Strategy 
{ 
  public static smart_$Pretty$Print_0_1 instance = new smart_$Pretty$Print_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_109)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_109 = new TermReference(ref_r_109);
    context.push("smart_PrettyPrint_0_1");
    Fail371:
    { 
      IStrategoTerm s_109 = null;
      IStrategoTerm z_109 = null;
      IStrategoTerm b_110 = null;
      term = extraction.constNil0;
      lifted91 lifted910 = new lifted91();
      lifted910.r_109 = r_109;
      term = try_1_0.instance.invoke(context, term, lifted910);
      if(term == null)
        break Fail371;
      s_109 = term;
      if(r_109.value == null)
        break Fail371;
      term = (IStrategoTerm)termFactory.makeListCons(r_109.value, (IStrategoList)extraction.constNil0);
      z_109 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_109, NO_STRATEGIES, new IStrategoTerm[]{extraction.const362});
      if(term == null)
        break Fail371;
      b_110 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_109);
      if(term == null)
        break Fail371;
      term = put_syntax_sort_0_1.instance.invoke(context, b_110, term);
      if(term == null)
        break Fail371;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}