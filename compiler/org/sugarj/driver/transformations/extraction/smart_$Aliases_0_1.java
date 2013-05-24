package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Aliases_0_1 extends Strategy 
{ 
  public static smart_$Aliases_0_1 instance = new smart_$Aliases_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_163)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_163 = new TermReference(ref_d_163);
    context.push("smart_Aliases_0_1");
    Fail446:
    { 
      IStrategoTerm e_163 = null;
      IStrategoTerm w_163 = null;
      IStrategoTerm y_163 = null;
      term = extraction.constNil0;
      lifted191 lifted1911 = new lifted191();
      lifted1911.d_163 = d_163;
      term = try_1_0.instance.invoke(context, term, lifted1911);
      if(term == null)
        break Fail446;
      e_163 = term;
      if(d_163.value == null)
        break Fail446;
      term = (IStrategoTerm)termFactory.makeListCons(d_163.value, (IStrategoList)extraction.constNil0);
      w_163 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_163, NO_STRATEGIES, new IStrategoTerm[]{extraction.const68});
      if(term == null)
        break Fail446;
      y_163 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_163);
      if(term == null)
        break Fail446;
      term = put_syntax_sort_0_1.instance.invoke(context, y_163, term);
      if(term == null)
        break Fail446;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}