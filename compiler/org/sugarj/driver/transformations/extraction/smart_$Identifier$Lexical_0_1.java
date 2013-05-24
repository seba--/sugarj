package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Identifier$Lexical_0_1 extends Strategy 
{ 
  public static smart_$Identifier$Lexical_0_1 instance = new smart_$Identifier$Lexical_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_116)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_116 = new TermReference(ref_s_116);
    context.push("smart_IdentifierLexical_0_1");
    Fail385:
    { 
      IStrategoTerm t_116 = null;
      IStrategoTerm k_117 = null;
      IStrategoTerm m_117 = null;
      term = extraction.constNil0;
      lifted106 lifted1060 = new lifted106();
      lifted1060.s_116 = s_116;
      term = try_1_0.instance.invoke(context, term, lifted1060);
      if(term == null)
        break Fail385;
      lifted107 lifted1070 = new lifted107();
      lifted1070.s_116 = s_116;
      term = try_1_0.instance.invoke(context, term, lifted1070);
      if(term == null)
        break Fail385;
      lifted108 lifted1080 = new lifted108();
      lifted1080.s_116 = s_116;
      term = try_1_0.instance.invoke(context, term, lifted1080);
      if(term == null)
        break Fail385;
      t_116 = term;
      if(s_116.value == null)
        break Fail385;
      term = (IStrategoTerm)termFactory.makeListCons(s_116.value, (IStrategoList)extraction.constNil0);
      k_117 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_117, NO_STRATEGIES, new IStrategoTerm[]{extraction.const376});
      if(term == null)
        break Fail385;
      m_117 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_116);
      if(term == null)
        break Fail385;
      term = put_syntax_sort_0_1.instance.invoke(context, m_117, term);
      if(term == null)
        break Fail385;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}