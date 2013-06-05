package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Union_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Union_3_0 instance = new $Dyn$Rule$Union_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_19, Strategy t_19, Strategy u_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnion_3_0");
    Fail83:
    { 
      IStrategoTerm l_113 = null;
      IStrategoTerm i_113 = null;
      IStrategoTerm j_113 = null;
      IStrategoTerm k_113 = null;
      IStrategoTerm m_113 = null;
      IStrategoTerm n_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDynRuleUnion_3 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      i_113 = term.getSubterm(0);
      j_113 = term.getSubterm(1);
      k_113 = term.getSubterm(2);
      IStrategoList annos56 = term.getAnnotations();
      l_113 = annos56;
      term = s_19.invoke(context, i_113);
      if(term == null)
        break Fail83;
      m_113 = term;
      term = t_19.invoke(context, j_113);
      if(term == null)
        break Fail83;
      n_113 = term;
      term = u_19.invoke(context, k_113);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDynRuleUnion_3, new IStrategoTerm[]{m_113, n_113, term}), checkListAnnos(termFactory, l_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}