package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$U$R$L_0_1 extends Strategy 
{ 
  public static smart_$U$R$L_0_1 instance = new smart_$U$R$L_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_161)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_161 = new TermReference(ref_k_161);
    context.push("smart_URL_0_1");
    Fail444:
    { 
      IStrategoTerm l_161 = null;
      IStrategoTerm z_161 = null;
      IStrategoTerm h_162 = null;
      term = extraction.constNil0;
      lifted189 lifted1890 = new lifted189();
      lifted1890.k_161 = k_161;
      term = try_1_0.instance.invoke(context, term, lifted1890);
      if(term == null)
        break Fail444;
      l_161 = term;
      if(k_161.value == null)
        break Fail444;
      term = (IStrategoTerm)termFactory.makeListCons(k_161.value, (IStrategoList)extraction.constNil0);
      z_161 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_161, NO_STRATEGIES, new IStrategoTerm[]{extraction.const14});
      if(term == null)
        break Fail444;
      h_162 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_161);
      if(term == null)
        break Fail444;
      term = put_syntax_sort_0_1.instance.invoke(context, h_162, term);
      if(term == null)
        break Fail444;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}