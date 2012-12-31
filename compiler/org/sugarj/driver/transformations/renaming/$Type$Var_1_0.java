package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Var_1_0 extends Strategy 
{ 
  public static $Type$Var_1_0 instance = new $Type$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeVar_1_0");
    Fail191:
    { 
      IStrategoTerm s_168 = null;
      IStrategoTerm r_168 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail191;
      r_168 = term.getSubterm(0);
      IStrategoList annos160 = term.getAnnotations();
      s_168 = annos160;
      term = t_38.invoke(context, r_168);
      if(term == null)
        break Fail191;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_168));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}