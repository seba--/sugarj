package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Generic$Method_3_0 extends Strategy 
{ 
  public static $Generic$Method_3_0 instance = new $Generic$Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_28, Strategy s_28, Strategy t_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenericMethod_3_0");
    Fail60:
    { 
      IStrategoTerm t_130 = null;
      IStrategoTerm m_130 = null;
      IStrategoTerm o_130 = null;
      IStrategoTerm q_130 = null;
      IStrategoTerm v_130 = null;
      IStrategoTerm w_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGenericMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      m_130 = term.getSubterm(0);
      o_130 = term.getSubterm(1);
      q_130 = term.getSubterm(2);
      IStrategoList annos36 = term.getAnnotations();
      t_130 = annos36;
      term = r_28.invoke(context, m_130);
      if(term == null)
        break Fail60;
      v_130 = term;
      term = s_28.invoke(context, o_130);
      if(term == null)
        break Fail60;
      w_130 = term;
      term = t_28.invoke(context, q_130);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGenericMethod_3, new IStrategoTerm[]{v_130, w_130, term}), checkListAnnos(termFactory, t_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}