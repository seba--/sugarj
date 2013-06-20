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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_29, Strategy w_29, Strategy x_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("real_con_3_0");
    Fail279:
    { 
      IStrategoTerm r_149 = null;
      IStrategoTerm o_149 = null;
      IStrategoTerm p_149 = null;
      IStrategoTerm q_149 = null;
      IStrategoTerm s_149 = null;
      IStrategoTerm t_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consreal_con_3 != ((IStrategoAppl)term).getConstructor())
        break Fail279;
      o_149 = term.getSubterm(0);
      p_149 = term.getSubterm(1);
      q_149 = term.getSubterm(2);
      IStrategoList annos230 = term.getAnnotations();
      r_149 = annos230;
      term = v_29.invoke(context, o_149);
      if(term == null)
        break Fail279;
      s_149 = term;
      term = w_29.invoke(context, p_149);
      if(term == null)
        break Fail279;
      t_149 = term;
      term = x_29.invoke(context, q_149);
      if(term == null)
        break Fail279;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consreal_con_3, new IStrategoTerm[]{s_149, t_149, term}), checkListAnnos(termFactory, r_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}