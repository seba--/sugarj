package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Indent$Def_0_1 extends Strategy 
{ 
  public static smart_$Indent$Def_0_1 instance = new smart_$Indent$Def_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_169)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_169 = new TermReference(ref_i_169);
    context.push("smart_IndentDef_0_1");
    Fail455:
    { 
      IStrategoTerm j_169 = null;
      IStrategoTerm q_169 = null;
      IStrategoTerm s_169 = null;
      term = extraction.constNil0;
      lifted201 lifted2010 = new lifted201();
      lifted2010.i_169 = i_169;
      term = try_1_0.instance.invoke(context, term, lifted2010);
      if(term == null)
        break Fail455;
      j_169 = term;
      if(i_169.value == null)
        break Fail455;
      term = (IStrategoTerm)termFactory.makeListCons(i_169.value, (IStrategoList)extraction.constNil0);
      q_169 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_169, NO_STRATEGIES, new IStrategoTerm[]{extraction.const136});
      if(term == null)
        break Fail455;
      s_169 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_169);
      if(term == null)
        break Fail455;
      term = put_syntax_sort_0_1.instance.invoke(context, s_169, term);
      if(term == null)
        break Fail455;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}