package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Checks$Dec_2_0 extends Strategy 
{ 
  public static $Checks$Dec_2_0 instance = new $Checks$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_19, Strategy i_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ChecksDec_2_0");
    Fail52:
    { 
      IStrategoTerm y_109 = null;
      IStrategoTerm w_109 = null;
      IStrategoTerm x_109 = null;
      IStrategoTerm z_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChecksDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      w_109 = term.getSubterm(0);
      x_109 = term.getSubterm(1);
      IStrategoList annos34 = term.getAnnotations();
      y_109 = annos34;
      term = h_19.invoke(context, w_109);
      if(term == null)
        break Fail52;
      z_109 = term;
      term = i_19.invoke(context, x_109);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChecksDec_2, new IStrategoTerm[]{z_109, term}), checkListAnnos(termFactory, y_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}