package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_19, Strategy r_19, Strategy s_19, Strategy t_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnion_4_0");
    Fail83:
    { 
      IStrategoTerm i_113 = null;
      IStrategoTerm d_113 = null;
      IStrategoTerm e_113 = null;
      IStrategoTerm f_113 = null;
      IStrategoTerm g_113 = null;
      IStrategoTerm j_113 = null;
      IStrategoTerm k_113 = null;
      IStrategoTerm l_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDynRuleIntersectUnion_4 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      d_113 = term.getSubterm(0);
      e_113 = term.getSubterm(1);
      f_113 = term.getSubterm(2);
      g_113 = term.getSubterm(3);
      IStrategoList annos56 = term.getAnnotations();
      i_113 = annos56;
      term = q_19.invoke(context, d_113);
      if(term == null)
        break Fail83;
      j_113 = term;
      term = r_19.invoke(context, e_113);
      if(term == null)
        break Fail83;
      k_113 = term;
      term = s_19.invoke(context, f_113);
      if(term == null)
        break Fail83;
      l_113 = term;
      term = t_19.invoke(context, g_113);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consDynRuleIntersectUnion_4, new IStrategoTerm[]{j_113, k_113, l_113, term}), checkListAnnos(termFactory, i_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}