package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("With_1_0");
    Fail90:
    { 
      IStrategoTerm r_105 = null;
      IStrategoTerm p_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWith_1 != ((IStrategoAppl)term).getConstructor())
        break Fail90;
      p_105 = term.getSubterm(0);
      IStrategoList annos79 = term.getAnnotations();
      r_105 = annos79;
      term = o_15.invoke(context, p_105);
      if(term == null)
        break Fail90;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWith_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}