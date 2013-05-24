package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_list_0_1 extends Strategy 
{ 
  public static smart_list_0_1 instance = new smart_list_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_271)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_271 = new TermReference(ref_t_271);
    context.push("smart_list_0_1");
    Fail607:
    { 
      IStrategoTerm u_271 = null;
      IStrategoTerm g_272 = null;
      IStrategoTerm j_272 = null;
      term = extraction.constNil0;
      lifted381 lifted3810 = new lifted381();
      lifted3810.t_271 = t_271;
      term = try_1_0.instance.invoke(context, term, lifted3810);
      if(term == null)
        break Fail607;
      lifted382 lifted3820 = new lifted382();
      lifted3820.t_271 = t_271;
      term = try_1_0.instance.invoke(context, term, lifted3820);
      if(term == null)
        break Fail607;
      u_271 = term;
      if(t_271.value == null)
        break Fail607;
      term = (IStrategoTerm)termFactory.makeListCons(t_271.value, (IStrategoList)extraction.constNil0);
      g_272 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_272, NO_STRATEGIES, new IStrategoTerm[]{extraction.const558});
      if(term == null)
        break Fail607;
      j_272 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_271);
      if(term == null)
        break Fail607;
      term = put_syntax_sort_0_1.instance.invoke(context, j_272, term);
      if(term == null)
        break Fail607;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}