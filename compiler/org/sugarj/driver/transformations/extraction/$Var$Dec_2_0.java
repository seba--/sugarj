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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_18, Strategy x_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail76:
    { 
      IStrategoTerm h_111 = null;
      IStrategoTerm f_111 = null;
      IStrategoTerm g_111 = null;
      IStrategoTerm i_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail76;
      f_111 = term.getSubterm(0);
      g_111 = term.getSubterm(1);
      IStrategoList annos49 = term.getAnnotations();
      h_111 = annos49;
      term = w_18.invoke(context, f_111);
      if(term == null)
        break Fail76;
      i_111 = term;
      term = x_18.invoke(context, g_111);
      if(term == null)
        break Fail76;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consVarDec_2, new IStrategoTerm[]{i_111, term}), checkListAnnos(termFactory, h_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}