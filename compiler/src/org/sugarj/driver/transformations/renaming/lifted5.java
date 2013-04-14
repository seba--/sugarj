package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  TermReference e_9;

  TermReference f_9;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail150:
    { 
      lifted6 lifted60 = new lifted6();
      lifted60.e_9 = e_9;
      lifted60.f_9 = f_9;
      term = $S$Var_1_0.instance.invoke(context, term, lifted60);
      if(term == null)
        break Fail150;
      if(true)
        return term;
    }
    return null;
  }
}