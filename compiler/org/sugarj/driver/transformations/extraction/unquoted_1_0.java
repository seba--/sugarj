package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unquoted_1_0 extends Strategy 
{ 
  public static unquoted_1_0 instance = new unquoted_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unquoted_1_0");
    Fail168:
    { 
      IStrategoTerm m_130 = null;
      IStrategoTerm k_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consunquoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail168;
      k_130 = term.getSubterm(0);
      IStrategoList annos141 = term.getAnnotations();
      m_130 = annos141;
      term = o_25.invoke(context, k_130);
      if(term == null)
        break Fail168;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consunquoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}