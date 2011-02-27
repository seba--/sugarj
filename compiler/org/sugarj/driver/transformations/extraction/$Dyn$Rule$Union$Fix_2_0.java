package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_20, Strategy d_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnionFix_2_0");
    Fail74:
    { 
      IStrategoTerm d_114 = null;
      IStrategoTerm b_114 = null;
      IStrategoTerm c_114 = null;
      IStrategoTerm e_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleUnionFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      b_114 = term.getSubterm(0);
      c_114 = term.getSubterm(1);
      IStrategoList annos51 = term.getAnnotations();
      d_114 = annos51;
      term = c_20.invoke(context, b_114);
      if(term == null)
        break Fail74;
      e_114 = term;
      term = d_20.invoke(context, c_114);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleUnionFix_2, new IStrategoTerm[]{e_114, term}), checkListAnnos(termFactory, d_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}