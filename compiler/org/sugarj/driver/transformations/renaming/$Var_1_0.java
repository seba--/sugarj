package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_49)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Var_1_0");
    Fail380:
    { 
      IStrategoTerm d_199 = null;
      IStrategoTerm c_199 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail380;
      c_199 = term.getSubterm(0);
      IStrategoList annos323 = term.getAnnotations();
      d_199 = annos323;
      term = d_49.invoke(context, c_199);
      if(term == null)
        break Fail380;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_199));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}