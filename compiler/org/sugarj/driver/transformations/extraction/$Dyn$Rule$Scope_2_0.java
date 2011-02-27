package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_20, Strategy i_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScope_2_0");
    Fail77:
    { 
      IStrategoTerm s_114 = null;
      IStrategoTerm o_114 = null;
      IStrategoTerm p_114 = null;
      IStrategoTerm t_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      o_114 = term.getSubterm(0);
      p_114 = term.getSubterm(1);
      IStrategoList annos54 = term.getAnnotations();
      s_114 = annos54;
      term = h_20.invoke(context, o_114);
      if(term == null)
        break Fail77;
      t_114 = term;
      term = i_20.invoke(context, p_114);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleScope_2, new IStrategoTerm[]{t_114, term}), checkListAnnos(termFactory, s_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}