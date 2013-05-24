package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Language_0_2 extends Strategy 
{ 
  public static smart_$Language_0_2 instance = new smart_$Language_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_156, IStrategoTerm ref_f_156)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_156 = new TermReference(ref_e_156);
    TermReference f_156 = new TermReference(ref_f_156);
    context.push("smart_Language_0_2");
    Fail435:
    { 
      IStrategoTerm g_156 = null;
      IStrategoTerm x_156 = null;
      IStrategoTerm z_156 = null;
      term = extraction.constNil0;
      lifted179 lifted1790 = new lifted179();
      lifted1790.e_156 = e_156;
      lifted1790.f_156 = f_156;
      term = try_1_0.instance.invoke(context, term, lifted1790);
      if(term == null)
        break Fail435;
      g_156 = term;
      if(e_156.value == null || f_156.value == null)
        break Fail435;
      term = (IStrategoTerm)termFactory.makeListCons(e_156.value, termFactory.makeListCons(f_156.value, (IStrategoList)extraction.constNil0));
      x_156 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_156, NO_STRATEGIES, new IStrategoTerm[]{extraction.const418});
      if(term == null)
        break Fail435;
      z_156 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_156);
      if(term == null)
        break Fail435;
      term = put_syntax_sort_0_1.instance.invoke(context, z_156, term);
      if(term == null)
        break Fail435;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}