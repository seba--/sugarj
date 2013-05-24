package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Indent$Defs_0_1 extends Strategy 
{ 
  public static smart_$Indent$Defs_0_1 instance = new smart_$Indent$Defs_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_166)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_166 = new TermReference(ref_v_166);
    context.push("smart_IndentDefs_0_1");
    Fail451:
    { 
      IStrategoTerm w_166 = null;
      IStrategoTerm d_167 = null;
      IStrategoTerm f_167 = null;
      term = extraction.constNil0;
      lifted196 lifted1960 = new lifted196();
      lifted1960.v_166 = v_166;
      term = try_1_0.instance.invoke(context, term, lifted1960);
      if(term == null)
        break Fail451;
      w_166 = term;
      if(v_166.value == null)
        break Fail451;
      term = (IStrategoTerm)termFactory.makeListCons(v_166.value, (IStrategoList)extraction.constNil0);
      d_167 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_167, NO_STRATEGIES, new IStrategoTerm[]{extraction.const432});
      if(term == null)
        break Fail451;
      f_167 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_166);
      if(term == null)
        break Fail451;
      term = put_syntax_sort_0_1.instance.invoke(context, f_167, term);
      if(term == null)
        break Fail451;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}