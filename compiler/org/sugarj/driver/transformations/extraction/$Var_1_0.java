package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var_1_0 extends Strategy 
{ 
  public static $Var_1_0 instance = new $Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Var_1_0");
    Fail160:
    { 
      IStrategoTerm u_128 = null;
      IStrategoTerm t_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail160;
      t_128 = term.getSubterm(0);
      IStrategoList annos133 = term.getAnnotations();
      u_128 = annos133;
      term = c_25.invoke(context, t_128);
      if(term == null)
        break Fail160;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}