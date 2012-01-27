package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Field_1_0 extends Strategy 
{ 
  public static $Super$Field_1_0 instance = new $Super$Field_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperField_1_0");
    Fail25:
    { 
      IStrategoTerm j_101 = null;
      IStrategoTerm i_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperField_1 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      i_101 = term.getSubterm(0);
      IStrategoList annos16 = term.getAnnotations();
      j_101 = annos16;
      term = x_14.invoke(context, i_101);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperField_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}