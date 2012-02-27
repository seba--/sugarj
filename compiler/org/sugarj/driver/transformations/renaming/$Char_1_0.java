package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Char_1_0 extends Strategy 
{ 
  public static $Char_1_0 instance = new $Char_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail190:
    { 
      IStrategoTerm p_135 = null;
      IStrategoTerm m_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail190;
      m_135 = term.getSubterm(0);
      IStrategoList annos160 = term.getAnnotations();
      p_135 = annos160;
      term = t_26.invoke(context, m_135);
      if(term == null)
        break Fail190;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}