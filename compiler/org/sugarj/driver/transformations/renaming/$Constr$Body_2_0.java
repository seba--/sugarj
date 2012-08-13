package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Body_2_0 extends Strategy 
{ 
  public static $Constr$Body_2_0 instance = new $Constr$Body_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_23, Strategy o_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrBody_2_0");
    Fail104:
    { 
      IStrategoTerm n_121 = null;
      IStrategoTerm j_121 = null;
      IStrategoTerm m_121 = null;
      IStrategoTerm o_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrBody_2 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      j_121 = term.getSubterm(0);
      m_121 = term.getSubterm(1);
      IStrategoList annos85 = term.getAnnotations();
      n_121 = annos85;
      term = n_23.invoke(context, j_121);
      if(term == null)
        break Fail104;
      o_121 = term;
      term = o_23.invoke(context, m_121);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrBody_2, new IStrategoTerm[]{o_121, term}), checkListAnnos(termFactory, n_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}