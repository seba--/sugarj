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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeVar_1_0");
    Fail201:
    { 
      IStrategoTerm u_146 = null;
      IStrategoTerm t_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail201;
      t_146 = term.getSubterm(0);
      IStrategoList annos175 = term.getAnnotations();
      u_146 = annos175;
      term = l_30.invoke(context, t_146);
      if(term == null)
        break Fail201;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}