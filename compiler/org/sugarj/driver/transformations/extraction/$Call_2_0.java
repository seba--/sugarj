package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call_2_0 extends Strategy 
{ 
  public static $Call_2_0 instance = new $Call_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_22, Strategy h_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail122:
    { 
      IStrategoTerm o_120 = null;
      IStrategoTerm m_120 = null;
      IStrategoTerm n_120 = null;
      IStrategoTerm p_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      m_120 = term.getSubterm(0);
      n_120 = term.getSubterm(1);
      IStrategoList annos94 = term.getAnnotations();
      o_120 = annos94;
      term = g_22.invoke(context, m_120);
      if(term == null)
        break Fail122;
      p_120 = term;
      term = h_22.invoke(context, n_120);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consCall_2, new IStrategoTerm[]{p_120, term}), checkListAnnos(termFactory, o_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}