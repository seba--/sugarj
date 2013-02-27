package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_14, Strategy b_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail65:
    { 
      IStrategoTerm o_101 = null;
      IStrategoTerm m_101 = null;
      IStrategoTerm n_101 = null;
      IStrategoTerm p_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      m_101 = term.getSubterm(0);
      n_101 = term.getSubterm(1);
      IStrategoList annos55 = term.getAnnotations();
      o_101 = annos55;
      term = a_14.invoke(context, m_101);
      if(term == null)
        break Fail65;
      p_101 = term;
      term = b_14.invoke(context, n_101);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssign_2, new IStrategoTerm[]{p_101, term}), checkListAnnos(termFactory, o_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}