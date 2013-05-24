package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cursor_0_0 extends Strategy 
{ 
  public static $Cursor_0_0 instance = new $Cursor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail767:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCursor_0 != ((IStrategoAppl)term).getConstructor())
        break Fail767;
      if(true)
        return term;
    }
    context.push("Cursor_0_0");
    context.popOnFailure();
    return null;
  }
}