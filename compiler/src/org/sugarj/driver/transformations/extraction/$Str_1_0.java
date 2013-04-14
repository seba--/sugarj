package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Str_1_0 extends Strategy 
{ 
  public static $Str_1_0 instance = new $Str_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Str_1_0");
    Fail158:
    { 
      IStrategoTerm j_128 = null;
      IStrategoTerm i_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consStr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail158;
      i_128 = term.getSubterm(0);
      IStrategoList annos130 = term.getAnnotations();
      j_128 = annos130;
      term = z_24.invoke(context, i_128);
      if(term == null)
        break Fail158;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consStr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}