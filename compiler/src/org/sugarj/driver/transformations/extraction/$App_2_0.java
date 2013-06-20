package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $App_2_0 extends Strategy 
{ 
  public static $App_2_0 instance = new $App_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_24, Strategy h_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("App_2_0");
    Fail157:
    { 
      IStrategoTerm o_126 = null;
      IStrategoTerm m_126 = null;
      IStrategoTerm n_126 = null;
      IStrategoTerm p_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      m_126 = term.getSubterm(0);
      n_126 = term.getSubterm(1);
      IStrategoList annos126 = term.getAnnotations();
      o_126 = annos126;
      term = g_24.invoke(context, m_126);
      if(term == null)
        break Fail157;
      p_126 = term;
      term = h_24.invoke(context, n_126);
      if(term == null)
        break Fail157;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consApp_2, new IStrategoTerm[]{p_126, term}), checkListAnnos(termFactory, o_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}