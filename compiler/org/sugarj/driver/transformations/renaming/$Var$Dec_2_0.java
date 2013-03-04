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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_34, Strategy z_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail136:
    { 
      IStrategoTerm h_155 = null;
      IStrategoTerm f_155 = null;
      IStrategoTerm g_155 = null;
      IStrategoTerm k_155 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      f_155 = term.getSubterm(0);
      g_155 = term.getSubterm(1);
      IStrategoList annos107 = term.getAnnotations();
      h_155 = annos107;
      term = y_34.invoke(context, f_155);
      if(term == null)
        break Fail136;
      k_155 = term;
      term = z_34.invoke(context, g_155);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVarDec_2, new IStrategoTerm[]{k_155, term}), checkListAnnos(termFactory, h_155));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}