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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_14, Strategy u_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ElemValPair_2_0");
    Fail19:
    { 
      IStrategoTerm f_100 = null;
      IStrategoTerm d_100 = null;
      IStrategoTerm e_100 = null;
      IStrategoTerm g_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consElemValPair_2 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      d_100 = term.getSubterm(0);
      e_100 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      f_100 = annos7;
      term = t_14.invoke(context, d_100);
      if(term == null)
        break Fail19;
      g_100 = term;
      term = u_14.invoke(context, e_100);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consElemValPair_2, new IStrategoTerm[]{g_100, term}), checkListAnnos(termFactory, f_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}