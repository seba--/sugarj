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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeLabels_1_0");
    Fail855:
    { 
      IStrategoTerm o_439 = null;
      IStrategoTerm n_439 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consScopeLabels_1 != ((IStrategoAppl)term).getConstructor())
        break Fail855;
      n_439 = term.getSubterm(0);
      IStrategoList annos101 = term.getAnnotations();
      o_439 = annos101;
      term = t_339.invoke(context, n_439);
      if(term == null)
        break Fail855;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consScopeLabels_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_439));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}