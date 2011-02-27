package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Default$Var$Dec_1_0 extends Strategy 
{ 
  public static $Default$Var$Dec_1_0 instance = new $Default$Var$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVarDec_1_0");
    Fail63:
    { 
      IStrategoTerm u_110 = null;
      IStrategoTerm t_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDefaultVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      t_110 = term.getSubterm(0);
      IStrategoList annos40 = term.getAnnotations();
      u_110 = annos40;
      term = w_18.invoke(context, t_110);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDefaultVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}