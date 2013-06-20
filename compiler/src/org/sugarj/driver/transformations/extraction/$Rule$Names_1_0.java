package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule$Names_1_0 extends Strategy 
{ 
  public static $Rule$Names_1_0 instance = new $Rule$Names_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNames_1_0");
    Fail36:
    { 
      IStrategoTerm s_103 = null;
      IStrategoTerm r_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRuleNames_1 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      r_103 = term.getSubterm(0);
      IStrategoList annos9 = term.getAnnotations();
      s_103 = annos9;
      term = g_16.invoke(context, r_103);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRuleNames_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}