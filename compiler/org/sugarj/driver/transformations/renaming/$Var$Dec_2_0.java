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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_21, Strategy g_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail98:
    { 
      IStrategoTerm g_117 = null;
      IStrategoTerm e_117 = null;
      IStrategoTerm f_117 = null;
      IStrategoTerm h_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail98;
      e_117 = term.getSubterm(0);
      f_117 = term.getSubterm(1);
      IStrategoList annos81 = term.getAnnotations();
      g_117 = annos81;
      term = f_21.invoke(context, e_117);
      if(term == null)
        break Fail98;
      h_117 = term;
      term = g_21.invoke(context, f_117);
      if(term == null)
        break Fail98;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarDec_2, new IStrategoTerm[]{h_117, term}), checkListAnnos(termFactory, g_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}