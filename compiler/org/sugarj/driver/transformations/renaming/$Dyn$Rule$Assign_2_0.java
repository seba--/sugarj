package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Assign_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Assign_2_0 instance = new $Dyn$Rule$Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_10, Strategy o_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssign_2_0");
    Fail21:
    { 
      IStrategoTerm r_91 = null;
      IStrategoTerm o_91 = null;
      IStrategoTerm q_91 = null;
      IStrategoTerm s_91 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      o_91 = term.getSubterm(0);
      q_91 = term.getSubterm(1);
      IStrategoList annos11 = term.getAnnotations();
      r_91 = annos11;
      term = n_10.invoke(context, o_91);
      if(term == null)
        break Fail21;
      s_91 = term;
      term = o_10.invoke(context, q_91);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleAssign_2, new IStrategoTerm[]{s_91, term}), checkListAnnos(termFactory, r_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}