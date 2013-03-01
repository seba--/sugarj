package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeLabels_1_0");
    Fail264:
    { 
      IStrategoTerm z_177 = null;
      IStrategoTerm y_177 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScopeLabels_1 != ((IStrategoAppl)term).getConstructor())
        break Fail264;
      y_177 = term.getSubterm(0);
      IStrategoList annos211 = term.getAnnotations();
      z_177 = annos211;
      term = s_41.invoke(context, y_177);
      if(term == null)
        break Fail264;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScopeLabels_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_177));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}