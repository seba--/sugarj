package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule$Depends_3_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule$Depends_3_0 instance = new $Set$Dyn$Rule$Depends_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_16, Strategy v_16, Strategy w_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleDepends_3_0");
    Fail32:
    { 
      IStrategoTerm c_105 = null;
      IStrategoTerm z_104 = null;
      IStrategoTerm a_105 = null;
      IStrategoTerm b_105 = null;
      IStrategoTerm d_105 = null;
      IStrategoTerm e_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSetDynRuleDepends_3 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      z_104 = term.getSubterm(0);
      a_105 = term.getSubterm(1);
      b_105 = term.getSubterm(2);
      IStrategoList annos9 = term.getAnnotations();
      c_105 = annos9;
      term = u_16.invoke(context, z_104);
      if(term == null)
        break Fail32;
      d_105 = term;
      term = v_16.invoke(context, a_105);
      if(term == null)
        break Fail32;
      e_105 = term;
      term = w_16.invoke(context, b_105);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSetDynRuleDepends_3, new IStrategoTerm[]{d_105, e_105, term}), checkListAnnos(termFactory, c_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}