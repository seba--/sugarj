package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$List$Sort_0_1 extends Strategy 
{ 
  public static smart_$List$Sort_0_1 instance = new smart_$List$Sort_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_170)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_170 = new TermReference(ref_f_170);
    context.push("smart_ListSort_0_1");
    Fail457:
    { 
      IStrategoTerm g_170 = null;
      IStrategoTerm n_170 = null;
      IStrategoTerm q_170 = null;
      term = extraction.constNil0;
      lifted203 lifted2030 = new lifted203();
      lifted2030.f_170 = f_170;
      term = try_1_0.instance.invoke(context, term, lifted2030);
      if(term == null)
        break Fail457;
      g_170 = term;
      if(f_170.value == null)
        break Fail457;
      term = (IStrategoTerm)termFactory.makeListCons(f_170.value, (IStrategoList)extraction.constNil0);
      n_170 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_170, NO_STRATEGIES, new IStrategoTerm[]{extraction.const433});
      if(term == null)
        break Fail457;
      q_170 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_170);
      if(term == null)
        break Fail457;
      term = put_syntax_sort_0_1.instance.invoke(context, q_170, term);
      if(term == null)
        break Fail457;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}