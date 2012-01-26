package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Unbound$Wld_1_0 extends Strategy 
{ 
  public static $Unbound$Wld_1_0 instance = new $Unbound$Wld_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UnboundWld_1_0");
    Fail28:
    { 
      IStrategoTerm w_101 = null;
      IStrategoTerm v_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consUnboundWld_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      v_101 = term.getSubterm(0);
      IStrategoList annos19 = term.getAnnotations();
      w_101 = annos19;
      term = b_15.invoke(context, v_101);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consUnboundWld_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}