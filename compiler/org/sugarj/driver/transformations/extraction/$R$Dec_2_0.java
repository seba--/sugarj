package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec_2_0 extends Strategy 
{ 
  public static $R$Dec_2_0 instance = new $R$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_16, Strategy k_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDec_2_0");
    Fail25:
    { 
      IStrategoTerm v_103 = null;
      IStrategoTerm t_103 = null;
      IStrategoTerm u_103 = null;
      IStrategoTerm w_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      t_103 = term.getSubterm(0);
      u_103 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      v_103 = annos2;
      term = j_16.invoke(context, t_103);
      if(term == null)
        break Fail25;
      w_103 = term;
      term = k_16.invoke(context, u_103);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRDec_2, new IStrategoTerm[]{w_103, term}), checkListAnnos(termFactory, v_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}