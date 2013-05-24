package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Type_2_0 extends Strategy 
{ 
  public static $Fun$Type_2_0 instance = new $Fun$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_346, Strategy i_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunType_2_0");
    Fail957:
    { 
      IStrategoTerm m_456 = null;
      IStrategoTerm k_456 = null;
      IStrategoTerm l_456 = null;
      IStrategoTerm n_456 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consFunType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail957;
      k_456 = term.getSubterm(0);
      l_456 = term.getSubterm(1);
      IStrategoList annos200 = term.getAnnotations();
      m_456 = annos200;
      term = h_346.invoke(context, k_456);
      if(term == null)
        break Fail957;
      n_456 = term;
      term = i_346.invoke(context, l_456);
      if(term == null)
        break Fail957;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consFunType_2, new IStrategoTerm[]{n_456, term}), checkListAnnos(termFactory, m_456));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}