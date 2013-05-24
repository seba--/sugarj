package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class structurally_equal_0_0 extends Strategy 
{ 
  public static structurally_equal_0_0 instance = new structurally_equal_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("structurally_equal_0_0");
    Fail37:
    { 
      IStrategoTerm u_53 = null;
      IStrategoTerm v_53 = null;
      IStrategoTerm w_53 = null;
      IStrategoTerm x_53 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail37;
      IStrategoTerm arg16 = term.getSubterm(0);
      IStrategoTerm cons3 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg16});
      u_53 = cons3;
      IStrategoTerm args3 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg16});
      w_53 = args3;
      IStrategoTerm arg17 = term.getSubterm(1);
      IStrategoTerm cons4 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg17});
      v_53 = cons4;
      IStrategoTerm args4 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg17});
      x_53 = args4;
      term = termFactory.makeTuple(u_53, v_53);
      term = equal_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail37;
      term = termFactory.makeTuple(w_53, x_53);
      term = zip_1_0.instance.invoke(context, term, structurally_equal_0_0.instance);
      if(term == null)
        break Fail37;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}