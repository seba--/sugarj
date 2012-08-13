package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Init_1_0 extends Strategy 
{ 
  public static $Array$Init_1_0 instance = new $Array$Init_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayInit_1_0");
    Fail149:
    { 
      IStrategoTerm g_131 = null;
      IStrategoTerm e_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail149;
      e_131 = term.getSubterm(0);
      IStrategoList annos125 = term.getAnnotations();
      g_131 = annos125;
      term = w_26.invoke(context, e_131);
      if(term == null)
        break Fail149;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}