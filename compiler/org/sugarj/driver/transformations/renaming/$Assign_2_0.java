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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_36, Strategy d_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail153:
    { 
      IStrategoTerm m_159 = null;
      IStrategoTerm k_159 = null;
      IStrategoTerm l_159 = null;
      IStrategoTerm n_159 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail153;
      k_159 = term.getSubterm(0);
      l_159 = term.getSubterm(1);
      IStrategoList annos123 = term.getAnnotations();
      m_159 = annos123;
      term = c_36.invoke(context, k_159);
      if(term == null)
        break Fail153;
      n_159 = term;
      term = d_36.invoke(context, l_159);
      if(term == null)
        break Fail153;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssign_2, new IStrategoTerm[]{n_159, term}), checkListAnnos(termFactory, m_159));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}