package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Labeled_2_0 extends Strategy 
{ 
  public static $Labeled_2_0 instance = new $Labeled_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_20, Strategy y_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Labeled_2_0");
    Fail92:
    { 
      IStrategoTerm m_116 = null;
      IStrategoTerm k_116 = null;
      IStrategoTerm l_116 = null;
      IStrategoTerm n_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLabeled_2 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      k_116 = term.getSubterm(0);
      l_116 = term.getSubterm(1);
      IStrategoList annos77 = term.getAnnotations();
      m_116 = annos77;
      term = x_20.invoke(context, k_116);
      if(term == null)
        break Fail92;
      n_116 = term;
      term = y_20.invoke(context, l_116);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLabeled_2, new IStrategoTerm[]{n_116, term}), checkListAnnos(termFactory, m_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}