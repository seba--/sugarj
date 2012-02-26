package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Field_2_0 extends Strategy 
{ 
  public static $Q$Super$Field_2_0 instance = new $Q$Super$Field_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_15, Strategy l_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperField_2_0");
    Fail27:
    { 
      IStrategoTerm x_101 = null;
      IStrategoTerm v_101 = null;
      IStrategoTerm w_101 = null;
      IStrategoTerm y_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperField_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      v_101 = term.getSubterm(0);
      w_101 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      x_101 = annos15;
      term = k_15.invoke(context, v_101);
      if(term == null)
        break Fail27;
      y_101 = term;
      term = l_15.invoke(context, w_101);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperField_2, new IStrategoTerm[]{y_101, term}), checkListAnnos(termFactory, x_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}