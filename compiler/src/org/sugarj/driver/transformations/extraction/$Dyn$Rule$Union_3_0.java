package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Union_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Union_3_0 instance = new $Dyn$Rule$Union_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_19, Strategy u_19, Strategy v_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnion_3_0");
    Fail72:
    { 
      IStrategoTerm i_113 = null;
      IStrategoTerm e_113 = null;
      IStrategoTerm f_113 = null;
      IStrategoTerm g_113 = null;
      IStrategoTerm j_113 = null;
      IStrategoTerm k_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleUnion_3 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      e_113 = term.getSubterm(0);
      f_113 = term.getSubterm(1);
      g_113 = term.getSubterm(2);
      IStrategoList annos48 = term.getAnnotations();
      i_113 = annos48;
      term = t_19.invoke(context, e_113);
      if(term == null)
        break Fail72;
      j_113 = term;
      term = u_19.invoke(context, f_113);
      if(term == null)
        break Fail72;
      k_113 = term;
      term = v_19.invoke(context, g_113);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleUnion_3, new IStrategoTerm[]{j_113, k_113, term}), checkListAnnos(termFactory, i_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}