package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_9, Strategy y_9)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDec_2_0");
    Fail12:
    { 
      IStrategoTerm i_89 = null;
      IStrategoTerm f_89 = null;
      IStrategoTerm g_89 = null;
      IStrategoTerm j_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail12;
      f_89 = term.getSubterm(0);
      g_89 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      i_89 = annos2;
      term = x_9.invoke(context, f_89);
      if(term == null)
        break Fail12;
      j_89 = term;
      term = y_9.invoke(context, g_89);
      if(term == null)
        break Fail12;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDec_2, new IStrategoTerm[]{j_89, term}), checkListAnnos(termFactory, i_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}