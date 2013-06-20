package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class top_0_0 extends Strategy 
{ 
  public static top_0_0 instance = new top_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail197:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._constop_0 != ((IStrategoAppl)term).getConstructor())
        break Fail197;
      if(true)
        return term;
    }
    context.push("top_0_0");
    context.popOnFailure();
    return null;
  }
}