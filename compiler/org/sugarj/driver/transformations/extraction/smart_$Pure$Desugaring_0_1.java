package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Pure$Desugaring_0_1 extends Strategy 
{ 
  public static smart_$Pure$Desugaring_0_1 instance = new smart_$Pure$Desugaring_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_107)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_107 = new TermReference(ref_b_107);
    context.push("smart_PureDesugaring_0_1");
    Fail367:
    { 
      IStrategoTerm c_107 = null;
      IStrategoTerm o_107 = null;
      IStrategoTerm q_107 = null;
      term = extraction.constNil0;
      lifted87 lifted870 = new lifted87();
      lifted870.b_107 = b_107;
      term = try_1_0.instance.invoke(context, term, lifted870);
      if(term == null)
        break Fail367;
      c_107 = term;
      if(b_107.value == null)
        break Fail367;
      term = (IStrategoTerm)termFactory.makeListCons(b_107.value, (IStrategoList)extraction.constNil0);
      o_107 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_107, NO_STRATEGIES, new IStrategoTerm[]{extraction.const358});
      if(term == null)
        break Fail367;
      q_107 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_107);
      if(term == null)
        break Fail367;
      term = put_syntax_sort_0_1.instance.invoke(context, q_107, term);
      if(term == null)
        break Fail367;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}