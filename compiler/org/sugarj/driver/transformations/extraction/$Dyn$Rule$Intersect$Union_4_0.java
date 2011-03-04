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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_19, Strategy q_19, Strategy r_19, Strategy s_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnion_4_0");
    Fail71:
    { 
      IStrategoTerm z_112 = null;
      IStrategoTerm v_112 = null;
      IStrategoTerm w_112 = null;
      IStrategoTerm x_112 = null;
      IStrategoTerm y_112 = null;
      IStrategoTerm a_113 = null;
      IStrategoTerm b_113 = null;
      IStrategoTerm c_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleIntersectUnion_4 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      v_112 = term.getSubterm(0);
      w_112 = term.getSubterm(1);
      x_112 = term.getSubterm(2);
      y_112 = term.getSubterm(3);
      IStrategoList annos47 = term.getAnnotations();
      z_112 = annos47;
      term = p_19.invoke(context, v_112);
      if(term == null)
        break Fail71;
      a_113 = term;
      term = q_19.invoke(context, w_112);
      if(term == null)
        break Fail71;
      b_113 = term;
      term = r_19.invoke(context, x_112);
      if(term == null)
        break Fail71;
      c_113 = term;
      term = s_19.invoke(context, y_112);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleIntersectUnion_4, new IStrategoTerm[]{a_113, b_113, c_113, term}), checkListAnnos(termFactory, z_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}