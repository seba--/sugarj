package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var_1_0 extends Strategy 
{ 
  public static $Var_1_0 instance = new $Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Var_1_0");
    Fail172:
    { 
      IStrategoTerm x_128 = null;
      IStrategoTerm w_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail172;
      w_128 = term.getSubterm(0);
      IStrategoList annos141 = term.getAnnotations();
      x_128 = annos141;
      term = b_25.invoke(context, w_128);
      if(term == null)
        break Fail172;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}