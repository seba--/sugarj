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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_13, Strategy r_13, Strategy s_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersect_3_0");
    Fail58:
    { 
      IStrategoTerm k_100 = null;
      IStrategoTerm h_100 = null;
      IStrategoTerm i_100 = null;
      IStrategoTerm j_100 = null;
      IStrategoTerm l_100 = null;
      IStrategoTerm m_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersect_3 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      h_100 = term.getSubterm(0);
      i_100 = term.getSubterm(1);
      j_100 = term.getSubterm(2);
      IStrategoList annos49 = term.getAnnotations();
      k_100 = annos49;
      term = q_13.invoke(context, h_100);
      if(term == null)
        break Fail58;
      l_100 = term;
      term = r_13.invoke(context, i_100);
      if(term == null)
        break Fail58;
      m_100 = term;
      term = s_13.invoke(context, j_100);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersect_3, new IStrategoTerm[]{l_100, m_100, term}), checkListAnnos(termFactory, k_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}