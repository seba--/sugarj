package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class comp_desugarings_to_str_0_0 extends Strategy 
{ 
  public static comp_desugarings_to_str_0_0 instance = new comp_desugarings_to_str_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("comp_desugarings_to_str_0_0");
    Fail20:
    { 
      IStrategoTerm j_15 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDesugarings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      j_15 = term.getSubterm(0);
      term = map_1_0.instance.invoke(context, j_15, comp_desugaring_to_str_0_0.instance);
      if(term == null)
        break Fail20;
      term = termFactory.makeAppl(outt._consStrategies_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}