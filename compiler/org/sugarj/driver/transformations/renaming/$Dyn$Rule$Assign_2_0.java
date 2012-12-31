package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Assign_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Assign_2_0 instance = new $Dyn$Rule$Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_41, Strategy h_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssign_2_0");
    Fail258:
    { 
      IStrategoTerm n_176 = null;
      IStrategoTerm l_176 = null;
      IStrategoTerm m_176 = null;
      IStrategoTerm o_176 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail258;
      l_176 = term.getSubterm(0);
      m_176 = term.getSubterm(1);
      IStrategoList annos205 = term.getAnnotations();
      n_176 = annos205;
      term = g_41.invoke(context, l_176);
      if(term == null)
        break Fail258;
      o_176 = term;
      term = h_41.invoke(context, m_176);
      if(term == null)
        break Fail258;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleAssign_2, new IStrategoTerm[]{o_176, term}), checkListAnnos(termFactory, n_176));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}