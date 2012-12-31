package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Dec_1_0 extends Strategy 
{ 
  public static $Super$Dec_1_0 instance = new $Super$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperDec_1_0");
    Fail72:
    { 
      IStrategoTerm m_135 = null;
      IStrategoTerm k_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSuperDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      k_135 = term.getSubterm(0);
      IStrategoList annos48 = term.getAnnotations();
      m_135 = annos48;
      term = o_29.invoke(context, k_135);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSuperDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}