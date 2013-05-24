package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Attribute$Ref_0_1 extends Strategy 
{ 
  public static smart_$Attribute$Ref_0_1 instance = new smart_$Attribute$Ref_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_135)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_135 = new TermReference(ref_k_135);
    context.push("smart_AttributeRef_0_1");
    Fail405:
    { 
      IStrategoTerm m_135 = null;
      IStrategoTerm f_136 = null;
      IStrategoTerm j_136 = null;
      term = extraction.constNil0;
      lifted138 lifted1380 = new lifted138();
      lifted1380.k_135 = k_135;
      term = try_1_0.instance.invoke(context, term, lifted1380);
      if(term == null)
        break Fail405;
      m_135 = term;
      if(k_135.value == null)
        break Fail405;
      term = (IStrategoTerm)termFactory.makeListCons(k_135.value, (IStrategoList)extraction.constNil0);
      f_136 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_136, NO_STRATEGIES, new IStrategoTerm[]{extraction.const392});
      if(term == null)
        break Fail405;
      j_136 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, m_135);
      if(term == null)
        break Fail405;
      term = put_syntax_sort_0_1.instance.invoke(context, j_136, term);
      if(term == null)
        break Fail405;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}