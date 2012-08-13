package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Static$Init_1_0 extends Strategy 
{ 
  public static $Static$Init_1_0 instance = new $Static$Init_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticInit_1_0");
    Fail107:
    { 
      IStrategoTerm k_122 = null;
      IStrategoTerm j_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail107;
      j_122 = term.getSubterm(0);
      IStrategoList annos88 = term.getAnnotations();
      k_122 = annos88;
      term = w_23.invoke(context, j_122);
      if(term == null)
        break Fail107;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}