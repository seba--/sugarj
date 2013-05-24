package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Where$Clause_0_1 extends Strategy 
{ 
  public static smart_$Where$Clause_0_1 instance = new smart_$Where$Clause_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_204)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_204 = new TermReference(ref_v_204);
    context.push("smart_WhereClause_0_1");
    Fail503:
    { 
      IStrategoTerm w_204 = null;
      IStrategoTerm g_205 = null;
      IStrategoTerm i_205 = null;
      term = extraction.constNil0;
      lifted262 lifted2620 = new lifted262();
      lifted2620.v_204 = v_204;
      term = try_1_0.instance.invoke(context, term, lifted2620);
      if(term == null)
        break Fail503;
      w_204 = term;
      if(v_204.value == null)
        break Fail503;
      term = (IStrategoTerm)termFactory.makeListCons(v_204.value, (IStrategoList)extraction.constNil0);
      g_205 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_205, NO_STRATEGIES, new IStrategoTerm[]{extraction.const468});
      if(term == null)
        break Fail503;
      i_205 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_204);
      if(term == null)
        break Fail503;
      term = put_syntax_sort_0_1.instance.invoke(context, i_205, term);
      if(term == null)
        break Fail503;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}