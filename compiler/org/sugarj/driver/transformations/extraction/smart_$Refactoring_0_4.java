package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Refactoring_0_4 extends Strategy 
{ 
  public static smart_$Refactoring_0_4 instance = new smart_$Refactoring_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_110, IStrategoTerm ref_d_110, IStrategoTerm ref_e_110, IStrategoTerm ref_f_110)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_110 = new TermReference(ref_c_110);
    TermReference d_110 = new TermReference(ref_d_110);
    TermReference e_110 = new TermReference(ref_e_110);
    TermReference f_110 = new TermReference(ref_f_110);
    context.push("smart_Refactoring_0_4");
    Fail372:
    { 
      IStrategoTerm g_110 = null;
      IStrategoTerm b_111 = null;
      IStrategoTerm e_111 = null;
      term = extraction.constNil0;
      lifted92 lifted920 = new lifted92();
      lifted920.c_110 = c_110;
      lifted920.d_110 = d_110;
      lifted920.e_110 = e_110;
      lifted920.f_110 = f_110;
      term = try_1_0.instance.invoke(context, term, lifted920);
      if(term == null)
        break Fail372;
      g_110 = term;
      if(c_110.value == null || (d_110.value == null || (e_110.value == null || f_110.value == null)))
        break Fail372;
      term = (IStrategoTerm)termFactory.makeListCons(c_110.value, termFactory.makeListCons(d_110.value, termFactory.makeListCons(e_110.value, termFactory.makeListCons(f_110.value, (IStrategoList)extraction.constNil0))));
      b_111 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_111, NO_STRATEGIES, new IStrategoTerm[]{extraction.const363});
      if(term == null)
        break Fail372;
      e_111 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_110);
      if(term == null)
        break Fail372;
      term = put_syntax_sort_0_1.instance.invoke(context, e_111, term);
      if(term == null)
        break Fail372;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}