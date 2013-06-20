package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  public static final lifted3 instance = new lifted3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail290:
    { 
      term = extract_sdf_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail290;
      term = fold_conc_grammars_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail290;
      if(true)
        return term;
    }
    return null;
  }
}