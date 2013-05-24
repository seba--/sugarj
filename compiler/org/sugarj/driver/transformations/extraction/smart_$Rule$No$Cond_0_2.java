package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Rule$No$Cond_0_2 extends Strategy 
{ 
  public static smart_$Rule$No$Cond_0_2 instance = new smart_$Rule$No$Cond_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_202, IStrategoTerm ref_a_203)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_202 = new TermReference(ref_z_202);
    TermReference a_203 = new TermReference(ref_a_203);
    context.push("smart_RuleNoCond_0_2");
    Fail501:
    { 
      IStrategoTerm b_203 = null;
      IStrategoTerm l_203 = null;
      IStrategoTerm n_203 = null;
      term = extraction.constNil0;
      lifted259 lifted2590 = new lifted259();
      lifted2590.z_202 = z_202;
      lifted2590.a_203 = a_203;
      term = try_1_0.instance.invoke(context, term, lifted2590);
      if(term == null)
        break Fail501;
      b_203 = term;
      if(z_202.value == null || a_203.value == null)
        break Fail501;
      term = (IStrategoTerm)termFactory.makeListCons(z_202.value, termFactory.makeListCons(a_203.value, (IStrategoList)extraction.constNil0));
      l_203 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_203, NO_STRATEGIES, new IStrategoTerm[]{extraction.const467});
      if(term == null)
        break Fail501;
      n_203 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_203);
      if(term == null)
        break Fail501;
      term = put_syntax_sort_0_1.instance.invoke(context, n_203, term);
      if(term == null)
        break Fail501;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}