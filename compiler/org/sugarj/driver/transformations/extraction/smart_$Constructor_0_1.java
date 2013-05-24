package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Constructor_0_1 extends Strategy 
{ 
  public static smart_$Constructor_0_1 instance = new smart_$Constructor_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_171)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_171 = new TermReference(ref_x_171);
    context.push("smart_Constructor_0_1");
    Fail460:
    { 
      IStrategoTerm y_171 = null;
      IStrategoTerm f_172 = null;
      IStrategoTerm l_172 = null;
      term = extraction.constNil0;
      lifted206 lifted2060 = new lifted206();
      lifted2060.x_171 = x_171;
      term = try_1_0.instance.invoke(context, term, lifted2060);
      if(term == null)
        break Fail460;
      y_171 = term;
      if(x_171.value == null)
        break Fail460;
      term = (IStrategoTerm)termFactory.makeListCons(x_171.value, (IStrategoList)extraction.constNil0);
      f_172 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_172, NO_STRATEGIES, new IStrategoTerm[]{extraction.const111});
      if(term == null)
        break Fail460;
      l_172 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_171);
      if(term == null)
        break Fail460;
      term = put_syntax_sort_0_1.instance.invoke(context, l_172, term);
      if(term == null)
        break Fail460;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}