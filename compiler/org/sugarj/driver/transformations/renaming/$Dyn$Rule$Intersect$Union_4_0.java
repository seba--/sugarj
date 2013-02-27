package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect$Union_4_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect$Union_4_0 instance = new $Dyn$Rule$Intersect$Union_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_13, Strategy e_13, Strategy f_13, Strategy g_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnion_4_0");
    Fail57:
    { 
      IStrategoTerm p_99 = null;
      IStrategoTerm l_99 = null;
      IStrategoTerm m_99 = null;
      IStrategoTerm n_99 = null;
      IStrategoTerm o_99 = null;
      IStrategoTerm q_99 = null;
      IStrategoTerm r_99 = null;
      IStrategoTerm s_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectUnion_4 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      l_99 = term.getSubterm(0);
      m_99 = term.getSubterm(1);
      n_99 = term.getSubterm(2);
      o_99 = term.getSubterm(3);
      IStrategoList annos47 = term.getAnnotations();
      p_99 = annos47;
      term = d_13.invoke(context, l_99);
      if(term == null)
        break Fail57;
      q_99 = term;
      term = e_13.invoke(context, m_99);
      if(term == null)
        break Fail57;
      r_99 = term;
      term = f_13.invoke(context, n_99);
      if(term == null)
        break Fail57;
      s_99 = term;
      term = g_13.invoke(context, o_99);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectUnion_4, new IStrategoTerm[]{q_99, r_99, s_99, term}), checkListAnnos(termFactory, p_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}