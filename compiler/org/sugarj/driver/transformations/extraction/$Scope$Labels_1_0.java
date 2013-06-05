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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeLabels_1_0");
    Fail52:
    { 
      IStrategoTerm v_106 = null;
      IStrategoTerm u_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consScopeLabels_1 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      u_106 = term.getSubterm(0);
      IStrategoList annos25 = term.getAnnotations();
      v_106 = annos25;
      term = k_17.invoke(context, u_106);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consScopeLabels_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}