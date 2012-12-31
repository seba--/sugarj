package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_9, Strategy z_9)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDec_2_0");
    Fail8:
    { 
      IStrategoTerm j_89 = null;
      IStrategoTerm g_89 = null;
      IStrategoTerm i_89 = null;
      IStrategoTerm k_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail8;
      g_89 = term.getSubterm(0);
      i_89 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      j_89 = annos2;
      term = y_9.invoke(context, g_89);
      if(term == null)
        break Fail8;
      k_89 = term;
      term = z_9.invoke(context, i_89);
      if(term == null)
        break Fail8;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDec_2, new IStrategoTerm[]{k_89, term}), checkListAnnos(termFactory, j_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}