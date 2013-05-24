package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Import$Wildcard_0_1 extends Strategy 
{ 
  public static smart_$Import$Wildcard_0_1 instance = new smart_$Import$Wildcard_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_267)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_267 = new TermReference(ref_h_267);
    context.push("smart_ImportWildcard_0_1");
    Fail601:
    { 
      IStrategoTerm i_267 = null;
      IStrategoTerm s_267 = null;
      IStrategoTerm u_267 = null;
      term = extraction.constNil0;
      lifted372 lifted3720 = new lifted372();
      lifted3720.h_267 = h_267;
      term = try_1_0.instance.invoke(context, term, lifted3720);
      if(term == null)
        break Fail601;
      i_267 = term;
      if(h_267.value == null)
        break Fail601;
      term = (IStrategoTerm)termFactory.makeListCons(h_267.value, (IStrategoList)extraction.constNil0);
      s_267 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_267, NO_STRATEGIES, new IStrategoTerm[]{extraction.const552});
      if(term == null)
        break Fail601;
      u_267 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_267);
      if(term == null)
        break Fail601;
      term = put_syntax_sort_0_1.instance.invoke(context, u_267, term);
      if(term == null)
        break Fail601;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}