package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Desugarings_1_0 extends Strategy 
{ 
  public static $Desugarings_1_0 instance = new $Desugarings_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Desugarings_1_0");
    Fail751:
    { 
      IStrategoTerm m_426 = null;
      IStrategoTerm l_426 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDesugarings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail751;
      l_426 = term.getSubterm(0);
      IStrategoList annos23 = term.getAnnotations();
      m_426 = annos23;
      term = o_334.invoke(context, l_426);
      if(term == null)
        break Fail751;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDesugarings_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_426));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}