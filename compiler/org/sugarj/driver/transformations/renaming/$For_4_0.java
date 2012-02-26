package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $For_4_0 extends Strategy 
{ 
  public static $For_4_0 instance = new $For_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_20, Strategy f_20, Strategy g_20, Strategy h_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("For_4_0");
    Fail83:
    { 
      IStrategoTerm n_114 = null;
      IStrategoTerm j_114 = null;
      IStrategoTerm k_114 = null;
      IStrategoTerm l_114 = null;
      IStrategoTerm m_114 = null;
      IStrategoTerm o_114 = null;
      IStrategoTerm p_114 = null;
      IStrategoTerm s_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFor_4 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      j_114 = term.getSubterm(0);
      k_114 = term.getSubterm(1);
      l_114 = term.getSubterm(2);
      m_114 = term.getSubterm(3);
      IStrategoList annos68 = term.getAnnotations();
      n_114 = annos68;
      term = e_20.invoke(context, j_114);
      if(term == null)
        break Fail83;
      o_114 = term;
      term = f_20.invoke(context, k_114);
      if(term == null)
        break Fail83;
      p_114 = term;
      term = g_20.invoke(context, l_114);
      if(term == null)
        break Fail83;
      s_114 = term;
      term = h_20.invoke(context, m_114);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFor_4, new IStrategoTerm[]{o_114, p_114, s_114, term}), checkListAnnos(termFactory, n_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}