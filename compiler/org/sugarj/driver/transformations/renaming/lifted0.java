package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  TermReference l_12;

  TermReference m_12;

  TermReference n_12;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail206:
    { 
      lifted1 lifted10 = new lifted1();
      lifted10.l_12 = l_12;
      lifted10.m_12 = m_12;
      lifted10.n_12 = n_12;
      term = try_1_0.instance.invoke(context, term, lifted10);
      if(term == null)
        break Fail206;
      if(true)
        return term;
    }
    return null;
  }
}