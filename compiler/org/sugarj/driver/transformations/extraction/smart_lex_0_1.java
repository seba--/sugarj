package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_lex_0_1 extends Strategy 
{ 
  public static smart_lex_0_1 instance = new smart_lex_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_319)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_319 = new TermReference(ref_p_319);
    context.push("smart_lex_0_1");
    Fail678:
    { 
      IStrategoTerm q_319 = null;
      IStrategoTerm x_319 = null;
      IStrategoTerm a_320 = null;
      term = extraction.constNil0;
      lifted459 lifted4590 = new lifted459();
      lifted4590.p_319 = p_319;
      term = try_1_0.instance.invoke(context, term, lifted4590);
      if(term == null)
        break Fail678;
      q_319 = term;
      if(p_319.value == null)
        break Fail678;
      term = (IStrategoTerm)termFactory.makeListCons(p_319.value, (IStrategoList)extraction.constNil0);
      x_319 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_319, NO_STRATEGIES, new IStrategoTerm[]{extraction.const626});
      if(term == null)
        break Fail678;
      a_320 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_319);
      if(term == null)
        break Fail678;
      term = put_syntax_sort_0_1.instance.invoke(context, a_320, term);
      if(term == null)
        break Fail678;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}