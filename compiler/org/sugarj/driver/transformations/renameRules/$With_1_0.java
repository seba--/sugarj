package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("With_1_0");
    Fail86:
    { 
      IStrategoTerm o_105 = null;
      IStrategoTerm n_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWith_1 != ((IStrategoAppl)term).getConstructor())
        break Fail86;
      n_105 = term.getSubterm(0);
      IStrategoList annos79 = term.getAnnotations();
      o_105 = annos79;
      term = m_15.invoke(context, n_105);
      if(term == null)
        break Fail86;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWith_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}