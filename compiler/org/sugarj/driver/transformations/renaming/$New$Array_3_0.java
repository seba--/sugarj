package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $New$Array_3_0 extends Strategy 
{ 
  public static $New$Array_3_0 instance = new $New$Array_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_29, Strategy l_29, Strategy m_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewArray_3_0");
    Fail70:
    { 
      IStrategoTerm s_134 = null;
      IStrategoTerm x_133 = null;
      IStrategoTerm q_134 = null;
      IStrategoTerm r_134 = null;
      IStrategoTerm t_134 = null;
      IStrategoTerm z_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consNewArray_3 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      x_133 = term.getSubterm(0);
      q_134 = term.getSubterm(1);
      r_134 = term.getSubterm(2);
      IStrategoList annos46 = term.getAnnotations();
      s_134 = annos46;
      term = k_29.invoke(context, x_133);
      if(term == null)
        break Fail70;
      t_134 = term;
      term = l_29.invoke(context, q_134);
      if(term == null)
        break Fail70;
      z_134 = term;
      term = m_29.invoke(context, r_134);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consNewArray_3, new IStrategoTerm[]{t_134, z_134, term}), checkListAnnos(termFactory, s_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}