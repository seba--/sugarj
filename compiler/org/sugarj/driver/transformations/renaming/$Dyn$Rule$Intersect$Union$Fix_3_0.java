package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect$Union$Fix_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect$Union$Fix_3_0 instance = new $Dyn$Rule$Intersect$Union$Fix_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_44, Strategy f_44, Strategy g_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnionFix_3_0");
    Fail296:
    { 
      IStrategoTerm w_184 = null;
      IStrategoTerm t_184 = null;
      IStrategoTerm u_184 = null;
      IStrategoTerm v_184 = null;
      IStrategoTerm x_184 = null;
      IStrategoTerm y_184 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectUnionFix_3 != ((IStrategoAppl)term).getConstructor())
        break Fail296;
      t_184 = term.getSubterm(0);
      u_184 = term.getSubterm(1);
      v_184 = term.getSubterm(2);
      IStrategoList annos243 = term.getAnnotations();
      w_184 = annos243;
      term = e_44.invoke(context, t_184);
      if(term == null)
        break Fail296;
      x_184 = term;
      term = f_44.invoke(context, u_184);
      if(term == null)
        break Fail296;
      y_184 = term;
      term = g_44.invoke(context, v_184);
      if(term == null)
        break Fail296;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectUnionFix_3, new IStrategoTerm[]{x_184, y_184, term}), checkListAnnos(termFactory, w_184));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}