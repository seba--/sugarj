package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Scope$Labels_0_1 extends Strategy 
{ 
  public static smart_$Scope$Labels_0_1 instance = new smart_$Scope$Labels_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_178)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_178 = new TermReference(ref_n_178);
    context.push("smart_ScopeLabels_0_1");
    Fail470:
    { 
      IStrategoTerm o_178 = null;
      IStrategoTerm a_179 = null;
      IStrategoTerm c_179 = null;
      term = extraction.constNil0;
      lifted218 lifted2180 = new lifted218();
      lifted2180.n_178 = n_178;
      term = try_1_0.instance.invoke(context, term, lifted2180);
      if(term == null)
        break Fail470;
      o_178 = term;
      if(n_178.value == null)
        break Fail470;
      term = (IStrategoTerm)termFactory.makeListCons(n_178.value, (IStrategoList)extraction.constNil0);
      a_179 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_179, NO_STRATEGIES, new IStrategoTerm[]{extraction.const113});
      if(term == null)
        break Fail470;
      c_179 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_178);
      if(term == null)
        break Fail470;
      term = put_syntax_sort_0_1.instance.invoke(context, c_179, term);
      if(term == null)
        break Fail470;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}