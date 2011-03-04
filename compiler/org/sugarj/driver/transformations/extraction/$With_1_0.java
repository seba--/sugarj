package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $With_1_0 extends Strategy 
{ 
  public static $With_1_0 instance = new $With_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("With_1_0");
    Fail104:
    { 
      IStrategoTerm a_119 = null;
      IStrategoTerm z_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consWith_1 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      z_118 = term.getSubterm(0);
      IStrategoList annos79 = term.getAnnotations();
      a_119 = annos79;
      term = x_21.invoke(context, z_118);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consWith_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}