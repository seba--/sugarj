package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope$Default_1_0 extends Strategy 
{ 
  public static $Scope$Default_1_0 instance = new $Scope$Default_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeDefault_1_0");
    Fail330:
    { 
      IStrategoTerm q_190 = null;
      IStrategoTerm p_190 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScopeDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail330;
      p_190 = term.getSubterm(0);
      IStrategoList annos276 = term.getAnnotations();
      q_190 = annos276;
      term = i_46.invoke(context, p_190);
      if(term == null)
        break Fail330;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScopeDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_190));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}