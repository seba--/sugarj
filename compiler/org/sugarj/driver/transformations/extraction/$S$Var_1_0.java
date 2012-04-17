package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Var_1_0 extends Strategy 
{ 
  public static $S$Var_1_0 instance = new $S$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SVar_1_0");
    Fail126:
    { 
      IStrategoTerm e_123 = null;
      IStrategoTerm d_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      d_123 = term.getSubterm(0);
      IStrategoList annos99 = term.getAnnotations();
      e_123 = annos99;
      term = g_23.invoke(context, d_123);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}