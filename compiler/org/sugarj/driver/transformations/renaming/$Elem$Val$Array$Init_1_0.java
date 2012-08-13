package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Elem$Val$Array$Init_1_0 extends Strategy 
{ 
  public static $Elem$Val$Array$Init_1_0 instance = new $Elem$Val$Array$Init_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ElemValArrayInit_1_0");
    Fail66:
    { 
      IStrategoTerm l_112 = null;
      IStrategoTerm k_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consElemValArrayInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      k_112 = term.getSubterm(0);
      IStrategoList annos47 = term.getAnnotations();
      l_112 = annos47;
      term = d_20.invoke(context, k_112);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consElemValArrayInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}