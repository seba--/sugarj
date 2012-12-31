package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Body_1_0 extends Strategy 
{ 
  public static $Sugar$Body_1_0 instance = new $Sugar$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarBody_1_0");
    Fail32:
    { 
      IStrategoTerm m_125 = null;
      IStrategoTerm l_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSugarBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      l_125 = term.getSubterm(0);
      IStrategoList annos9 = term.getAnnotations();
      m_125 = annos9;
      term = z_26.invoke(context, l_125);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSugarBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}