package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Id_1_0 extends Strategy 
{ 
  public static $Dyn$Rule$Id_1_0 instance = new $Dyn$Rule$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleId_1_0");
    Fail867:
    { 
      IStrategoTerm u_441 = null;
      IStrategoTerm t_441 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail867;
      t_441 = term.getSubterm(0);
      IStrategoList annos113 = term.getAnnotations();
      u_441 = annos113;
      term = q_340.invoke(context, t_441);
      if(term == null)
        break Fail867;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_441));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}