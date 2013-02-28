package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Test_1_0 extends Strategy 
{ 
  public static $Test_1_0 instance = new $Test_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Test_1_0");
    Fail89:
    { 
      IStrategoTerm n_105 = null;
      IStrategoTerm m_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTest_1 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      m_105 = term.getSubterm(0);
      IStrategoList annos78 = term.getAnnotations();
      n_105 = annos78;
      term = n_15.invoke(context, m_105);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTest_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}