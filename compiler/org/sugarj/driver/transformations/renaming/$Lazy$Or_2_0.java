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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_22, Strategy s_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyOr_2_0");
    Fail119:
    { 
      IStrategoTerm j_121 = null;
      IStrategoTerm h_121 = null;
      IStrategoTerm i_121 = null;
      IStrategoTerm m_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLazyOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail119;
      h_121 = term.getSubterm(0);
      i_121 = term.getSubterm(1);
      IStrategoList annos101 = term.getAnnotations();
      j_121 = annos101;
      term = r_22.invoke(context, h_121);
      if(term == null)
        break Fail119;
      m_121 = term;
      term = s_22.invoke(context, i_121);
      if(term == null)
        break Fail119;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLazyOr_2, new IStrategoTerm[]{m_121, term}), checkListAnnos(termFactory, j_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}