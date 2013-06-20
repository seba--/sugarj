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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_10, Strategy w_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleMatch_2_0");
    Fail21:
    { 
      IStrategoTerm e_92 = null;
      IStrategoTerm c_92 = null;
      IStrategoTerm d_92 = null;
      IStrategoTerm f_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRuleMatch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      c_92 = term.getSubterm(0);
      d_92 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      e_92 = annos12;
      term = v_10.invoke(context, c_92);
      if(term == null)
        break Fail21;
      f_92 = term;
      term = w_10.invoke(context, d_92);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRuleMatch_2, new IStrategoTerm[]{f_92, term}), checkListAnnos(termFactory, e_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}