package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope$Labels_1_0 extends Strategy 
{ 
  public static $Scope$Labels_1_0 instance = new $Scope$Labels_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeLabels_1_0");
    Fail41:
    { 
      IStrategoTerm s_106 = null;
      IStrategoTerm r_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consScopeLabels_1 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      r_106 = term.getSubterm(0);
      IStrategoList annos17 = term.getAnnotations();
      s_106 = annos17;
      term = l_17.invoke(context, r_106);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consScopeLabels_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}