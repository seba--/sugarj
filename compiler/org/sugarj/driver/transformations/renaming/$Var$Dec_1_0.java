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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_1_0");
    Fail101:
    { 
      IStrategoTerm s_117 = null;
      IStrategoTerm r_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      r_117 = term.getSubterm(0);
      IStrategoList annos82 = term.getAnnotations();
      s_117 = annos82;
      term = p_21.invoke(context, r_117);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}