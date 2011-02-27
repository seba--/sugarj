package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import$Wildcard_1_0 extends Strategy 
{ 
  public static $Import$Wildcard_1_0 instance = new $Import$Wildcard_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportWildcard_1_0");
    Fail53:
    { 
      IStrategoTerm m_109 = null;
      IStrategoTerm l_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consImportWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      l_109 = term.getSubterm(0);
      IStrategoList annos30 = term.getAnnotations();
      m_109 = annos30;
      term = l_18.invoke(context, l_109);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consImportWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}