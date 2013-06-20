package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parameterized_sort_2_0 extends Strategy 
{ 
  public static parameterized_sort_2_0 instance = new parameterized_sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_27, Strategy q_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parameterized_sort_2_0");
    Fail228:
    { 
      IStrategoTerm q_140 = null;
      IStrategoTerm l_140 = null;
      IStrategoTerm m_140 = null;
      IStrategoTerm u_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consparameterized_sort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail228;
      l_140 = term.getSubterm(0);
      m_140 = term.getSubterm(1);
      IStrategoList annos186 = term.getAnnotations();
      q_140 = annos186;
      term = p_27.invoke(context, l_140);
      if(term == null)
        break Fail228;
      u_140 = term;
      term = q_27.invoke(context, m_140);
      if(term == null)
        break Fail228;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consparameterized_sort_2, new IStrategoTerm[]{u_140, term}), checkListAnnos(termFactory, q_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}