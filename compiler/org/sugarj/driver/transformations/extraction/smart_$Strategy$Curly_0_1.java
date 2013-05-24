package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Strategy$Curly_0_1 extends Strategy 
{ 
  public static smart_$Strategy$Curly_0_1 instance = new smart_$Strategy$Curly_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_215)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_215 = new TermReference(ref_x_215);
    context.push("smart_StrategyCurly_0_1");
    Fail524:
    { 
      IStrategoTerm y_215 = null;
      IStrategoTerm f_216 = null;
      IStrategoTerm i_216 = null;
      term = extraction.constNil0;
      lifted283 lifted2830 = new lifted283();
      lifted2830.x_215 = x_215;
      term = try_1_0.instance.invoke(context, term, lifted2830);
      if(term == null)
        break Fail524;
      y_215 = term;
      if(x_215.value == null)
        break Fail524;
      term = (IStrategoTerm)termFactory.makeListCons(x_215.value, (IStrategoList)extraction.constNil0);
      f_216 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_216, NO_STRATEGIES, new IStrategoTerm[]{extraction.const197});
      if(term == null)
        break Fail524;
      i_216 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_215);
      if(term == null)
        break Fail524;
      term = put_syntax_sort_0_1.instance.invoke(context, i_216, term);
      if(term == null)
        break Fail524;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}