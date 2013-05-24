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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeDefault_1_0");
    Fail894:
    { 
      IStrategoTerm h_447 = null;
      IStrategoTerm g_447 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consScopeDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail894;
      g_447 = term.getSubterm(0);
      IStrategoList annos140 = term.getAnnotations();
      h_447 = annos140;
      term = w_342.invoke(context, g_447);
      if(term == null)
        break Fail894;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consScopeDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_447));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}