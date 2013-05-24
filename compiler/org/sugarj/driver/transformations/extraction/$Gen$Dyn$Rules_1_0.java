package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gen$Dyn$Rules_1_0 extends Strategy 
{ 
  public static $Gen$Dyn$Rules_1_0 instance = new $Gen$Dyn$Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenDynRules_1_0");
    Fail856:
    { 
      IStrategoTerm r_439 = null;
      IStrategoTerm q_439 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consGenDynRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail856;
      q_439 = term.getSubterm(0);
      IStrategoList annos102 = term.getAnnotations();
      r_439 = annos102;
      term = u_339.invoke(context, q_439);
      if(term == null)
        break Fail856;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consGenDynRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_439));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}