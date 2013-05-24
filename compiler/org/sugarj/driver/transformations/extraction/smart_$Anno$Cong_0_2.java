package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Anno$Cong_0_2 extends Strategy 
{ 
  public static smart_$Anno$Cong_0_2 instance = new smart_$Anno$Cong_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_215, IStrategoTerm ref_h_215)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference g_215 = new TermReference(ref_g_215);
    TermReference h_215 = new TermReference(ref_h_215);
    context.push("smart_AnnoCong_0_2");
    Fail523:
    { 
      IStrategoTerm i_215 = null;
      IStrategoTerm u_215 = null;
      IStrategoTerm w_215 = null;
      term = extraction.constNil0;
      lifted282 lifted2820 = new lifted282();
      lifted2820.g_215 = g_215;
      lifted2820.h_215 = h_215;
      term = try_1_0.instance.invoke(context, term, lifted2820);
      if(term == null)
        break Fail523;
      i_215 = term;
      if(g_215.value == null || h_215.value == null)
        break Fail523;
      term = (IStrategoTerm)termFactory.makeListCons(g_215.value, termFactory.makeListCons(h_215.value, (IStrategoList)extraction.constNil0));
      u_215 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_215, NO_STRATEGIES, new IStrategoTerm[]{extraction.const488});
      if(term == null)
        break Fail523;
      w_215 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_215);
      if(term == null)
        break Fail523;
      term = put_syntax_sort_0_1.instance.invoke(context, w_215, term);
      if(term == null)
        break Fail523;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}