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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_15, Strategy i_15, Strategy j_15, Strategy k_15, Strategy l_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecHead_5_0");
    Fail32:
    { 
      IStrategoTerm q_102 = null;
      IStrategoTerm l_102 = null;
      IStrategoTerm m_102 = null;
      IStrategoTerm n_102 = null;
      IStrategoTerm o_102 = null;
      IStrategoTerm p_102 = null;
      IStrategoTerm r_102 = null;
      IStrategoTerm s_102 = null;
      IStrategoTerm t_102 = null;
      IStrategoTerm u_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      l_102 = term.getSubterm(0);
      m_102 = term.getSubterm(1);
      n_102 = term.getSubterm(2);
      o_102 = term.getSubterm(3);
      p_102 = term.getSubterm(4);
      IStrategoList annos23 = term.getAnnotations();
      q_102 = annos23;
      term = h_15.invoke(context, l_102);
      if(term == null)
        break Fail32;
      r_102 = term;
      term = i_15.invoke(context, m_102);
      if(term == null)
        break Fail32;
      s_102 = term;
      term = j_15.invoke(context, n_102);
      if(term == null)
        break Fail32;
      t_102 = term;
      term = k_15.invoke(context, o_102);
      if(term == null)
        break Fail32;
      u_102 = term;
      term = l_15.invoke(context, p_102);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDecHead_5, new IStrategoTerm[]{r_102, s_102, t_102, u_102, term}), checkListAnnos(termFactory, q_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}