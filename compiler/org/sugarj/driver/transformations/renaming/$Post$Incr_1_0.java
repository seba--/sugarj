package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Post$Incr_1_0 extends Strategy 
{ 
  public static $Post$Incr_1_0 instance = new $Post$Incr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostIncr_1_0");
    Fail145:
    { 
      IStrategoTerm m_126 = null;
      IStrategoTerm l_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail145;
      l_126 = term.getSubterm(0);
      IStrategoList annos127 = term.getAnnotations();
      m_126 = annos127;
      term = k_24.invoke(context, l_126);
      if(term == null)
        break Fail145;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPostIncr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}