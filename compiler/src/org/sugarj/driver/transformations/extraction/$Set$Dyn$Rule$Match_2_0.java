package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_17, Strategy d_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleMatch_2_0");
    Fail48:
    { 
      IStrategoTerm c_106 = null;
      IStrategoTerm z_105 = null;
      IStrategoTerm b_106 = null;
      IStrategoTerm d_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSetDynRuleMatch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      z_105 = term.getSubterm(0);
      b_106 = term.getSubterm(1);
      IStrategoList annos21 = term.getAnnotations();
      c_106 = annos21;
      term = c_17.invoke(context, z_105);
      if(term == null)
        break Fail48;
      d_106 = term;
      term = d_17.invoke(context, b_106);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSetDynRuleMatch_2, new IStrategoTerm[]{d_106, term}), checkListAnnos(termFactory, c_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}