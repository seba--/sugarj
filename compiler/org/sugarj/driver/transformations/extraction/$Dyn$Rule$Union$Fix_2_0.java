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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_341, Strategy e_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnionFix_2_0");
    Fail875:
    { 
      IStrategoTerm d_443 = null;
      IStrategoTerm b_443 = null;
      IStrategoTerm c_443 = null;
      IStrategoTerm e_443 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleUnionFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail875;
      b_443 = term.getSubterm(0);
      c_443 = term.getSubterm(1);
      IStrategoList annos121 = term.getAnnotations();
      d_443 = annos121;
      term = d_341.invoke(context, b_443);
      if(term == null)
        break Fail875;
      e_443 = term;
      term = e_341.invoke(context, c_443);
      if(term == null)
        break Fail875;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleUnionFix_2, new IStrategoTerm[]{e_443, term}), checkListAnnos(termFactory, d_443));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}