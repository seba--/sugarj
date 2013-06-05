package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class extract_editor_0_0 extends Strategy 
{ 
  public static extract_editor_0_0 instance = new extract_editor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("extract_editor_0_0");
    Fail26:
    { 
      term = map_1_0.instance.invoke(context, term, lifted12.instance);
      if(term == null)
        break Fail26;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}