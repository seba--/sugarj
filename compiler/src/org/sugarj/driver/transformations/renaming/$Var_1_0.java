package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var_1_0 extends Strategy 
{ 
  public static $Var_1_0 instance = new $Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Var_1_0");
    Fail146:
    { 
      IStrategoTerm g_115 = null;
      IStrategoTerm f_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      f_115 = term.getSubterm(0);
      IStrategoList annos133 = term.getAnnotations();
      g_115 = annos133;
      term = w_18.invoke(context, f_115);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}