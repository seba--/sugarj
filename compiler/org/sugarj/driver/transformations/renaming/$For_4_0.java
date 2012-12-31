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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_33, Strategy y_33, Strategy z_33, Strategy a_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("For_4_0");
    Fail121:
    { 
      IStrategoTerm q_150 = null;
      IStrategoTerm m_150 = null;
      IStrategoTerm n_150 = null;
      IStrategoTerm o_150 = null;
      IStrategoTerm p_150 = null;
      IStrategoTerm r_150 = null;
      IStrategoTerm s_150 = null;
      IStrategoTerm t_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consFor_4 != ((IStrategoAppl)term).getConstructor())
        break Fail121;
      m_150 = term.getSubterm(0);
      n_150 = term.getSubterm(1);
      o_150 = term.getSubterm(2);
      p_150 = term.getSubterm(3);
      IStrategoList annos94 = term.getAnnotations();
      q_150 = annos94;
      term = x_33.invoke(context, m_150);
      if(term == null)
        break Fail121;
      r_150 = term;
      term = y_33.invoke(context, n_150);
      if(term == null)
        break Fail121;
      s_150 = term;
      term = z_33.invoke(context, o_150);
      if(term == null)
        break Fail121;
      t_150 = term;
      term = a_34.invoke(context, p_150);
      if(term == null)
        break Fail121;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consFor_4, new IStrategoTerm[]{r_150, s_150, t_150, term}), checkListAnnos(termFactory, q_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}