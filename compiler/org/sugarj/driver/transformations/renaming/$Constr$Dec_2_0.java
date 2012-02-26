package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Dec_2_0 extends Strategy 
{ 
  public static $Constr$Dec_2_0 instance = new $Constr$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_18, Strategy k_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDec_2_0");
    Fail58:
    { 
      IStrategoTerm m_109 = null;
      IStrategoTerm j_109 = null;
      IStrategoTerm l_109 = null;
      IStrategoTerm n_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      j_109 = term.getSubterm(0);
      l_109 = term.getSubterm(1);
      IStrategoList annos46 = term.getAnnotations();
      m_109 = annos46;
      term = j_18.invoke(context, j_109);
      if(term == null)
        break Fail58;
      n_109 = term;
      term = k_18.invoke(context, l_109);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrDec_2, new IStrategoTerm[]{n_109, term}), checkListAnnos(termFactory, m_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}