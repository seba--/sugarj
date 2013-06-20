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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_19, Strategy v_19, Strategy w_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnion_3_0");
    Fail84:
    { 
      IStrategoTerm r_113 = null;
      IStrategoTerm n_113 = null;
      IStrategoTerm o_113 = null;
      IStrategoTerm q_113 = null;
      IStrategoTerm s_113 = null;
      IStrategoTerm t_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDynRuleUnion_3 != ((IStrategoAppl)term).getConstructor())
        break Fail84;
      n_113 = term.getSubterm(0);
      o_113 = term.getSubterm(1);
      q_113 = term.getSubterm(2);
      IStrategoList annos57 = term.getAnnotations();
      r_113 = annos57;
      term = u_19.invoke(context, n_113);
      if(term == null)
        break Fail84;
      s_113 = term;
      term = v_19.invoke(context, o_113);
      if(term == null)
        break Fail84;
      t_113 = term;
      term = w_19.invoke(context, q_113);
      if(term == null)
        break Fail84;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consDynRuleUnion_3, new IStrategoTerm[]{s_113, t_113, term}), checkListAnnos(termFactory, r_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}