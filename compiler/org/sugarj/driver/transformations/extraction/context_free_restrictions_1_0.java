package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_restrictions_1_0 extends Strategy 
{ 
  public static context_free_restrictions_1_0 instance = new context_free_restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_restrictions_1_0");
    Fail749:
    { 
      IStrategoTerm g_426 = null;
      IStrategoTerm f_426 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conscontext_free_restrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail749;
      f_426 = term.getSubterm(0);
      IStrategoList annos21 = term.getAnnotations();
      g_426 = annos21;
      term = m_334.invoke(context, f_426);
      if(term == null)
        break Fail749;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conscontext_free_restrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_426));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}