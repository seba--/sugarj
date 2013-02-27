package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect_3_0 instance = new $Dyn$Rule$Intersect_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_13, Strategy l_13, Strategy m_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersect_3_0");
    Fail59:
    { 
      IStrategoTerm e_100 = null;
      IStrategoTerm b_100 = null;
      IStrategoTerm c_100 = null;
      IStrategoTerm d_100 = null;
      IStrategoTerm f_100 = null;
      IStrategoTerm g_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersect_3 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      b_100 = term.getSubterm(0);
      c_100 = term.getSubterm(1);
      d_100 = term.getSubterm(2);
      IStrategoList annos49 = term.getAnnotations();
      e_100 = annos49;
      term = k_13.invoke(context, b_100);
      if(term == null)
        break Fail59;
      f_100 = term;
      term = l_13.invoke(context, c_100);
      if(term == null)
        break Fail59;
      g_100 = term;
      term = m_13.invoke(context, d_100);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersect_3, new IStrategoTerm[]{f_100, g_100, term}), checkListAnnos(termFactory, e_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}