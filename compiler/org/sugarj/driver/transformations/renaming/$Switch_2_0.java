package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch_2_0 extends Strategy 
{ 
  public static $Switch_2_0 instance = new $Switch_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_20, Strategy n_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Switch_2_0");
    Fail86:
    { 
      IStrategoTerm j_115 = null;
      IStrategoTerm h_115 = null;
      IStrategoTerm i_115 = null;
      IStrategoTerm k_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail86;
      h_115 = term.getSubterm(0);
      i_115 = term.getSubterm(1);
      IStrategoList annos71 = term.getAnnotations();
      j_115 = annos71;
      term = m_20.invoke(context, h_115);
      if(term == null)
        break Fail86;
      k_115 = term;
      term = n_20.invoke(context, i_115);
      if(term == null)
        break Fail86;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitch_2, new IStrategoTerm[]{k_115, term}), checkListAnnos(termFactory, j_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}