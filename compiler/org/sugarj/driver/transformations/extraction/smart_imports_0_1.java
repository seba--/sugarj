package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_imports_0_1 extends Strategy 
{ 
  public static smart_imports_0_1 instance = new smart_imports_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_316)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_316 = new TermReference(ref_y_316);
    context.push("smart_imports_0_1");
    Fail673:
    { 
      IStrategoTerm z_316 = null;
      IStrategoTerm g_317 = null;
      IStrategoTerm i_317 = null;
      term = extraction.constNil0;
      lifted454 lifted4540 = new lifted454();
      lifted4540.y_316 = y_316;
      term = try_1_0.instance.invoke(context, term, lifted4540);
      if(term == null)
        break Fail673;
      z_316 = term;
      if(y_316.value == null)
        break Fail673;
      term = (IStrategoTerm)termFactory.makeListCons(y_316.value, (IStrategoList)extraction.constNil0);
      g_317 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_317, NO_STRATEGIES, new IStrategoTerm[]{extraction.const622});
      if(term == null)
        break Fail673;
      i_317 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_316);
      if(term == null)
        break Fail673;
      term = put_syntax_sort_0_1.instance.invoke(context, i_317, term);
      if(term == null)
        break Fail673;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}