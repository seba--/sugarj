package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVarDec_1_0");
    Fail287:
    { 
      IStrategoTerm g_182 = null;
      IStrategoTerm f_182 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDefaultVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail287;
      f_182 = term.getSubterm(0);
      IStrategoList annos234 = term.getAnnotations();
      g_182 = annos234;
      term = d_43.invoke(context, f_182);
      if(term == null)
        break Fail287;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDefaultVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_182));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}