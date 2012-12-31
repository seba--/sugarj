package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lazy$And_2_0 extends Strategy 
{ 
  public static $Lazy$And_2_0 instance = new $Lazy$And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_36, Strategy n_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyAnd_2_0");
    Fail158:
    { 
      IStrategoTerm l_160 = null;
      IStrategoTerm j_160 = null;
      IStrategoTerm k_160 = null;
      IStrategoTerm m_160 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail158;
      j_160 = term.getSubterm(0);
      k_160 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      l_160 = annos128;
      term = m_36.invoke(context, j_160);
      if(term == null)
        break Fail158;
      m_160 = term;
      term = n_36.invoke(context, k_160);
      if(term == null)
        break Fail158;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLazyAnd_2, new IStrategoTerm[]{m_160, term}), checkListAnnos(termFactory, l_160));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}