package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule_3_0 extends Strategy 
{ 
  public static $Rule_3_0 instance = new $Rule_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_11, Strategy d_11, Strategy e_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rule_3_0");
    Fail30:
    { 
      IStrategoTerm q_93 = null;
      IStrategoTerm m_93 = null;
      IStrategoTerm o_93 = null;
      IStrategoTerm p_93 = null;
      IStrategoTerm r_93 = null;
      IStrategoTerm s_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      m_93 = term.getSubterm(0);
      o_93 = term.getSubterm(1);
      p_93 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      q_93 = annos20;
      term = c_11.invoke(context, m_93);
      if(term == null)
        break Fail30;
      r_93 = term;
      term = d_11.invoke(context, o_93);
      if(term == null)
        break Fail30;
      s_93 = term;
      term = e_11.invoke(context, p_93);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRule_3, new IStrategoTerm[]{r_93, s_93, term}), checkListAnnos(termFactory, q_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}