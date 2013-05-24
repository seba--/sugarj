package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$S$Def$T_0_4 extends Strategy 
{ 
  public static smart_$S$Def$T_0_4 instance = new smart_$S$Def$T_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_255, IStrategoTerm ref_s_255, IStrategoTerm ref_t_255, IStrategoTerm ref_u_255)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_255 = new TermReference(ref_r_255);
    TermReference s_255 = new TermReference(ref_s_255);
    TermReference t_255 = new TermReference(ref_t_255);
    TermReference u_255 = new TermReference(ref_u_255);
    context.push("smart_SDefT_0_4");
    Fail584:
    { 
      IStrategoTerm v_255 = null;
      IStrategoTerm o_256 = null;
      IStrategoTerm q_256 = null;
      term = extraction.constNil0;
      lifted352 lifted3520 = new lifted352();
      lifted3520.r_255 = r_255;
      lifted3520.s_255 = s_255;
      lifted3520.t_255 = t_255;
      lifted3520.u_255 = u_255;
      term = try_1_0.instance.invoke(context, term, lifted3520);
      if(term == null)
        break Fail584;
      v_255 = term;
      if(r_255.value == null || (s_255.value == null || (t_255.value == null || u_255.value == null)))
        break Fail584;
      term = (IStrategoTerm)termFactory.makeListCons(r_255.value, termFactory.makeListCons(s_255.value, termFactory.makeListCons(t_255.value, termFactory.makeListCons(u_255.value, (IStrategoList)extraction.constNil0))));
      o_256 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_256, NO_STRATEGIES, new IStrategoTerm[]{extraction.const537});
      if(term == null)
        break Fail584;
      q_256 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_255);
      if(term == null)
        break Fail584;
      term = put_syntax_sort_0_1.instance.invoke(context, q_256, term);
      if(term == null)
        break Fail584;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}