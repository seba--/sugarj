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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_13, Strategy o_13, Strategy p_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersect_3_0");
    Fail59:
    { 
      IStrategoTerm h_100 = null;
      IStrategoTerm e_100 = null;
      IStrategoTerm f_100 = null;
      IStrategoTerm g_100 = null;
      IStrategoTerm i_100 = null;
      IStrategoTerm j_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersect_3 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      e_100 = term.getSubterm(0);
      f_100 = term.getSubterm(1);
      g_100 = term.getSubterm(2);
      IStrategoList annos49 = term.getAnnotations();
      h_100 = annos49;
      term = n_13.invoke(context, e_100);
      if(term == null)
        break Fail59;
      i_100 = term;
      term = o_13.invoke(context, f_100);
      if(term == null)
        break Fail59;
      j_100 = term;
      term = p_13.invoke(context, g_100);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersect_3, new IStrategoTerm[]{i_100, j_100, term}), checkListAnnos(termFactory, h_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}