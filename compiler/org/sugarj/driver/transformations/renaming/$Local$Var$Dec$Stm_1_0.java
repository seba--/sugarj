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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LocalVarDecStm_1_0");
    Fail97:
    { 
      IStrategoTerm f_117 = null;
      IStrategoTerm e_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      e_117 = term.getSubterm(0);
      IStrategoList annos79 = term.getAnnotations();
      f_117 = annos79;
      term = k_21.invoke(context, e_117);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLocalVarDecStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}