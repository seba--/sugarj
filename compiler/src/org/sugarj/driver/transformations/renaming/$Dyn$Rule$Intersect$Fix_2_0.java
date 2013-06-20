package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect$Fix_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect$Fix_2_0 instance = new $Dyn$Rule$Intersect$Fix_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_13, Strategy z_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectFix_2_0");
    Fail61:
    { 
      IStrategoTerm c_101 = null;
      IStrategoTerm a_101 = null;
      IStrategoTerm b_101 = null;
      IStrategoTerm d_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      a_101 = term.getSubterm(0);
      b_101 = term.getSubterm(1);
      IStrategoList annos52 = term.getAnnotations();
      c_101 = annos52;
      term = y_13.invoke(context, a_101);
      if(term == null)
        break Fail61;
      d_101 = term;
      term = z_13.invoke(context, b_101);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectFix_2, new IStrategoTerm[]{d_101, term}), checkListAnnos(termFactory, c_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}