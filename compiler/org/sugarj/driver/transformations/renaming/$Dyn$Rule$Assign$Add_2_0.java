package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_10, Strategy p_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssignAdd_2_0");
    Fail20:
    { 
      IStrategoTerm o_91 = null;
      IStrategoTerm l_91 = null;
      IStrategoTerm n_91 = null;
      IStrategoTerm q_91 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleAssignAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      l_91 = term.getSubterm(0);
      n_91 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      o_91 = annos10;
      term = o_10.invoke(context, l_91);
      if(term == null)
        break Fail20;
      q_91 = term;
      term = p_10.invoke(context, n_91);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleAssignAdd_2, new IStrategoTerm[]{q_91, term}), checkListAnnos(termFactory, o_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}