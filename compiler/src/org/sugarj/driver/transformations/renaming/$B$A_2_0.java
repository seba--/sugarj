package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_15, Strategy z_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BA_2_0");
    Fail94:
    { 
      IStrategoTerm p_106 = null;
      IStrategoTerm n_106 = null;
      IStrategoTerm o_106 = null;
      IStrategoTerm q_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBA_2 != ((IStrategoAppl)term).getConstructor())
        break Fail94;
      n_106 = term.getSubterm(0);
      o_106 = term.getSubterm(1);
      IStrategoList annos84 = term.getAnnotations();
      p_106 = annos84;
      term = y_15.invoke(context, n_106);
      if(term == null)
        break Fail94;
      q_106 = term;
      term = z_15.invoke(context, o_106);
      if(term == null)
        break Fail94;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBA_2, new IStrategoTerm[]{q_106, term}), checkListAnnos(termFactory, p_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}