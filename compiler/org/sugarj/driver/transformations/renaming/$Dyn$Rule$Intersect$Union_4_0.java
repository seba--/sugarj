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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_13, Strategy h_13, Strategy i_13, Strategy j_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnion_4_0");
    Fail57:
    { 
      IStrategoTerm s_99 = null;
      IStrategoTerm o_99 = null;
      IStrategoTerm p_99 = null;
      IStrategoTerm q_99 = null;
      IStrategoTerm r_99 = null;
      IStrategoTerm t_99 = null;
      IStrategoTerm u_99 = null;
      IStrategoTerm v_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectUnion_4 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      o_99 = term.getSubterm(0);
      p_99 = term.getSubterm(1);
      q_99 = term.getSubterm(2);
      r_99 = term.getSubterm(3);
      IStrategoList annos47 = term.getAnnotations();
      s_99 = annos47;
      term = g_13.invoke(context, o_99);
      if(term == null)
        break Fail57;
      t_99 = term;
      term = h_13.invoke(context, p_99);
      if(term == null)
        break Fail57;
      u_99 = term;
      term = i_13.invoke(context, q_99);
      if(term == null)
        break Fail57;
      v_99 = term;
      term = j_13.invoke(context, r_99);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectUnion_4, new IStrategoTerm[]{t_99, u_99, v_99, term}), checkListAnnos(termFactory, s_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}