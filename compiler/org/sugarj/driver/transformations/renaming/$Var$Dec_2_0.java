package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_20, Strategy r_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail95:
    { 
      IStrategoTerm q_116 = null;
      IStrategoTerm o_116 = null;
      IStrategoTerm p_116 = null;
      IStrategoTerm r_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail95;
      o_116 = term.getSubterm(0);
      p_116 = term.getSubterm(1);
      IStrategoList annos81 = term.getAnnotations();
      q_116 = annos81;
      term = q_20.invoke(context, o_116);
      if(term == null)
        break Fail95;
      r_116 = term;
      term = r_20.invoke(context, p_116);
      if(term == null)
        break Fail95;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarDec_2, new IStrategoTerm[]{r_116, term}), checkListAnnos(termFactory, q_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}