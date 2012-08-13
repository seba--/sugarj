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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_26, Strategy r_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail146:
    { 
      IStrategoTerm j_130 = null;
      IStrategoTerm h_130 = null;
      IStrategoTerm i_130 = null;
      IStrategoTerm k_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      h_130 = term.getSubterm(0);
      i_130 = term.getSubterm(1);
      IStrategoList annos122 = term.getAnnotations();
      j_130 = annos122;
      term = q_26.invoke(context, h_130);
      if(term == null)
        break Fail146;
      k_130 = term;
      term = r_26.invoke(context, i_130);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarDec_2, new IStrategoTerm[]{k_130, term}), checkListAnnos(termFactory, j_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}