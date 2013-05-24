package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Completion$Template$With$Sort_0_4 extends Strategy 
{ 
  public static smart_$Completion$Template$With$Sort_0_4 instance = new smart_$Completion$Template$With$Sort_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_119, IStrategoTerm ref_t_119, IStrategoTerm ref_u_119, IStrategoTerm ref_w_119)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_119 = new TermReference(ref_r_119);
    TermReference t_119 = new TermReference(ref_t_119);
    TermReference u_119 = new TermReference(ref_u_119);
    TermReference w_119 = new TermReference(ref_w_119);
    context.push("smart_CompletionTemplateWithSort_0_4");
    Fail388:
    { 
      IStrategoTerm x_119 = null;
      IStrategoTerm m_121 = null;
      IStrategoTerm o_121 = null;
      term = extraction.constNil0;
      lifted113 lifted1130 = new lifted113();
      lifted1130.r_119 = r_119;
      lifted1130.t_119 = t_119;
      lifted1130.u_119 = u_119;
      lifted1130.w_119 = w_119;
      term = try_1_0.instance.invoke(context, term, lifted1130);
      if(term == null)
        break Fail388;
      lifted114 lifted1140 = new lifted114();
      lifted1140.r_119 = r_119;
      lifted1140.t_119 = t_119;
      lifted1140.u_119 = u_119;
      lifted1140.w_119 = w_119;
      term = try_1_0.instance.invoke(context, term, lifted1140);
      if(term == null)
        break Fail388;
      x_119 = term;
      if(r_119.value == null || (t_119.value == null || (u_119.value == null || w_119.value == null)))
        break Fail388;
      term = (IStrategoTerm)termFactory.makeListCons(r_119.value, termFactory.makeListCons(t_119.value, termFactory.makeListCons(u_119.value, termFactory.makeListCons(w_119.value, (IStrategoList)extraction.constNil0))));
      m_121 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_121, NO_STRATEGIES, new IStrategoTerm[]{extraction.const379});
      if(term == null)
        break Fail388;
      o_121 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_119);
      if(term == null)
        break Fail388;
      term = put_syntax_sort_0_1.instance.invoke(context, o_121, term);
      if(term == null)
        break Fail388;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}