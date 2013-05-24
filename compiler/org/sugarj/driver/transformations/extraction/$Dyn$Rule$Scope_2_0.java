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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_339, Strategy s_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScope_2_0");
    Fail854:
    { 
      IStrategoTerm k_439 = null;
      IStrategoTerm i_439 = null;
      IStrategoTerm j_439 = null;
      IStrategoTerm l_439 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail854;
      i_439 = term.getSubterm(0);
      j_439 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      k_439 = annos100;
      term = r_339.invoke(context, i_439);
      if(term == null)
        break Fail854;
      l_439 = term;
      term = s_339.invoke(context, j_439);
      if(term == null)
        break Fail854;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleScope_2, new IStrategoTerm[]{l_439, term}), checkListAnnos(termFactory, k_439));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}