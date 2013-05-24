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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_347, Strategy l_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail971:
    { 
      IStrategoTerm f_459 = null;
      IStrategoTerm d_459 = null;
      IStrategoTerm e_459 = null;
      IStrategoTerm g_459 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail971;
      d_459 = term.getSubterm(0);
      e_459 = term.getSubterm(1);
      IStrategoList annos213 = term.getAnnotations();
      f_459 = annos213;
      term = k_347.invoke(context, d_459);
      if(term == null)
        break Fail971;
      g_459 = term;
      term = l_347.invoke(context, e_459);
      if(term == null)
        break Fail971;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consVarDec_2, new IStrategoTerm[]{g_459, term}), checkListAnnos(termFactory, f_459));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}