package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_16, Strategy a_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssign_2_0");
    Fail35:
    { 
      IStrategoTerm n_105 = null;
      IStrategoTerm l_105 = null;
      IStrategoTerm m_105 = null;
      IStrategoTerm o_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      l_105 = term.getSubterm(0);
      m_105 = term.getSubterm(1);
      IStrategoList annos11 = term.getAnnotations();
      n_105 = annos11;
      term = z_16.invoke(context, l_105);
      if(term == null)
        break Fail35;
      o_105 = term;
      term = a_17.invoke(context, m_105);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleAssign_2, new IStrategoTerm[]{o_105, term}), checkListAnnos(termFactory, n_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}