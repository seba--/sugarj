package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Module_2_0 extends Strategy 
{ 
  public static $Module_2_0 instance = new $Module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_18, Strategy u_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail61:
    { 
      IStrategoTerm n_110 = null;
      IStrategoTerm l_110 = null;
      IStrategoTerm m_110 = null;
      IStrategoTerm o_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      l_110 = term.getSubterm(0);
      m_110 = term.getSubterm(1);
      IStrategoList annos38 = term.getAnnotations();
      n_110 = annos38;
      term = t_18.invoke(context, l_110);
      if(term == null)
        break Fail61;
      o_110 = term;
      term = u_18.invoke(context, m_110);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consModule_2, new IStrategoTerm[]{o_110, term}), checkListAnnos(termFactory, n_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}