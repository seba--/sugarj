package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Union$Fix_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Union$Fix_2_0 instance = new $Dyn$Rule$Union$Fix_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_13, Strategy s_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnionFix_2_0");
    Fail57:
    { 
      IStrategoTerm s_100 = null;
      IStrategoTerm q_100 = null;
      IStrategoTerm r_100 = null;
      IStrategoTerm t_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleUnionFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      q_100 = term.getSubterm(0);
      r_100 = term.getSubterm(1);
      IStrategoList annos51 = term.getAnnotations();
      s_100 = annos51;
      term = r_13.invoke(context, q_100);
      if(term == null)
        break Fail57;
      t_100 = term;
      term = s_13.invoke(context, r_100);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleUnionFix_2, new IStrategoTerm[]{t_100, term}), checkListAnnos(termFactory, s_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}