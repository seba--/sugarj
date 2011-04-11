package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class extract_sdf_0_0 extends Strategy 
{ 
  public static extract_sdf_0_0 instance = new extract_sdf_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("extract_sdf_0_0");
    Fail18:
    { 
      term = map_1_0.instance.invoke(context, term, lifted15.instance);
      if(term == null)
        break Fail18;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail18;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}