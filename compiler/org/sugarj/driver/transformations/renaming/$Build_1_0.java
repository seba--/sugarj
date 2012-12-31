package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Build_1_0 extends Strategy 
{ 
  public static $Build_1_0 instance = new $Build_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Build_1_0");
    Fail339:
    { 
      IStrategoTerm m_192 = null;
      IStrategoTerm l_192 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBuild_1 != ((IStrategoAppl)term).getConstructor())
        break Fail339;
      l_192 = term.getSubterm(0);
      IStrategoList annos285 = term.getAnnotations();
      m_192 = annos285;
      term = y_46.invoke(context, l_192);
      if(term == null)
        break Fail339;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBuild_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_192));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}