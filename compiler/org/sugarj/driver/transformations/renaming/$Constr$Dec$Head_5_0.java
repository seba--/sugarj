package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Dec$Head_5_0 extends Strategy 
{ 
  public static $Constr$Dec$Head_5_0 instance = new $Constr$Dec$Head_5_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_18, Strategy n_18, Strategy o_18, Strategy p_18, Strategy q_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDecHead_5_0");
    Fail59:
    { 
      IStrategoTerm m_109 = null;
      IStrategoTerm g_109 = null;
      IStrategoTerm h_109 = null;
      IStrategoTerm i_109 = null;
      IStrategoTerm j_109 = null;
      IStrategoTerm l_109 = null;
      IStrategoTerm n_109 = null;
      IStrategoTerm o_109 = null;
      IStrategoTerm r_109 = null;
      IStrategoTerm s_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      g_109 = term.getSubterm(0);
      h_109 = term.getSubterm(1);
      i_109 = term.getSubterm(2);
      j_109 = term.getSubterm(3);
      l_109 = term.getSubterm(4);
      IStrategoList annos45 = term.getAnnotations();
      m_109 = annos45;
      term = m_18.invoke(context, g_109);
      if(term == null)
        break Fail59;
      n_109 = term;
      term = n_18.invoke(context, h_109);
      if(term == null)
        break Fail59;
      o_109 = term;
      term = o_18.invoke(context, i_109);
      if(term == null)
        break Fail59;
      r_109 = term;
      term = p_18.invoke(context, j_109);
      if(term == null)
        break Fail59;
      s_109 = term;
      term = q_18.invoke(context, l_109);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrDecHead_5, new IStrategoTerm[]{n_109, o_109, r_109, s_109, term}), checkListAnnos(termFactory, m_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}