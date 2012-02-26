package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Exc$Or_2_0 extends Strategy 
{ 
  public static $Exc$Or_2_0 instance = new $Exc$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_22, Strategy o_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExcOr_2_0");
    Fail117:
    { 
      IStrategoTerm z_120 = null;
      IStrategoTerm x_120 = null;
      IStrategoTerm y_120 = null;
      IStrategoTerm a_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      x_120 = term.getSubterm(0);
      y_120 = term.getSubterm(1);
      IStrategoList annos99 = term.getAnnotations();
      z_120 = annos99;
      term = n_22.invoke(context, x_120);
      if(term == null)
        break Fail117;
      a_121 = term;
      term = o_22.invoke(context, y_120);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExcOr_2, new IStrategoTerm[]{a_121, term}), checkListAnnos(termFactory, z_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}