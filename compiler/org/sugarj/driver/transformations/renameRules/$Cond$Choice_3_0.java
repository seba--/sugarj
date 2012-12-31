package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_14, Strategy k_14, Strategy l_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CondChoice_3_0");
    Fail66:
    { 
      IStrategoTerm o_102 = null;
      IStrategoTerm l_102 = null;
      IStrategoTerm m_102 = null;
      IStrategoTerm n_102 = null;
      IStrategoTerm p_102 = null;
      IStrategoTerm q_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCondChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      l_102 = term.getSubterm(0);
      m_102 = term.getSubterm(1);
      n_102 = term.getSubterm(2);
      IStrategoList annos60 = term.getAnnotations();
      o_102 = annos60;
      term = j_14.invoke(context, l_102);
      if(term == null)
        break Fail66;
      p_102 = term;
      term = k_14.invoke(context, m_102);
      if(term == null)
        break Fail66;
      q_102 = term;
      term = l_14.invoke(context, n_102);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCondChoice_3, new IStrategoTerm[]{p_102, q_102, term}), checkListAnnos(termFactory, o_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}