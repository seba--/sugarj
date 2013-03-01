package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $As_2_0 extends Strategy 
{ 
  public static $As_2_0 instance = new $As_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_48, Strategy o_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("As_2_0");
    Fail369:
    { 
      IStrategoTerm l_197 = null;
      IStrategoTerm g_197 = null;
      IStrategoTerm k_197 = null;
      IStrategoTerm m_197 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail369;
      g_197 = term.getSubterm(0);
      k_197 = term.getSubterm(1);
      IStrategoList annos312 = term.getAnnotations();
      l_197 = annos312;
      term = n_48.invoke(context, g_197);
      if(term == null)
        break Fail369;
      m_197 = term;
      term = o_48.invoke(context, k_197);
      if(term == null)
        break Fail369;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAs_2, new IStrategoTerm[]{m_197, term}), checkListAnnos(termFactory, l_197));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}