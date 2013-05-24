package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Plain$Dec$Head_0_3 extends Strategy 
{ 
  public static smart_$Plain$Dec$Head_0_3 instance = new smart_$Plain$Dec$Head_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_331, IStrategoTerm ref_b_331, IStrategoTerm ref_c_331)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_331 = new TermReference(ref_a_331);
    TermReference b_331 = new TermReference(ref_b_331);
    TermReference c_331 = new TermReference(ref_c_331);
    context.push("smart_PlainDecHead_0_3");
    Fail701:
    { 
      IStrategoTerm d_331 = null;
      IStrategoTerm u_331 = null;
      IStrategoTerm w_331 = null;
      term = extraction.constNil0;
      lifted483 lifted4830 = new lifted483();
      lifted4830.a_331 = a_331;
      lifted4830.b_331 = b_331;
      lifted4830.c_331 = c_331;
      term = try_1_0.instance.invoke(context, term, lifted4830);
      if(term == null)
        break Fail701;
      d_331 = term;
      if(a_331.value == null || (b_331.value == null || c_331.value == null))
        break Fail701;
      term = (IStrategoTerm)termFactory.makeListCons(a_331.value, termFactory.makeListCons(b_331.value, termFactory.makeListCons(c_331.value, (IStrategoList)extraction.constNil0)));
      u_331 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_331, NO_STRATEGIES, new IStrategoTerm[]{extraction.const648});
      if(term == null)
        break Fail701;
      w_331 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_331);
      if(term == null)
        break Fail701;
      term = put_syntax_sort_0_1.instance.invoke(context, w_331, term);
      if(term == null)
        break Fail701;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}