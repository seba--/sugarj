package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$R$Dec$No$Args_0_1 extends Strategy 
{ 
  public static smart_$R$Dec$No$Args_0_1 instance = new smart_$R$Dec$No$Args_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_187)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_187 = new TermReference(ref_p_187);
    context.push("smart_RDecNoArgs_0_1");
    Fail485:
    { 
      IStrategoTerm q_187 = null;
      IStrategoTerm x_187 = null;
      IStrategoTerm z_187 = null;
      term = extraction.constNil0;
      lifted233 lifted2330 = new lifted233();
      lifted2330.p_187 = p_187;
      term = try_1_0.instance.invoke(context, term, lifted2330);
      if(term == null)
        break Fail485;
      q_187 = term;
      if(p_187.value == null)
        break Fail485;
      term = (IStrategoTerm)termFactory.makeListCons(p_187.value, (IStrategoList)extraction.constNil0);
      x_187 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_187, NO_STRATEGIES, new IStrategoTerm[]{extraction.const452});
      if(term == null)
        break Fail485;
      z_187 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_187);
      if(term == null)
        break Fail485;
      term = put_syntax_sort_0_1.instance.invoke(context, z_187, term);
      if(term == null)
        break Fail485;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}