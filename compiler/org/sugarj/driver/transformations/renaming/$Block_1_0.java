package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Block_1_0 extends Strategy 
{ 
  public static $Block_1_0 instance = new $Block_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Block_1_0");
    Fail108:
    { 
      IStrategoTerm n_148 = null;
      IStrategoTerm m_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBlock_1 != ((IStrategoAppl)term).getConstructor())
        break Fail108;
      m_148 = term.getSubterm(0);
      IStrategoList annos82 = term.getAnnotations();
      n_148 = annos82;
      term = d_33.invoke(context, m_148);
      if(term == null)
        break Fail108;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBlock_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}