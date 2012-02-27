package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $For$Each_3_0 extends Strategy 
{ 
  public static $For$Each_3_0 instance = new $For$Each_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_20, Strategy k_20, Strategy l_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ForEach_3_0");
    Fail84:
    { 
      IStrategoTerm n_114 = null;
      IStrategoTerm k_114 = null;
      IStrategoTerm l_114 = null;
      IStrategoTerm m_114 = null;
      IStrategoTerm o_114 = null;
      IStrategoTerm p_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consForEach_3 != ((IStrategoAppl)term).getConstructor())
        break Fail84;
      k_114 = term.getSubterm(0);
      l_114 = term.getSubterm(1);
      m_114 = term.getSubterm(2);
      IStrategoList annos67 = term.getAnnotations();
      n_114 = annos67;
      term = j_20.invoke(context, k_114);
      if(term == null)
        break Fail84;
      o_114 = term;
      term = k_20.invoke(context, l_114);
      if(term == null)
        break Fail84;
      p_114 = term;
      term = l_20.invoke(context, m_114);
      if(term == null)
        break Fail84;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consForEach_3, new IStrategoTerm[]{o_114, p_114, term}), checkListAnnos(termFactory, n_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}