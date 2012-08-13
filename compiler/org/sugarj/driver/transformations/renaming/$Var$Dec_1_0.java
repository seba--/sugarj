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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_1_0");
    Fail147:
    { 
      IStrategoTerm q_130 = null;
      IStrategoTerm o_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail147;
      o_130 = term.getSubterm(0);
      IStrategoList annos123 = term.getAnnotations();
      q_130 = annos123;
      term = s_26.invoke(context, o_130);
      if(term == null)
        break Fail147;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}