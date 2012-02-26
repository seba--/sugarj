package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Static$Import$Dec_2_0 extends Strategy 
{ 
  public static $Static$Import$Dec_2_0 instance = new $Static$Import$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_14, Strategy n_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticImportDec_2_0");
    Fail14:
    { 
      IStrategoTerm m_99 = null;
      IStrategoTerm k_99 = null;
      IStrategoTerm l_99 = null;
      IStrategoTerm n_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticImportDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail14;
      k_99 = term.getSubterm(0);
      l_99 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      m_99 = annos2;
      term = m_14.invoke(context, k_99);
      if(term == null)
        break Fail14;
      n_99 = term;
      term = n_14.invoke(context, l_99);
      if(term == null)
        break Fail14;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticImportDec_2, new IStrategoTerm[]{n_99, term}), checkListAnnos(termFactory, m_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}