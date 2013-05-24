package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Rule_0_3 extends Strategy 
{ 
  public static smart_$Rule_0_3 instance = new smart_$Rule_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_203, IStrategoTerm ref_p_203, IStrategoTerm ref_r_203)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_203 = new TermReference(ref_o_203);
    TermReference p_203 = new TermReference(ref_p_203);
    TermReference r_203 = new TermReference(ref_r_203);
    context.push("smart_Rule_0_3");
    Fail502:
    { 
      IStrategoTerm s_203 = null;
      IStrategoTerm s_204 = null;
      IStrategoTerm u_204 = null;
      term = extraction.constNil0;
      lifted260 lifted2600 = new lifted260();
      lifted2600.o_203 = o_203;
      lifted2600.p_203 = p_203;
      lifted2600.r_203 = r_203;
      term = try_1_0.instance.invoke(context, term, lifted2600);
      if(term == null)
        break Fail502;
      lifted261 lifted2610 = new lifted261();
      lifted2610.o_203 = o_203;
      lifted2610.p_203 = p_203;
      lifted2610.r_203 = r_203;
      term = try_1_0.instance.invoke(context, term, lifted2610);
      if(term == null)
        break Fail502;
      s_203 = term;
      if(o_203.value == null || (p_203.value == null || r_203.value == null))
        break Fail502;
      term = (IStrategoTerm)termFactory.makeListCons(o_203.value, termFactory.makeListCons(p_203.value, termFactory.makeListCons(r_203.value, (IStrategoList)extraction.constNil0)));
      s_204 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_204, NO_STRATEGIES, new IStrategoTerm[]{extraction.const190});
      if(term == null)
        break Fail502;
      u_204 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_203);
      if(term == null)
        break Fail502;
      term = put_syntax_sort_0_1.instance.invoke(context, u_204, term);
      if(term == null)
        break Fail502;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}