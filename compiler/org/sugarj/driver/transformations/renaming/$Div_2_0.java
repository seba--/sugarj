package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Div_2_0 extends Strategy 
{ 
  public static $Div_2_0 instance = new $Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_24, Strategy c_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Div_2_0");
    Fail135:
    { 
      IStrategoTerm a_125 = null;
      IStrategoTerm w_124 = null;
      IStrategoTerm x_124 = null;
      IStrategoTerm b_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      w_124 = term.getSubterm(0);
      x_124 = term.getSubterm(1);
      IStrategoList annos115 = term.getAnnotations();
      a_125 = annos115;
      term = b_24.invoke(context, w_124);
      if(term == null)
        break Fail135;
      b_125 = term;
      term = c_24.invoke(context, x_124);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDiv_2, new IStrategoTerm[]{b_125, term}), checkListAnnos(termFactory, a_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}