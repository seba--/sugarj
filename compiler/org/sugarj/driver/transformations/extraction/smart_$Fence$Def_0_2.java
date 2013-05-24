package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Fence$Def_0_2 extends Strategy 
{ 
  public static smart_$Fence$Def_0_2 instance = new smart_$Fence$Def_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_168, IStrategoTerm ref_u_168)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_168 = new TermReference(ref_t_168);
    TermReference u_168 = new TermReference(ref_u_168);
    context.push("smart_FenceDef_0_2");
    Fail454:
    { 
      IStrategoTerm v_168 = null;
      IStrategoTerm f_169 = null;
      IStrategoTerm h_169 = null;
      term = extraction.constNil0;
      lifted200 lifted2000 = new lifted200();
      lifted2000.t_168 = t_168;
      lifted2000.u_168 = u_168;
      term = try_1_0.instance.invoke(context, term, lifted2000);
      if(term == null)
        break Fail454;
      v_168 = term;
      if(t_168.value == null || u_168.value == null)
        break Fail454;
      term = (IStrategoTerm)termFactory.makeListCons(t_168.value, termFactory.makeListCons(u_168.value, (IStrategoList)extraction.constNil0));
      f_169 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_169, NO_STRATEGIES, new IStrategoTerm[]{extraction.const138});
      if(term == null)
        break Fail454;
      h_169 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_168);
      if(term == null)
        break Fail454;
      term = put_syntax_sort_0_1.instance.invoke(context, h_169, term);
      if(term == null)
        break Fail454;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}