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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_20, Strategy h_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScope_2_0");
    Fail89:
    { 
      IStrategoTerm w_114 = null;
      IStrategoTerm t_114 = null;
      IStrategoTerm v_114 = null;
      IStrategoTerm x_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDynRuleScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      t_114 = term.getSubterm(0);
      v_114 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      w_114 = annos62;
      term = g_20.invoke(context, t_114);
      if(term == null)
        break Fail89;
      x_114 = term;
      term = h_20.invoke(context, v_114);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDynRuleScope_2, new IStrategoTerm[]{x_114, term}), checkListAnnos(termFactory, w_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}