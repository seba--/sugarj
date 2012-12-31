package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Scope_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Scope_2_0 instance = new $Dyn$Rule$Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_13, Strategy x_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScope_2_0");
    Fail60:
    { 
      IStrategoTerm f_101 = null;
      IStrategoTerm d_101 = null;
      IStrategoTerm e_101 = null;
      IStrategoTerm g_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      d_101 = term.getSubterm(0);
      e_101 = term.getSubterm(1);
      IStrategoList annos54 = term.getAnnotations();
      f_101 = annos54;
      term = w_13.invoke(context, d_101);
      if(term == null)
        break Fail60;
      g_101 = term;
      term = x_13.invoke(context, e_101);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleScope_2, new IStrategoTerm[]{g_101, term}), checkListAnnos(termFactory, f_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}