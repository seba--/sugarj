package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$Var_1_0 extends Strategy 
{ 
  public static $Sort$Var_1_0 instance = new $Sort$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortVar_1_0");
    Fail151:
    { 
      IStrategoTerm w_125 = null;
      IStrategoTerm v_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSortVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      v_125 = term.getSubterm(0);
      IStrategoList annos121 = term.getAnnotations();
      w_125 = annos121;
      term = a_24.invoke(context, v_125);
      if(term == null)
        break Fail151;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSortVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}