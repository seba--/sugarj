package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_unquoted_0_1 extends Strategy 
{ 
  public static smart_unquoted_0_1 instance = new smart_unquoted_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_274)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_274 = new TermReference(ref_x_274);
    context.push("smart_unquoted_0_1");
    Fail613:
    { 
      IStrategoTerm y_274 = null;
      IStrategoTerm y_275 = null;
      IStrategoTerm a_276 = null;
      term = extraction.constNil0;
      lifted389 lifted3890 = new lifted389();
      lifted3890.x_274 = x_274;
      term = try_1_0.instance.invoke(context, term, lifted3890);
      if(term == null)
        break Fail613;
      lifted390 lifted3900 = new lifted390();
      lifted3900.x_274 = x_274;
      term = try_1_0.instance.invoke(context, term, lifted3900);
      if(term == null)
        break Fail613;
      y_274 = term;
      if(x_274.value == null)
        break Fail613;
      term = (IStrategoTerm)termFactory.makeListCons(x_274.value, (IStrategoList)extraction.constNil0);
      y_275 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_275, NO_STRATEGIES, new IStrategoTerm[]{extraction.const564});
      if(term == null)
        break Fail613;
      a_276 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_274);
      if(term == null)
        break Fail613;
      term = put_syntax_sort_0_1.instance.invoke(context, a_276, term);
      if(term == null)
        break Fail613;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}