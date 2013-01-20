package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Var_1_0 extends Strategy 
{ 
  public static $S$Var_1_0 instance = new $S$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SVar_1_0");
    Fail346:
    { 
      IStrategoTerm w_193 = null;
      IStrategoTerm v_193 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail346;
      v_193 = term.getSubterm(0);
      IStrategoList annos290 = term.getAnnotations();
      w_193 = annos290;
      term = i_47.invoke(context, v_193);
      if(term == null)
        break Fail346;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_193));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}