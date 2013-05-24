package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_syntax_0_1 extends Strategy 
{ 
  public static smart_syntax_0_1 instance = new smart_syntax_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_98)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_98 = new TermReference(ref_i_98);
    context.push("smart_syntax_0_1");
    Fail353:
    { 
      IStrategoTerm j_98 = null;
      IStrategoTerm a_99 = null;
      IStrategoTerm c_99 = null;
      term = extraction.constNil0;
      lifted61 lifted610 = new lifted61();
      lifted610.i_98 = i_98;
      term = try_1_0.instance.invoke(context, term, lifted610);
      if(term == null)
        break Fail353;
      lifted62 lifted620 = new lifted62();
      lifted620.i_98 = i_98;
      term = try_1_0.instance.invoke(context, term, lifted620);
      if(term == null)
        break Fail353;
      j_98 = term;
      if(i_98.value == null)
        break Fail353;
      term = (IStrategoTerm)termFactory.makeListCons(i_98.value, (IStrategoList)extraction.constNil0);
      a_99 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_99, NO_STRATEGIES, new IStrategoTerm[]{extraction.const343});
      if(term == null)
        break Fail353;
      c_99 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_98);
      if(term == null)
        break Fail353;
      term = put_syntax_sort_0_1.instance.invoke(context, c_99, term);
      if(term == null)
        break Fail353;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}