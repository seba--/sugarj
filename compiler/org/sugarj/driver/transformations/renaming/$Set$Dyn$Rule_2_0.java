package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule_2_0 instance = new $Set$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_10, Strategy x_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRule_2_0");
    Fail24:
    { 
      IStrategoTerm l_92 = null;
      IStrategoTerm j_92 = null;
      IStrategoTerm k_92 = null;
      IStrategoTerm m_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      j_92 = term.getSubterm(0);
      k_92 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      l_92 = annos14;
      term = w_10.invoke(context, j_92);
      if(term == null)
        break Fail24;
      m_92 = term;
      term = x_10.invoke(context, k_92);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRule_2, new IStrategoTerm[]{m_92, term}), checkListAnnos(termFactory, l_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}