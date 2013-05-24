package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$List_0_1 extends Strategy 
{ 
  public static smart_$List_0_1 instance = new smart_$List_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_235)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_235 = new TermReference(ref_e_235);
    context.push("smart_List_0_1");
    Fail551:
    { 
      IStrategoTerm f_235 = null;
      IStrategoTerm q_235 = null;
      IStrategoTerm s_235 = null;
      term = extraction.constNil0;
      lifted314 lifted3140 = new lifted314();
      lifted3140.e_235 = e_235;
      term = try_1_0.instance.invoke(context, term, lifted3140);
      if(term == null)
        break Fail551;
      f_235 = term;
      if(e_235.value == null)
        break Fail551;
      term = (IStrategoTerm)termFactory.makeListCons(e_235.value, (IStrategoList)extraction.constNil0);
      q_235 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_235, NO_STRATEGIES, new IStrategoTerm[]{extraction.const66});
      if(term == null)
        break Fail551;
      s_235 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_235);
      if(term == null)
        break Fail551;
      term = put_syntax_sort_0_1.instance.invoke(context, s_235, term);
      if(term == null)
        break Fail551;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}