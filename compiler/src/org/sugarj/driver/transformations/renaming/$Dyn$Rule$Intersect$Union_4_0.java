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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_13, Strategy k_13, Strategy l_13, Strategy m_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnion_4_0");
    Fail56:
    { 
      IStrategoTerm v_99 = null;
      IStrategoTerm r_99 = null;
      IStrategoTerm s_99 = null;
      IStrategoTerm t_99 = null;
      IStrategoTerm u_99 = null;
      IStrategoTerm w_99 = null;
      IStrategoTerm x_99 = null;
      IStrategoTerm y_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectUnion_4 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      r_99 = term.getSubterm(0);
      s_99 = term.getSubterm(1);
      t_99 = term.getSubterm(2);
      u_99 = term.getSubterm(3);
      IStrategoList annos47 = term.getAnnotations();
      v_99 = annos47;
      term = j_13.invoke(context, r_99);
      if(term == null)
        break Fail56;
      w_99 = term;
      term = k_13.invoke(context, s_99);
      if(term == null)
        break Fail56;
      x_99 = term;
      term = l_13.invoke(context, t_99);
      if(term == null)
        break Fail56;
      y_99 = term;
      term = m_13.invoke(context, u_99);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectUnion_4, new IStrategoTerm[]{w_99, x_99, y_99, term}), checkListAnnos(termFactory, v_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}