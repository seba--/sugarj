package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeDefault_1_0");
    Fail121:
    { 
      IStrategoTerm k_120 = null;
      IStrategoTerm j_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consScopeDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail121;
      j_120 = term.getSubterm(0);
      IStrategoList annos93 = term.getAnnotations();
      k_120 = annos93;
      term = f_22.invoke(context, j_120);
      if(term == null)
        break Fail121;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consScopeDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}