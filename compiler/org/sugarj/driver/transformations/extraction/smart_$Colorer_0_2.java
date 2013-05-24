package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Colorer_0_2 extends Strategy 
{ 
  public static smart_$Colorer_0_2 instance = new smart_$Colorer_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_127, IStrategoTerm ref_p_127)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_127 = new TermReference(ref_o_127);
    TermReference p_127 = new TermReference(ref_p_127);
    context.push("smart_Colorer_0_2");
    Fail399:
    { 
      IStrategoTerm q_127 = null;
      IStrategoTerm a_128 = null;
      IStrategoTerm c_128 = null;
      term = extraction.constNil0;
      lifted130 lifted1300 = new lifted130();
      lifted1300.o_127 = o_127;
      lifted1300.p_127 = p_127;
      term = try_1_0.instance.invoke(context, term, lifted1300);
      if(term == null)
        break Fail399;
      q_127 = term;
      if(o_127.value == null || p_127.value == null)
        break Fail399;
      term = (IStrategoTerm)termFactory.makeListCons(o_127.value, termFactory.makeListCons(p_127.value, (IStrategoList)extraction.constNil0));
      a_128 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_128, NO_STRATEGIES, new IStrategoTerm[]{extraction.const388});
      if(term == null)
        break Fail399;
      c_128 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_127);
      if(term == null)
        break Fail399;
      term = put_syntax_sort_0_1.instance.invoke(context, c_128, term);
      if(term == null)
        break Fail399;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}