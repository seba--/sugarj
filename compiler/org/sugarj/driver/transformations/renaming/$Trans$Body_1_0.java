package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Trans$Body_1_0 extends Strategy 
{ 
  public static $Trans$Body_1_0 instance = new $Trans$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransBody_1_0");
    Fail46:
    { 
      IStrategoTerm b_128 = null;
      IStrategoTerm a_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTransBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      a_128 = term.getSubterm(0);
      IStrategoList annos23 = term.getAnnotations();
      b_128 = annos23;
      term = y_27.invoke(context, a_128);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTransBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}