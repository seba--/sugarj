package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Single$Elem$Anno_2_0 extends Strategy 
{ 
  public static $Single$Elem$Anno_2_0 instance = new $Single$Elem$Anno_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_14, Strategy x_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SingleElemAnno_2_0");
    Fail21:
    { 
      IStrategoTerm n_100 = null;
      IStrategoTerm l_100 = null;
      IStrategoTerm m_100 = null;
      IStrategoTerm o_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSingleElemAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      l_100 = term.getSubterm(0);
      m_100 = term.getSubterm(1);
      IStrategoList annos9 = term.getAnnotations();
      n_100 = annos9;
      term = w_14.invoke(context, l_100);
      if(term == null)
        break Fail21;
      o_100 = term;
      term = x_14.invoke(context, m_100);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSingleElemAnno_2, new IStrategoTerm[]{o_100, term}), checkListAnnos(termFactory, n_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}