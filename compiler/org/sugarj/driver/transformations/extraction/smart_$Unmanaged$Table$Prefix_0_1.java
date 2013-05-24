package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Unmanaged$Table$Prefix_0_1 extends Strategy 
{ 
  public static smart_$Unmanaged$Table$Prefix_0_1 instance = new smart_$Unmanaged$Table$Prefix_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_164)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_164 = new TermReference(ref_d_164);
    context.push("smart_UnmanagedTablePrefix_0_1");
    Fail447:
    { 
      IStrategoTerm g_164 = null;
      IStrategoTerm t_164 = null;
      IStrategoTerm y_164 = null;
      term = extraction.constNil0;
      lifted192 lifted1920 = new lifted192();
      lifted1920.d_164 = d_164;
      term = try_1_0.instance.invoke(context, term, lifted1920);
      if(term == null)
        break Fail447;
      g_164 = term;
      if(d_164.value == null)
        break Fail447;
      term = (IStrategoTerm)termFactory.makeListCons(d_164.value, (IStrategoList)extraction.constNil0);
      t_164 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_164, NO_STRATEGIES, new IStrategoTerm[]{extraction.const428});
      if(term == null)
        break Fail447;
      y_164 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_164);
      if(term == null)
        break Fail447;
      term = put_syntax_sort_0_1.instance.invoke(context, y_164, term);
      if(term == null)
        break Fail447;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}