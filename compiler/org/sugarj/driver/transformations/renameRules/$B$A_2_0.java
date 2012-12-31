package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $B$A_2_0 extends Strategy 
{ 
  public static $B$A_2_0 instance = new $B$A_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_15, Strategy u_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BA_2_0");
    Fail91:
    { 
      IStrategoTerm k_106 = null;
      IStrategoTerm i_106 = null;
      IStrategoTerm j_106 = null;
      IStrategoTerm l_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBA_2 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      i_106 = term.getSubterm(0);
      j_106 = term.getSubterm(1);
      IStrategoList annos84 = term.getAnnotations();
      k_106 = annos84;
      term = t_15.invoke(context, i_106);
      if(term == null)
        break Fail91;
      l_106 = term;
      term = u_15.invoke(context, j_106);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBA_2, new IStrategoTerm[]{l_106, term}), checkListAnnos(termFactory, k_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}