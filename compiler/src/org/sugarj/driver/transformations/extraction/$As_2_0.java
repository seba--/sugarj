package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $As_2_0 extends Strategy 
{ 
  public static $As_2_0 instance = new $As_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_24, Strategy n_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("As_2_0");
    Fail161:
    { 
      IStrategoTerm g_127 = null;
      IStrategoTerm d_127 = null;
      IStrategoTerm e_127 = null;
      IStrategoTerm i_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail161;
      d_127 = term.getSubterm(0);
      e_127 = term.getSubterm(1);
      IStrategoList annos130 = term.getAnnotations();
      g_127 = annos130;
      term = m_24.invoke(context, d_127);
      if(term == null)
        break Fail161;
      i_127 = term;
      term = n_24.invoke(context, e_127);
      if(term == null)
        break Fail161;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAs_2, new IStrategoTerm[]{i_127, term}), checkListAnnos(termFactory, g_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}