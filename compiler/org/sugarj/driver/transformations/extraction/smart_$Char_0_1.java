package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Char_0_1 extends Strategy 
{ 
  public static smart_$Char_0_1 instance = new smart_$Char_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_229)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_229 = new TermReference(ref_o_229);
    context.push("smart_Char_0_1");
    Fail545:
    { 
      IStrategoTerm p_229 = null;
      IStrategoTerm i_230 = null;
      IStrategoTerm k_230 = null;
      term = extraction.constNil0;
      lifted305 lifted3050 = new lifted305();
      lifted3050.o_229 = o_229;
      term = try_1_0.instance.invoke(context, term, lifted3050);
      if(term == null)
        break Fail545;
      p_229 = term;
      if(o_229.value == null)
        break Fail545;
      term = (IStrategoTerm)termFactory.makeListCons(o_229.value, (IStrategoList)extraction.constNil0);
      i_230 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_230, NO_STRATEGIES, new IStrategoTerm[]{extraction.const27});
      if(term == null)
        break Fail545;
      k_230 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_229);
      if(term == null)
        break Fail545;
      term = put_syntax_sort_0_1.instance.invoke(context, k_230, term);
      if(term == null)
        break Fail545;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}