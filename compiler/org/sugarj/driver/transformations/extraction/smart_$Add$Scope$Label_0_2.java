package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Add$Scope$Label_0_2 extends Strategy 
{ 
  public static smart_$Add$Scope$Label_0_2 instance = new smart_$Add$Scope$Label_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_179, IStrategoTerm ref_p_179)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_179 = new TermReference(ref_o_179);
    TermReference p_179 = new TermReference(ref_p_179);
    context.push("smart_AddScopeLabel_0_2");
    Fail472:
    { 
      IStrategoTerm q_179 = null;
      IStrategoTerm a_180 = null;
      IStrategoTerm c_180 = null;
      term = extraction.constNil0;
      lifted220 lifted2200 = new lifted220();
      lifted2200.o_179 = o_179;
      lifted2200.p_179 = p_179;
      term = try_1_0.instance.invoke(context, term, lifted2200);
      if(term == null)
        break Fail472;
      q_179 = term;
      if(o_179.value == null || p_179.value == null)
        break Fail472;
      term = (IStrategoTerm)termFactory.makeListCons(o_179.value, termFactory.makeListCons(p_179.value, (IStrategoList)extraction.constNil0));
      a_180 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_180, NO_STRATEGIES, new IStrategoTerm[]{extraction.const441});
      if(term == null)
        break Fail472;
      c_180 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_179);
      if(term == null)
        break Fail472;
      term = put_syntax_sort_0_1.instance.invoke(context, c_180, term);
      if(term == null)
        break Fail472;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}