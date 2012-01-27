package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Params_1_0 extends Strategy 
{ 
  public static $Type$Params_1_0 instance = new $Type$Params_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeParams_1_0");
    Fail155:
    { 
      IStrategoTerm l_128 = null;
      IStrategoTerm k_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeParams_1 != ((IStrategoAppl)term).getConstructor())
        break Fail155;
      k_128 = term.getSubterm(0);
      IStrategoList annos139 = term.getAnnotations();
      l_128 = annos139;
      term = v_24.invoke(context, k_128);
      if(term == null)
        break Fail155;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeParams_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}