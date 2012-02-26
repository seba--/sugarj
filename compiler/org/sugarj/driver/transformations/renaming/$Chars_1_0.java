package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Chars_1_0 extends Strategy 
{ 
  public static $Chars_1_0 instance = new $Chars_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Chars_1_0");
    Fail185:
    { 
      IStrategoTerm m_133 = null;
      IStrategoTerm l_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChars_1 != ((IStrategoAppl)term).getConstructor())
        break Fail185;
      l_133 = term.getSubterm(0);
      IStrategoList annos157 = term.getAnnotations();
      m_133 = annos157;
      term = i_26.invoke(context, l_133);
      if(term == null)
        break Fail185;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChars_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}