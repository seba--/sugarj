package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fold$Rule$All_2_0 extends Strategy 
{ 
  public static $Fold$Rule$All_2_0 instance = new $Fold$Rule$All_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_337, Strategy q_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FoldRuleAll_2_0");
    Fail814:
    { 
      IStrategoTerm d_434 = null;
      IStrategoTerm b_434 = null;
      IStrategoTerm c_434 = null;
      IStrategoTerm e_434 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consFoldRuleAll_2 != ((IStrategoAppl)term).getConstructor())
        break Fail814;
      b_434 = term.getSubterm(0);
      c_434 = term.getSubterm(1);
      IStrategoList annos63 = term.getAnnotations();
      d_434 = annos63;
      term = p_337.invoke(context, b_434);
      if(term == null)
        break Fail814;
      e_434 = term;
      term = q_337.invoke(context, c_434);
      if(term == null)
        break Fail814;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consFoldRuleAll_2, new IStrategoTerm[]{e_434, term}), checkListAnnos(termFactory, d_434));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}