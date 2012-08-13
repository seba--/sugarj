package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec$Stm_1_0 extends Strategy 
{ 
  public static $Class$Dec$Stm_1_0 instance = new $Class$Dec$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecStm_1_0");
    Fail117:
    { 
      IStrategoTerm a_125 = null;
      IStrategoTerm x_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      x_124 = term.getSubterm(0);
      IStrategoList annos96 = term.getAnnotations();
      a_125 = annos96;
      term = u_24.invoke(context, x_124);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDecStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}