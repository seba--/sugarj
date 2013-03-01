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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_41, Strategy n_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRule_2_0");
    Fail261:
    { 
      IStrategoTerm l_177 = null;
      IStrategoTerm j_177 = null;
      IStrategoTerm k_177 = null;
      IStrategoTerm m_177 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail261;
      j_177 = term.getSubterm(0);
      k_177 = term.getSubterm(1);
      IStrategoList annos208 = term.getAnnotations();
      l_177 = annos208;
      term = m_41.invoke(context, j_177);
      if(term == null)
        break Fail261;
      m_177 = term;
      term = n_41.invoke(context, k_177);
      if(term == null)
        break Fail261;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRule_2, new IStrategoTerm[]{m_177, term}), checkListAnnos(termFactory, l_177));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}