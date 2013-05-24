package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Completion$Template$With$Sort_4_0 extends Strategy 
{ 
  public static $Completion$Template$With$Sort_4_0 instance = new $Completion$Template$With$Sort_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_335, Strategy u_335, Strategy v_335, Strategy w_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionTemplateWithSort_4_0");
    Fail774:
    { 
      IStrategoTerm q_429 = null;
      IStrategoTerm m_429 = null;
      IStrategoTerm n_429 = null;
      IStrategoTerm o_429 = null;
      IStrategoTerm p_429 = null;
      IStrategoTerm r_429 = null;
      IStrategoTerm s_429 = null;
      IStrategoTerm t_429 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCompletionTemplateWithSort_4 != ((IStrategoAppl)term).getConstructor())
        break Fail774;
      m_429 = term.getSubterm(0);
      n_429 = term.getSubterm(1);
      o_429 = term.getSubterm(2);
      p_429 = term.getSubterm(3);
      IStrategoList annos40 = term.getAnnotations();
      q_429 = annos40;
      term = t_335.invoke(context, m_429);
      if(term == null)
        break Fail774;
      r_429 = term;
      term = u_335.invoke(context, n_429);
      if(term == null)
        break Fail774;
      s_429 = term;
      term = v_335.invoke(context, o_429);
      if(term == null)
        break Fail774;
      t_429 = term;
      term = w_335.invoke(context, p_429);
      if(term == null)
        break Fail774;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCompletionTemplateWithSort_4, new IStrategoTerm[]{r_429, s_429, t_429, term}), checkListAnnos(termFactory, q_429));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}