package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted16 extends Strategy 
{ 
  public static final lifted16 instance = new lifted16();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2198:
    { 
      TermReference y_53 = new TermReference();
      lifted17 lifted1710 = new lifted17();
      lifted1710.y_53 = y_53;
      term = try_1_0.instance.invoke(context, term, lifted1710);
      if(term == null)
        break Fail2198;
      if(true)
        return term;
    }
    return null;
  }
}