package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Completions_2_0 extends Strategy 
{ 
  public static $Completions_2_0 instance = new $Completions_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_335, Strategy l_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Completions_2_0");
    Fail769:
    { 
      IStrategoTerm r_428 = null;
      IStrategoTerm p_428 = null;
      IStrategoTerm q_428 = null;
      IStrategoTerm s_428 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCompletions_2 != ((IStrategoAppl)term).getConstructor())
        break Fail769;
      p_428 = term.getSubterm(0);
      q_428 = term.getSubterm(1);
      IStrategoList annos35 = term.getAnnotations();
      r_428 = annos35;
      term = k_335.invoke(context, p_428);
      if(term == null)
        break Fail769;
      s_428 = term;
      term = l_335.invoke(context, q_428);
      if(term == null)
        break Fail769;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCompletions_2, new IStrategoTerm[]{s_428, term}), checkListAnnos(termFactory, r_428));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}