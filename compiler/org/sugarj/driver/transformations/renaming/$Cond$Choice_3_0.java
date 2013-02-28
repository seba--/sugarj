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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_14, Strategy m_14, Strategy n_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CondChoice_3_0");
    Fail70:
    { 
      IStrategoTerm q_102 = null;
      IStrategoTerm n_102 = null;
      IStrategoTerm o_102 = null;
      IStrategoTerm p_102 = null;
      IStrategoTerm r_102 = null;
      IStrategoTerm s_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCondChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      n_102 = term.getSubterm(0);
      o_102 = term.getSubterm(1);
      p_102 = term.getSubterm(2);
      IStrategoList annos60 = term.getAnnotations();
      q_102 = annos60;
      term = l_14.invoke(context, n_102);
      if(term == null)
        break Fail70;
      r_102 = term;
      term = m_14.invoke(context, o_102);
      if(term == null)
        break Fail70;
      s_102 = term;
      term = n_14.invoke(context, p_102);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCondChoice_3, new IStrategoTerm[]{r_102, s_102, term}), checkListAnnos(termFactory, q_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}