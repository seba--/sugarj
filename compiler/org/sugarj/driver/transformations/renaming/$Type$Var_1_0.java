package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Var_1_0 extends Strategy 
{ 
  public static $Type$Var_1_0 instance = new $Type$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeVar_1_0");
    Fail150:
    { 
      IStrategoTerm m_127 = null;
      IStrategoTerm l_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail150;
      l_127 = term.getSubterm(0);
      IStrategoList annos134 = term.getAnnotations();
      m_127 = annos134;
      term = l_24.invoke(context, l_127);
      if(term == null)
        break Fail150;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}