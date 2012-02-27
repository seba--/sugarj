package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Init_1_0 extends Strategy 
{ 
  public static $Array$Init_1_0 instance = new $Array$Init_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayInit_1_0");
    Fail103:
    { 
      IStrategoTerm c_118 = null;
      IStrategoTerm b_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      b_118 = term.getSubterm(0);
      IStrategoList annos84 = term.getAnnotations();
      c_118 = annos84;
      term = t_21.invoke(context, b_118);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}