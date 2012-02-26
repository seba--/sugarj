package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Dec_1_0 extends Strategy 
{ 
  public static $Var$Dec_1_0 instance = new $Var$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_1_0");
    Fail99:
    { 
      IStrategoTerm k_117 = null;
      IStrategoTerm j_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      j_117 = term.getSubterm(0);
      IStrategoList annos82 = term.getAnnotations();
      k_117 = annos82;
      term = h_21.invoke(context, j_117);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}