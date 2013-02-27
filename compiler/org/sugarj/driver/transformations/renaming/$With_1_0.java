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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("With_1_0");
    Fail90:
    { 
      IStrategoTerm n_105 = null;
      IStrategoTerm m_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWith_1 != ((IStrategoAppl)term).getConstructor())
        break Fail90;
      m_105 = term.getSubterm(0);
      IStrategoList annos79 = term.getAnnotations();
      n_105 = annos79;
      term = l_15.invoke(context, m_105);
      if(term == null)
        break Fail90;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWith_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}