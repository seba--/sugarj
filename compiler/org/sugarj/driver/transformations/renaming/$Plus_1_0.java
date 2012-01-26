package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plus_1_0 extends Strategy 
{ 
  public static $Plus_1_0 instance = new $Plus_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Plus_1_0");
    Fail140:
    { 
      IStrategoTerm q_125 = null;
      IStrategoTerm p_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPlus_1 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      p_125 = term.getSubterm(0);
      IStrategoList annos125 = term.getAnnotations();
      q_125 = annos125;
      term = t_23.invoke(context, p_125);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPlus_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}