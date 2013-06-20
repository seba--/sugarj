package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_17, Strategy h_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRule_2_0");
    Fail50:
    { 
      IStrategoTerm m_106 = null;
      IStrategoTerm k_106 = null;
      IStrategoTerm l_106 = null;
      IStrategoTerm n_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSetDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail50;
      k_106 = term.getSubterm(0);
      l_106 = term.getSubterm(1);
      IStrategoList annos23 = term.getAnnotations();
      m_106 = annos23;
      term = g_17.invoke(context, k_106);
      if(term == null)
        break Fail50;
      n_106 = term;
      term = h_17.invoke(context, l_106);
      if(term == null)
        break Fail50;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSetDynRule_2, new IStrategoTerm[]{n_106, term}), checkListAnnos(termFactory, m_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}