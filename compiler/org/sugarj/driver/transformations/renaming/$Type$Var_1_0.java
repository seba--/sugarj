package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Var_1_0 extends Strategy 
{ 
  public static $Type$Var_1_0 instance = new $Type$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeVar_1_0");
    Fail153:
    { 
      IStrategoTerm c_128 = null;
      IStrategoTerm b_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail153;
      b_128 = term.getSubterm(0);
      IStrategoList annos134 = term.getAnnotations();
      c_128 = annos134;
      term = a_25.invoke(context, b_128);
      if(term == null)
        break Fail153;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}