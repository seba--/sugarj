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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SVar_1_0");
    Fail137:
    { 
      IStrategoTerm h_123 = null;
      IStrategoTerm g_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail137;
      g_123 = term.getSubterm(0);
      IStrategoList annos107 = term.getAnnotations();
      h_123 = annos107;
      term = f_23.invoke(context, g_123);
      if(term == null)
        break Fail137;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}