package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt$Eq_2_0 extends Strategy 
{ 
  public static $Gt$Eq_2_0 instance = new $Gt$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_22, Strategy l_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GtEq_2_0");
    Fail120:
    { 
      IStrategoTerm p_121 = null;
      IStrategoTerm n_121 = null;
      IStrategoTerm o_121 = null;
      IStrategoTerm q_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGtEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail120;
      n_121 = term.getSubterm(0);
      o_121 = term.getSubterm(1);
      IStrategoList annos105 = term.getAnnotations();
      p_121 = annos105;
      term = k_22.invoke(context, n_121);
      if(term == null)
        break Fail120;
      q_121 = term;
      term = l_22.invoke(context, o_121);
      if(term == null)
        break Fail120;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGtEq_2, new IStrategoTerm[]{q_121, term}), checkListAnnos(termFactory, p_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}