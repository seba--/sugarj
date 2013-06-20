package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cond$Choice_3_0 extends Strategy 
{ 
  public static $Cond$Choice_3_0 instance = new $Cond$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_20, Strategy w_20, Strategy x_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CondChoice_3_0");
    Fail96:
    { 
      IStrategoTerm l_116 = null;
      IStrategoTerm i_116 = null;
      IStrategoTerm j_116 = null;
      IStrategoTerm k_116 = null;
      IStrategoTerm m_116 = null;
      IStrategoTerm n_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consCondChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail96;
      i_116 = term.getSubterm(0);
      j_116 = term.getSubterm(1);
      k_116 = term.getSubterm(2);
      IStrategoList annos69 = term.getAnnotations();
      l_116 = annos69;
      term = v_20.invoke(context, i_116);
      if(term == null)
        break Fail96;
      m_116 = term;
      term = w_20.invoke(context, j_116);
      if(term == null)
        break Fail96;
      n_116 = term;
      term = x_20.invoke(context, k_116);
      if(term == null)
        break Fail96;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consCondChoice_3, new IStrategoTerm[]{m_116, n_116, term}), checkListAnnos(termFactory, l_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}