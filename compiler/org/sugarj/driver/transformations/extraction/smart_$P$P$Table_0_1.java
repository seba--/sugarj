package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$P$P$Table_0_1 extends Strategy 
{ 
  public static smart_$P$P$Table_0_1 instance = new smart_$P$P$Table_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_109)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_109 = new TermReference(ref_d_109);
    context.push("smart_PPTable_0_1");
    Fail370:
    { 
      IStrategoTerm e_109 = null;
      IStrategoTerm m_109 = null;
      IStrategoTerm o_109 = null;
      term = extraction.constNil0;
      lifted90 lifted900 = new lifted90();
      lifted900.d_109 = d_109;
      term = try_1_0.instance.invoke(context, term, lifted900);
      if(term == null)
        break Fail370;
      e_109 = term;
      if(d_109.value == null)
        break Fail370;
      term = (IStrategoTerm)termFactory.makeListCons(d_109.value, (IStrategoList)extraction.constNil0);
      m_109 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_109, NO_STRATEGIES, new IStrategoTerm[]{extraction.const361});
      if(term == null)
        break Fail370;
      o_109 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_109);
      if(term == null)
        break Fail370;
      term = put_syntax_sort_0_1.instance.invoke(context, o_109, term);
      if(term == null)
        break Fail370;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}