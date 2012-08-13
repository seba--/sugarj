package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Dec_1_0 extends Strategy 
{ 
  public static $Super$Dec_1_0 instance = new $Super$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperDec_1_0");
    Fail82:
    { 
      IStrategoTerm p_115 = null;
      IStrategoTerm n_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      n_115 = term.getSubterm(0);
      IStrategoList annos63 = term.getAnnotations();
      p_115 = annos63;
      term = g_21.invoke(context, n_115);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}