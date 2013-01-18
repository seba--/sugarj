package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule$Match_2_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule$Match_2_0 instance = new $Set$Dyn$Rule$Match_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_41, Strategy j_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleMatch_2_0");
    Fail259:
    { 
      IStrategoTerm s_176 = null;
      IStrategoTerm q_176 = null;
      IStrategoTerm r_176 = null;
      IStrategoTerm t_176 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRuleMatch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail259;
      q_176 = term.getSubterm(0);
      r_176 = term.getSubterm(1);
      IStrategoList annos206 = term.getAnnotations();
      s_176 = annos206;
      term = i_41.invoke(context, q_176);
      if(term == null)
        break Fail259;
      t_176 = term;
      term = j_41.invoke(context, r_176);
      if(term == null)
        break Fail259;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRuleMatch_2, new IStrategoTerm[]{t_176, term}), checkListAnnos(termFactory, s_176));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}