package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Where_1_0 extends Strategy 
{ 
  public static $Where_1_0 instance = new $Where_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Where_1_0");
    Fail91:
    { 
      IStrategoTerm r_105 = null;
      IStrategoTerm p_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWhere_1 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      p_105 = term.getSubterm(0);
      IStrategoList annos80 = term.getAnnotations();
      r_105 = annos80;
      term = m_15.invoke(context, p_105);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWhere_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}