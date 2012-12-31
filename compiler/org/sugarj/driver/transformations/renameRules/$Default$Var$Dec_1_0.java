package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVarDec_1_0");
    Fail46:
    { 
      IStrategoTerm h_97 = null;
      IStrategoTerm g_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDefaultVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      g_97 = term.getSubterm(0);
      IStrategoList annos40 = term.getAnnotations();
      h_97 = annos40;
      term = l_12.invoke(context, g_97);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDefaultVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}