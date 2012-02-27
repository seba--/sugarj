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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_20, Strategy n_20, Strategy o_20, Strategy p_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("For_4_0");
    Fail85:
    { 
      IStrategoTerm y_114 = null;
      IStrategoTerm t_114 = null;
      IStrategoTerm v_114 = null;
      IStrategoTerm w_114 = null;
      IStrategoTerm x_114 = null;
      IStrategoTerm z_114 = null;
      IStrategoTerm a_115 = null;
      IStrategoTerm d_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFor_4 != ((IStrategoAppl)term).getConstructor())
        break Fail85;
      t_114 = term.getSubterm(0);
      v_114 = term.getSubterm(1);
      w_114 = term.getSubterm(2);
      x_114 = term.getSubterm(3);
      IStrategoList annos68 = term.getAnnotations();
      y_114 = annos68;
      term = m_20.invoke(context, t_114);
      if(term == null)
        break Fail85;
      z_114 = term;
      term = n_20.invoke(context, v_114);
      if(term == null)
        break Fail85;
      a_115 = term;
      term = o_20.invoke(context, w_114);
      if(term == null)
        break Fail85;
      d_115 = term;
      term = p_20.invoke(context, x_114);
      if(term == null)
        break Fail85;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFor_4, new IStrategoTerm[]{z_114, a_115, d_115, term}), checkListAnnos(termFactory, y_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}