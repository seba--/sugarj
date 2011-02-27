package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Str$Cong_1_0 extends Strategy 
{ 
  public static $Str$Cong_1_0 instance = new $Str$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrCong_1_0");
    Fail99:
    { 
      IStrategoTerm m_118 = null;
      IStrategoTerm l_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consStrCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      l_118 = term.getSubterm(0);
      IStrategoList annos75 = term.getAnnotations();
      m_118 = annos75;
      term = s_21.invoke(context, l_118);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consStrCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}