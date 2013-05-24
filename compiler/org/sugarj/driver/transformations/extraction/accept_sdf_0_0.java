package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class accept_sdf_0_0 extends Strategy 
{ 
  public static accept_sdf_0_0 instance = new accept_sdf_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail703:
    { 
      IStrategoTerm j_332 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consgrammar_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail703;
      j_332 = term.getSubterm(0);
      term = j_332;
      if(true)
        return term;
    }
    context.push("accept_sdf_0_0");
    context.popOnFailure();
    return null;
  }
}