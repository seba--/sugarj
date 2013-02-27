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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Imports_1_0");
    Fail46:
    { 
      IStrategoTerm q_96 = null;
      IStrategoTerm p_96 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      p_96 = term.getSubterm(0);
      IStrategoList annos36 = term.getAnnotations();
      q_96 = annos36;
      term = f_12.invoke(context, p_96);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_96));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}