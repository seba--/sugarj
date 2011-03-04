package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Dec_2_0 extends Strategy 
{ 
  public static $Var$Dec_2_0 instance = new $Var$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_18, Strategy y_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail65:
    { 
      IStrategoTerm e_111 = null;
      IStrategoTerm b_111 = null;
      IStrategoTerm d_111 = null;
      IStrategoTerm f_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      b_111 = term.getSubterm(0);
      d_111 = term.getSubterm(1);
      IStrategoList annos41 = term.getAnnotations();
      e_111 = annos41;
      term = x_18.invoke(context, b_111);
      if(term == null)
        break Fail65;
      f_111 = term;
      term = y_18.invoke(context, d_111);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consVarDec_2, new IStrategoTerm[]{f_111, term}), checkListAnnos(termFactory, e_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}