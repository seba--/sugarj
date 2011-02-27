package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gen$Dyn$Rules_1_0 extends Strategy 
{ 
  public static $Gen$Dyn$Rules_1_0 instance = new $Gen$Dyn$Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenDynRules_1_0");
    Fail76:
    { 
      IStrategoTerm m_114 = null;
      IStrategoTerm l_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consGenDynRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76;
      l_114 = term.getSubterm(0);
      IStrategoList annos53 = term.getAnnotations();
      m_114 = annos53;
      term = g_20.invoke(context, l_114);
      if(term == null)
        break Fail76;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consGenDynRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}