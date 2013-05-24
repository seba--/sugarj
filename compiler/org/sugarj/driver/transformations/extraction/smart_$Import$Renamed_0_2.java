package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Import$Renamed_0_2 extends Strategy 
{ 
  public static smart_$Import$Renamed_0_2 instance = new smart_$Import$Renamed_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_175, IStrategoTerm ref_t_175)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_175 = new TermReference(ref_s_175);
    TermReference t_175 = new TermReference(ref_t_175);
    context.push("smart_ImportRenamed_0_2");
    Fail466:
    { 
      IStrategoTerm u_175 = null;
      IStrategoTerm e_176 = null;
      IStrategoTerm g_176 = null;
      term = extraction.constNil0;
      lifted214 lifted2140 = new lifted214();
      lifted2140.s_175 = s_175;
      lifted2140.t_175 = t_175;
      term = try_1_0.instance.invoke(context, term, lifted2140);
      if(term == null)
        break Fail466;
      u_175 = term;
      if(s_175.value == null || t_175.value == null)
        break Fail466;
      term = (IStrategoTerm)termFactory.makeListCons(s_175.value, termFactory.makeListCons(t_175.value, (IStrategoList)extraction.constNil0));
      e_176 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_176, NO_STRATEGIES, new IStrategoTerm[]{extraction.const437});
      if(term == null)
        break Fail466;
      g_176 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_175);
      if(term == null)
        break Fail466;
      term = put_syntax_sort_0_1.instance.invoke(context, g_176, term);
      if(term == null)
        break Fail466;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}