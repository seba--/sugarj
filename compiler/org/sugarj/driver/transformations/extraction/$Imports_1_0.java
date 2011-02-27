package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Imports_1_0 extends Strategy 
{ 
  public static $Imports_1_0 instance = new $Imports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Imports_1_0");
    Fail59:
    { 
      IStrategoTerm g_110 = null;
      IStrategoTerm f_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consImports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      f_110 = term.getSubterm(0);
      IStrategoList annos36 = term.getAnnotations();
      g_110 = annos36;
      term = r_18.invoke(context, f_110);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consImports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}