package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_fun_0_1 extends Strategy 
{ 
  public static smart_fun_0_1 instance = new smart_fun_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_324)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_324 = new TermReference(ref_x_324);
    context.push("smart_fun_0_1");
    Fail689:
    { 
      IStrategoTerm y_324 = null;
      IStrategoTerm f_325 = null;
      IStrategoTerm h_325 = null;
      term = extraction.constNil0;
      lifted470 lifted4700 = new lifted470();
      lifted4700.x_324 = x_324;
      term = try_1_0.instance.invoke(context, term, lifted4700);
      if(term == null)
        break Fail689;
      y_324 = term;
      if(x_324.value == null)
        break Fail689;
      term = (IStrategoTerm)termFactory.makeListCons(x_324.value, (IStrategoList)extraction.constNil0);
      f_325 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_325, NO_STRATEGIES, new IStrategoTerm[]{extraction.const637});
      if(term == null)
        break Fail689;
      h_325 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_324);
      if(term == null)
        break Fail689;
      term = put_syntax_sort_0_1.instance.invoke(context, h_325, term);
      if(term == null)
        break Fail689;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}