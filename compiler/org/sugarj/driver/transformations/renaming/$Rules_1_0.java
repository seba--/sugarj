package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rules_1_0 extends Strategy 
{ 
  public static $Rules_1_0 instance = new $Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rules_1_0");
    Fail30:
    { 
      IStrategoTerm u_106 = null;
      IStrategoTerm t_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      t_106 = term.getSubterm(0);
      IStrategoList annos12 = term.getAnnotations();
      u_106 = annos12;
      term = i_18.invoke(context, t_106);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}