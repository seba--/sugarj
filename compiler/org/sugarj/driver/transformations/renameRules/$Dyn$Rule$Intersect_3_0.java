package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_13, Strategy m_13, Strategy n_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersect_3_0");
    Fail55:
    { 
      IStrategoTerm f_100 = null;
      IStrategoTerm c_100 = null;
      IStrategoTerm d_100 = null;
      IStrategoTerm e_100 = null;
      IStrategoTerm g_100 = null;
      IStrategoTerm h_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersect_3 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      c_100 = term.getSubterm(0);
      d_100 = term.getSubterm(1);
      e_100 = term.getSubterm(2);
      IStrategoList annos49 = term.getAnnotations();
      f_100 = annos49;
      term = l_13.invoke(context, c_100);
      if(term == null)
        break Fail55;
      g_100 = term;
      term = m_13.invoke(context, d_100);
      if(term == null)
        break Fail55;
      h_100 = term;
      term = n_13.invoke(context, e_100);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersect_3, new IStrategoTerm[]{g_100, h_100, term}), checkListAnnos(termFactory, f_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}