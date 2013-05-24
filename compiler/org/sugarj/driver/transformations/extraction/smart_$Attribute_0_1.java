package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Attribute_0_1 extends Strategy 
{ 
  public static smart_$Attribute_0_1 instance = new smart_$Attribute_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_155)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_155 = new TermReference(ref_r_155);
    context.push("smart_Attribute_0_1");
    Fail434:
    { 
      IStrategoTerm s_155 = null;
      IStrategoTerm z_155 = null;
      IStrategoTerm d_156 = null;
      term = extraction.constNil0;
      lifted178 lifted1780 = new lifted178();
      lifted1780.r_155 = r_155;
      term = try_1_0.instance.invoke(context, term, lifted1780);
      if(term == null)
        break Fail434;
      s_155 = term;
      if(r_155.value == null)
        break Fail434;
      term = (IStrategoTerm)termFactory.makeListCons(r_155.value, (IStrategoList)extraction.constNil0);
      z_155 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_155, NO_STRATEGIES, new IStrategoTerm[]{extraction.const126});
      if(term == null)
        break Fail434;
      d_156 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_155);
      if(term == null)
        break Fail434;
      term = put_syntax_sort_0_1.instance.invoke(context, d_156, term);
      if(term == null)
        break Fail434;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}