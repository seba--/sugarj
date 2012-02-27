package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec$Head_5_0 extends Strategy 
{ 
  public static $Class$Dec$Head_5_0 instance = new $Class$Dec$Head_5_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_16, Strategy f_16, Strategy g_16, Strategy h_16, Strategy i_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecHead_5_0");
    Fail37:
    { 
      IStrategoTerm o_103 = null;
      IStrategoTerm j_103 = null;
      IStrategoTerm k_103 = null;
      IStrategoTerm l_103 = null;
      IStrategoTerm m_103 = null;
      IStrategoTerm n_103 = null;
      IStrategoTerm p_103 = null;
      IStrategoTerm q_103 = null;
      IStrategoTerm r_103 = null;
      IStrategoTerm s_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      j_103 = term.getSubterm(0);
      k_103 = term.getSubterm(1);
      l_103 = term.getSubterm(2);
      m_103 = term.getSubterm(3);
      n_103 = term.getSubterm(4);
      IStrategoList annos23 = term.getAnnotations();
      o_103 = annos23;
      term = e_16.invoke(context, j_103);
      if(term == null)
        break Fail37;
      p_103 = term;
      term = f_16.invoke(context, k_103);
      if(term == null)
        break Fail37;
      q_103 = term;
      term = g_16.invoke(context, l_103);
      if(term == null)
        break Fail37;
      r_103 = term;
      term = h_16.invoke(context, m_103);
      if(term == null)
        break Fail37;
      s_103 = term;
      term = i_16.invoke(context, n_103);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDecHead_5, new IStrategoTerm[]{p_103, q_103, r_103, s_103, term}), checkListAnnos(termFactory, o_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}