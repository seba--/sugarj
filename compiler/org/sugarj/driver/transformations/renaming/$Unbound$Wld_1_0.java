package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Unbound$Wld_1_0 extends Strategy 
{ 
  public static $Unbound$Wld_1_0 instance = new $Unbound$Wld_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UnboundWld_1_0");
    Fail31:
    { 
      IStrategoTerm m_102 = null;
      IStrategoTerm l_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consUnboundWld_1 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      l_102 = term.getSubterm(0);
      IStrategoList annos19 = term.getAnnotations();
      m_102 = annos19;
      term = q_15.invoke(context, l_102);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consUnboundWld_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}