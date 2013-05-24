package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$List$Tl_2_0 extends Strategy 
{ 
  public static $Sort$List$Tl_2_0 instance = new $Sort$List$Tl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_345, Strategy o_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortListTl_2_0");
    Fail941:
    { 
      IStrategoTerm k_454 = null;
      IStrategoTerm i_454 = null;
      IStrategoTerm j_454 = null;
      IStrategoTerm l_454 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSortListTl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail941;
      i_454 = term.getSubterm(0);
      j_454 = term.getSubterm(1);
      IStrategoList annos186 = term.getAnnotations();
      k_454 = annos186;
      term = n_345.invoke(context, i_454);
      if(term == null)
        break Fail941;
      l_454 = term;
      term = o_345.invoke(context, j_454);
      if(term == null)
        break Fail941;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSortListTl_2, new IStrategoTerm[]{l_454, term}), checkListAnnos(termFactory, k_454));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}