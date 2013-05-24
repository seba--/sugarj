package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Imports_1_0 extends Strategy 
{ 
  public static $Imports_1_0 instance = new $Imports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Imports_1_0");
    Fail848:
    { 
      IStrategoTerm m_438 = null;
      IStrategoTerm l_438 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consImports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail848;
      l_438 = term.getSubterm(0);
      IStrategoList annos95 = term.getAnnotations();
      m_438 = annos95;
      term = i_339.invoke(context, l_438);
      if(term == null)
        break Fail848;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consImports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_438));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}