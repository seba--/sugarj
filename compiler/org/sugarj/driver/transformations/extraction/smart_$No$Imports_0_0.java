package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$No$Imports_0_0 extends Strategy 
{ 
  public static smart_$No$Imports_0_0 instance = new smart_$No$Imports_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_NoImports_0_0");
    Fail464:
    { 
      IStrategoTerm u_174 = null;
      IStrategoTerm y_174 = null;
      IStrategoTerm a_175 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted211.instance);
      if(term == null)
        break Fail464;
      u_174 = term;
      y_174 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_174, NO_STRATEGIES, new IStrategoTerm[]{extraction.const436});
      if(term == null)
        break Fail464;
      a_175 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_174);
      if(term == null)
        break Fail464;
      term = put_syntax_sort_0_1.instance.invoke(context, a_175, term);
      if(term == null)
        break Fail464;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}