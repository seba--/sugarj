package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Import_0_1 extends Strategy 
{ 
  public static smart_$Import_0_1 instance = new smart_$Import_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_175)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_175 = new TermReference(ref_c_175);
    context.push("smart_Import_0_1");
    Fail465:
    { 
      IStrategoTerm d_175 = null;
      IStrategoTerm p_175 = null;
      IStrategoTerm r_175 = null;
      term = extraction.constNil0;
      lifted212 lifted2120 = new lifted212();
      lifted2120.c_175 = c_175;
      term = try_1_0.instance.invoke(context, term, lifted2120);
      if(term == null)
        break Fail465;
      lifted213 lifted2130 = new lifted213();
      lifted2130.c_175 = c_175;
      term = try_1_0.instance.invoke(context, term, lifted2130);
      if(term == null)
        break Fail465;
      d_175 = term;
      if(c_175.value == null)
        break Fail465;
      term = (IStrategoTerm)termFactory.makeListCons(c_175.value, (IStrategoList)extraction.constNil0);
      p_175 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_175, NO_STRATEGIES, new IStrategoTerm[]{extraction.const80});
      if(term == null)
        break Fail465;
      r_175 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_175);
      if(term == null)
        break Fail465;
      term = put_syntax_sort_0_1.instance.invoke(context, r_175, term);
      if(term == null)
        break Fail465;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}