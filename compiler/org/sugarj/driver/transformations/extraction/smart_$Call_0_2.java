package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Call_0_2 extends Strategy 
{ 
  public static smart_$Call_0_2 instance = new smart_$Call_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_207, IStrategoTerm ref_x_207)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_207 = new TermReference(ref_w_207);
    TermReference x_207 = new TermReference(ref_x_207);
    context.push("smart_Call_0_2");
    Fail508:
    { 
      IStrategoTerm y_207 = null;
      IStrategoTerm i_208 = null;
      IStrategoTerm k_208 = null;
      term = extraction.constNil0;
      lifted267 lifted2670 = new lifted267();
      lifted2670.w_207 = w_207;
      lifted2670.x_207 = x_207;
      term = try_1_0.instance.invoke(context, term, lifted2670);
      if(term == null)
        break Fail508;
      y_207 = term;
      if(w_207.value == null || x_207.value == null)
        break Fail508;
      term = (IStrategoTerm)termFactory.makeListCons(w_207.value, termFactory.makeListCons(x_207.value, (IStrategoList)extraction.constNil0));
      i_208 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_208, NO_STRATEGIES, new IStrategoTerm[]{extraction.const473});
      if(term == null)
        break Fail508;
      k_208 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_207);
      if(term == null)
        break Fail508;
      term = put_syntax_sort_0_1.instance.invoke(context, k_208, term);
      if(term == null)
        break Fail508;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}