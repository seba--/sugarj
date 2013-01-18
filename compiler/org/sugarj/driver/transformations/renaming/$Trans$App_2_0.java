package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Trans$App_2_0 extends Strategy 
{ 
  public static $Trans$App_2_0 instance = new $Trans$App_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_26, Strategy l_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransApp_2_0");
    Fail24:
    { 
      IStrategoTerm q_123 = null;
      IStrategoTerm o_123 = null;
      IStrategoTerm p_123 = null;
      IStrategoTerm r_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTransApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      o_123 = term.getSubterm(0);
      p_123 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      q_123 = annos1;
      term = k_26.invoke(context, o_123);
      if(term == null)
        break Fail24;
      r_123 = term;
      term = l_26.invoke(context, p_123);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTransApp_2, new IStrategoTerm[]{r_123, term}), checkListAnnos(termFactory, q_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}