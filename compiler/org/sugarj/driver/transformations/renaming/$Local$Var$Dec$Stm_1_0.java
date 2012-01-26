package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Local$Var$Dec$Stm_1_0 extends Strategy 
{ 
  public static $Local$Var$Dec$Stm_1_0 instance = new $Local$Var$Dec$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LocalVarDecStm_1_0");
    Fail92:
    { 
      IStrategoTerm h_116 = null;
      IStrategoTerm g_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      g_116 = term.getSubterm(0);
      IStrategoList annos79 = term.getAnnotations();
      h_116 = annos79;
      term = n_20.invoke(context, g_116);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLocalVarDecStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}