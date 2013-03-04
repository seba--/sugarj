package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_44, Strategy n_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScope_2_0");
    Fail300:
    { 
      IStrategoTerm r_185 = null;
      IStrategoTerm p_185 = null;
      IStrategoTerm q_185 = null;
      IStrategoTerm s_185 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail300;
      p_185 = term.getSubterm(0);
      q_185 = term.getSubterm(1);
      IStrategoList annos247 = term.getAnnotations();
      r_185 = annos247;
      term = m_44.invoke(context, p_185);
      if(term == null)
        break Fail300;
      s_185 = term;
      term = n_44.invoke(context, q_185);
      if(term == null)
        break Fail300;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleScope_2, new IStrategoTerm[]{s_185, term}), checkListAnnos(termFactory, r_185));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}