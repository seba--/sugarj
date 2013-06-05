package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class real_con_3_0 extends Strategy 
{ 
  public static real_con_3_0 instance = new real_con_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_29, Strategy u_29, Strategy v_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("real_con_3_0");
    Fail278:
    { 
      IStrategoTerm m_149 = null;
      IStrategoTerm j_149 = null;
      IStrategoTerm k_149 = null;
      IStrategoTerm l_149 = null;
      IStrategoTerm n_149 = null;
      IStrategoTerm o_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consreal_con_3 != ((IStrategoAppl)term).getConstructor())
        break Fail278;
      j_149 = term.getSubterm(0);
      k_149 = term.getSubterm(1);
      l_149 = term.getSubterm(2);
      IStrategoList annos229 = term.getAnnotations();
      m_149 = annos229;
      term = t_29.invoke(context, j_149);
      if(term == null)
        break Fail278;
      n_149 = term;
      term = u_29.invoke(context, k_149);
      if(term == null)
        break Fail278;
      o_149 = term;
      term = v_29.invoke(context, l_149);
      if(term == null)
        break Fail278;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consreal_con_3, new IStrategoTerm[]{n_149, o_149, term}), checkListAnnos(termFactory, m_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}