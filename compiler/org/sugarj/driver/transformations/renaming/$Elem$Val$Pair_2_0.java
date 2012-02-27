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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_15, Strategy c_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ElemValPair_2_0");
    Fail21:
    { 
      IStrategoTerm n_100 = null;
      IStrategoTerm l_100 = null;
      IStrategoTerm m_100 = null;
      IStrategoTerm o_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consElemValPair_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      l_100 = term.getSubterm(0);
      m_100 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      n_100 = annos7;
      term = b_15.invoke(context, l_100);
      if(term == null)
        break Fail21;
      o_100 = term;
      term = c_15.invoke(context, m_100);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consElemValPair_2, new IStrategoTerm[]{o_100, term}), checkListAnnos(termFactory, n_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}