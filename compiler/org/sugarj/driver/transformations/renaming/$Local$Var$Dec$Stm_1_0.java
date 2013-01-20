package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Local$Var$Dec$Stm_1_0 extends Strategy 
{ 
  public static $Local$Var$Dec$Stm_1_0 instance = new $Local$Var$Dec$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LocalVarDecStm_1_0");
    Fail133:
    { 
      IStrategoTerm r_154 = null;
      IStrategoTerm n_154 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail133;
      n_154 = term.getSubterm(0);
      IStrategoList annos105 = term.getAnnotations();
      r_154 = annos105;
      term = v_34.invoke(context, n_154);
      if(term == null)
        break Fail133;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLocalVarDecStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_154));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}