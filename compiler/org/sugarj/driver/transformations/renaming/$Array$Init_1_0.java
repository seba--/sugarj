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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayInit_1_0");
    Fail139:
    { 
      IStrategoTerm y_155 = null;
      IStrategoTerm x_155 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consArrayInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail139;
      x_155 = term.getSubterm(0);
      IStrategoList annos110 = term.getAnnotations();
      y_155 = annos110;
      term = e_35.invoke(context, x_155);
      if(term == null)
        break Fail139;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consArrayInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_155));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}