package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_10, Strategy n_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssignAdd_2_0");
    Fail16:
    { 
      IStrategoTerm l_91 = null;
      IStrategoTerm i_91 = null;
      IStrategoTerm k_91 = null;
      IStrategoTerm n_91 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleAssignAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail16;
      i_91 = term.getSubterm(0);
      k_91 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      l_91 = annos10;
      term = m_10.invoke(context, i_91);
      if(term == null)
        break Fail16;
      n_91 = term;
      term = n_10.invoke(context, k_91);
      if(term == null)
        break Fail16;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleAssignAdd_2, new IStrategoTerm[]{n_91, term}), checkListAnnos(termFactory, l_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}