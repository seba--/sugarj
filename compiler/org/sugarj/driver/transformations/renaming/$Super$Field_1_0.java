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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperField_1_0");
    Fail76:
    { 
      IStrategoTerm l_114 = null;
      IStrategoTerm k_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperField_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76;
      k_114 = term.getSubterm(0);
      IStrategoList annos57 = term.getAnnotations();
      l_114 = annos57;
      term = x_20.invoke(context, k_114);
      if(term == null)
        break Fail76;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperField_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}