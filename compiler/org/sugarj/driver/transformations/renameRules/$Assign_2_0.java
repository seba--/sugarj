package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_13, Strategy z_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail61:
    { 
      IStrategoTerm m_101 = null;
      IStrategoTerm i_101 = null;
      IStrategoTerm j_101 = null;
      IStrategoTerm n_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      i_101 = term.getSubterm(0);
      j_101 = term.getSubterm(1);
      IStrategoList annos55 = term.getAnnotations();
      m_101 = annos55;
      term = y_13.invoke(context, i_101);
      if(term == null)
        break Fail61;
      n_101 = term;
      term = z_13.invoke(context, j_101);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssign_2, new IStrategoTerm[]{n_101, term}), checkListAnnos(termFactory, m_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}