package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Elem$Val$Pair_2_0 extends Strategy 
{ 
  public static $Elem$Val$Pair_2_0 instance = new $Elem$Val$Pair_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_20, Strategy f_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ElemValPair_2_0");
    Fail67:
    { 
      IStrategoTerm p_112 = null;
      IStrategoTerm n_112 = null;
      IStrategoTerm o_112 = null;
      IStrategoTerm q_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consElemValPair_2 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      n_112 = term.getSubterm(0);
      o_112 = term.getSubterm(1);
      IStrategoList annos48 = term.getAnnotations();
      p_112 = annos48;
      term = e_20.invoke(context, n_112);
      if(term == null)
        break Fail67;
      q_112 = term;
      term = f_20.invoke(context, o_112);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consElemValPair_2, new IStrategoTerm[]{q_112, term}), checkListAnnos(termFactory, p_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}