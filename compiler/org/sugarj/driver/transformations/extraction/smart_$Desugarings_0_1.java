package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Desugarings_0_1 extends Strategy 
{ 
  public static smart_$Desugarings_0_1 instance = new smart_$Desugarings_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_106)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_106 = new TermReference(ref_e_106);
    context.push("smart_Desugarings_0_1");
    Fail365:
    { 
      IStrategoTerm f_106 = null;
      IStrategoTerm m_106 = null;
      IStrategoTerm o_106 = null;
      term = extraction.constNil0;
      lifted85 lifted850 = new lifted85();
      lifted850.e_106 = e_106;
      term = try_1_0.instance.invoke(context, term, lifted850);
      if(term == null)
        break Fail365;
      f_106 = term;
      if(e_106.value == null)
        break Fail365;
      term = (IStrategoTerm)termFactory.makeListCons(e_106.value, (IStrategoList)extraction.constNil0);
      m_106 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_106, NO_STRATEGIES, new IStrategoTerm[]{extraction.const356});
      if(term == null)
        break Fail365;
      o_106 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_106);
      if(term == null)
        break Fail365;
      term = put_syntax_sort_0_1.instance.invoke(context, o_106, term);
      if(term == null)
        break Fail365;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}