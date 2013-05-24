package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted488 extends Strategy 
{ 
  public static final lifted488 instance = new lifted488();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1126:
    { 
      term = extract_sdf_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1126;
      term = fold_conc_grammars_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1126;
      if(true)
        return term;
    }
    return null;
  }
}