package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope_2_0 extends Strategy 
{ 
  public static $Scope_2_0 instance = new $Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_16, Strategy m_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_2_0");
    Fail104:
    { 
      IStrategoTerm h_108 = null;
      IStrategoTerm f_108 = null;
      IStrategoTerm g_108 = null;
      IStrategoTerm i_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      f_108 = term.getSubterm(0);
      g_108 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      h_108 = annos93;
      term = l_16.invoke(context, f_108);
      if(term == null)
        break Fail104;
      i_108 = term;
      term = m_16.invoke(context, g_108);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScope_2, new IStrategoTerm[]{i_108, term}), checkListAnnos(termFactory, h_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}