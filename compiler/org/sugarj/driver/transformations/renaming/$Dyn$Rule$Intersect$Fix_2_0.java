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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_13, Strategy w_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectFix_2_0");
    Fail62:
    { 
      IStrategoTerm z_100 = null;
      IStrategoTerm x_100 = null;
      IStrategoTerm y_100 = null;
      IStrategoTerm a_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      x_100 = term.getSubterm(0);
      y_100 = term.getSubterm(1);
      IStrategoList annos52 = term.getAnnotations();
      z_100 = annos52;
      term = v_13.invoke(context, x_100);
      if(term == null)
        break Fail62;
      a_101 = term;
      term = w_13.invoke(context, y_100);
      if(term == null)
        break Fail62;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectFix_2, new IStrategoTerm[]{a_101, term}), checkListAnnos(termFactory, z_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}