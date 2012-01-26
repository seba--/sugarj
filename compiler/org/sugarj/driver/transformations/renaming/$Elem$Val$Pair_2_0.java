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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_14, Strategy f_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ElemValPair_2_0");
    Fail16:
    { 
      IStrategoTerm p_99 = null;
      IStrategoTerm n_99 = null;
      IStrategoTerm o_99 = null;
      IStrategoTerm q_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consElemValPair_2 != ((IStrategoAppl)term).getConstructor())
        break Fail16;
      n_99 = term.getSubterm(0);
      o_99 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      p_99 = annos7;
      term = e_14.invoke(context, n_99);
      if(term == null)
        break Fail16;
      q_99 = term;
      term = f_14.invoke(context, o_99);
      if(term == null)
        break Fail16;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consElemValPair_2, new IStrategoTerm[]{q_99, term}), checkListAnnos(termFactory, p_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}