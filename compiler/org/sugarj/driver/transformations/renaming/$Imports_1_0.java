package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Imports_1_0");
    Fail283:
    { 
      IStrategoTerm s_181 = null;
      IStrategoTerm r_181 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail283;
      r_181 = term.getSubterm(0);
      IStrategoList annos230 = term.getAnnotations();
      s_181 = annos230;
      term = y_42.invoke(context, r_181);
      if(term == null)
        break Fail283;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_181));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}