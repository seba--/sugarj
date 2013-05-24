package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Build$Default$P$T_1_0 extends Strategy 
{ 
  public static $Build$Default$P$T_1_0 instance = new $Build$Default$P$T_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefaultPT_1_0");
    Fail928:
    { 
      IStrategoTerm m_452 = null;
      IStrategoTerm l_452 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBuildDefaultPT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail928;
      l_452 = term.getSubterm(0);
      IStrategoList annos173 = term.getAnnotations();
      m_452 = annos173;
      term = v_344.invoke(context, l_452);
      if(term == null)
        break Fail928;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consBuildDefaultPT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_452));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}