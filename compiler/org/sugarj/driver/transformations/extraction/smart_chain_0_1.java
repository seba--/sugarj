package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_chain_0_1 extends Strategy 
{ 
  public static smart_chain_0_1 instance = new smart_chain_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_l_305)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference l_305 = new TermReference(ref_l_305);
    context.push("smart_chain_0_1");
    Fail652:
    { 
      IStrategoTerm m_305 = null;
      IStrategoTerm t_305 = null;
      IStrategoTerm v_305 = null;
      term = extraction.constNil0;
      lifted433 lifted4330 = new lifted433();
      lifted4330.l_305 = l_305;
      term = try_1_0.instance.invoke(context, term, lifted4330);
      if(term == null)
        break Fail652;
      m_305 = term;
      if(l_305.value == null)
        break Fail652;
      term = (IStrategoTerm)termFactory.makeListCons(l_305.value, (IStrategoList)extraction.constNil0);
      t_305 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_305, NO_STRATEGIES, new IStrategoTerm[]{extraction.const602});
      if(term == null)
        break Fail652;
      v_305 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, m_305);
      if(term == null)
        break Fail652;
      term = put_syntax_sort_0_1.instance.invoke(context, v_305, term);
      if(term == null)
        break Fail652;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}