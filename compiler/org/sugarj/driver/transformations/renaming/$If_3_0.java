package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If_3_0 extends Strategy 
{ 
  public static $If_3_0 instance = new $If_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_34, Strategy l_34, Strategy m_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_3_0");
    Fail127:
    { 
      IStrategoTerm j_152 = null;
      IStrategoTerm a_152 = null;
      IStrategoTerm b_152 = null;
      IStrategoTerm g_152 = null;
      IStrategoTerm k_152 = null;
      IStrategoTerm l_152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consIf_3 != ((IStrategoAppl)term).getConstructor())
        break Fail127;
      a_152 = term.getSubterm(0);
      b_152 = term.getSubterm(1);
      g_152 = term.getSubterm(2);
      IStrategoList annos100 = term.getAnnotations();
      j_152 = annos100;
      term = k_34.invoke(context, a_152);
      if(term == null)
        break Fail127;
      k_152 = term;
      term = l_34.invoke(context, b_152);
      if(term == null)
        break Fail127;
      l_152 = term;
      term = m_34.invoke(context, g_152);
      if(term == null)
        break Fail127;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consIf_3, new IStrategoTerm[]{k_152, l_152, term}), checkListAnnos(termFactory, j_152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}