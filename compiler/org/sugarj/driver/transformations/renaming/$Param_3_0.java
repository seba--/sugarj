package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Param_3_0 extends Strategy 
{ 
  public static $Param_3_0 instance = new $Param_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_18, Strategy s_18, Strategy t_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Param_3_0");
    Fail64:
    { 
      IStrategoTerm k_110 = null;
      IStrategoTerm h_110 = null;
      IStrategoTerm i_110 = null;
      IStrategoTerm j_110 = null;
      IStrategoTerm l_110 = null;
      IStrategoTerm m_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      h_110 = term.getSubterm(0);
      i_110 = term.getSubterm(1);
      j_110 = term.getSubterm(2);
      IStrategoList annos51 = term.getAnnotations();
      k_110 = annos51;
      term = r_18.invoke(context, h_110);
      if(term == null)
        break Fail64;
      l_110 = term;
      term = s_18.invoke(context, i_110);
      if(term == null)
        break Fail64;
      m_110 = term;
      term = t_18.invoke(context, j_110);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consParam_3, new IStrategoTerm[]{l_110, m_110, term}), checkListAnnos(termFactory, k_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}