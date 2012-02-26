package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Id_1_0 extends Strategy 
{ 
  public static $Id_1_0 instance = new $Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Id_1_0");
    Fail207:
    { 
      IStrategoTerm k_136 = null;
      IStrategoTerm j_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail207;
      j_136 = term.getSubterm(0);
      IStrategoList annos166 = term.getAnnotations();
      k_136 = annos166;
      term = r_26.invoke(context, j_136);
      if(term == null)
        break Fail207;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}