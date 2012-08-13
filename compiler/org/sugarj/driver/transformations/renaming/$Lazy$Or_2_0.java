package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lazy$Or_2_0 extends Strategy 
{ 
  public static $Lazy$Or_2_0 instance = new $Lazy$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_28, Strategy d_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyOr_2_0");
    Fail167:
    { 
      IStrategoTerm n_137 = null;
      IStrategoTerm l_137 = null;
      IStrategoTerm m_137 = null;
      IStrategoTerm o_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLazyOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail167;
      l_137 = term.getSubterm(0);
      m_137 = term.getSubterm(1);
      IStrategoList annos142 = term.getAnnotations();
      n_137 = annos142;
      term = c_28.invoke(context, l_137);
      if(term == null)
        break Fail167;
      o_137 = term;
      term = d_28.invoke(context, m_137);
      if(term == null)
        break Fail167;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLazyOr_2, new IStrategoTerm[]{o_137, term}), checkListAnnos(termFactory, n_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}