package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Assign$Add_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Assign$Add_2_0 instance = new $Dyn$Rule$Assign$Add_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_16, Strategy x_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssignAdd_2_0");
    Fail45:
    { 
      IStrategoTerm l_105 = null;
      IStrategoTerm j_105 = null;
      IStrategoTerm k_105 = null;
      IStrategoTerm m_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDynRuleAssignAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      j_105 = term.getSubterm(0);
      k_105 = term.getSubterm(1);
      IStrategoList annos18 = term.getAnnotations();
      l_105 = annos18;
      term = w_16.invoke(context, j_105);
      if(term == null)
        break Fail45;
      m_105 = term;
      term = x_16.invoke(context, k_105);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDynRuleAssignAdd_2, new IStrategoTerm[]{m_105, term}), checkListAnnos(termFactory, l_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}