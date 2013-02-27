package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_14, Strategy j_14, Strategy k_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CondChoice_3_0");
    Fail70:
    { 
      IStrategoTerm n_102 = null;
      IStrategoTerm k_102 = null;
      IStrategoTerm l_102 = null;
      IStrategoTerm m_102 = null;
      IStrategoTerm o_102 = null;
      IStrategoTerm p_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCondChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      k_102 = term.getSubterm(0);
      l_102 = term.getSubterm(1);
      m_102 = term.getSubterm(2);
      IStrategoList annos60 = term.getAnnotations();
      n_102 = annos60;
      term = i_14.invoke(context, k_102);
      if(term == null)
        break Fail70;
      o_102 = term;
      term = j_14.invoke(context, l_102);
      if(term == null)
        break Fail70;
      p_102 = term;
      term = k_14.invoke(context, m_102);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCondChoice_3, new IStrategoTerm[]{o_102, p_102, term}), checkListAnnos(termFactory, n_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}