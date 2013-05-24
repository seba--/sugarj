package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Call$No$Args_0_1 extends Strategy 
{ 
  public static smart_$Call$No$Args_0_1 instance = new smart_$Call$No$Args_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_220)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_220 = new TermReference(ref_p_220);
    context.push("smart_CallNoArgs_0_1");
    Fail530:
    { 
      IStrategoTerm q_220 = null;
      IStrategoTerm y_220 = null;
      IStrategoTerm a_221 = null;
      term = extraction.constNil0;
      lifted289 lifted2890 = new lifted289();
      lifted2890.p_220 = p_220;
      term = try_1_0.instance.invoke(context, term, lifted2890);
      if(term == null)
        break Fail530;
      q_220 = term;
      if(p_220.value == null)
        break Fail530;
      term = (IStrategoTerm)termFactory.makeListCons(p_220.value, (IStrategoList)extraction.constNil0);
      y_220 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_220, NO_STRATEGIES, new IStrategoTerm[]{extraction.const494});
      if(term == null)
        break Fail530;
      a_221 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_220);
      if(term == null)
        break Fail530;
      term = put_syntax_sort_0_1.instance.invoke(context, a_221, term);
      if(term == null)
        break Fail530;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}