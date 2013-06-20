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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_16, Strategy w_16, Strategy x_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleDepends_3_0");
    Fail45:
    { 
      IStrategoTerm k_105 = null;
      IStrategoTerm h_105 = null;
      IStrategoTerm i_105 = null;
      IStrategoTerm j_105 = null;
      IStrategoTerm l_105 = null;
      IStrategoTerm m_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSetDynRuleDepends_3 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      h_105 = term.getSubterm(0);
      i_105 = term.getSubterm(1);
      j_105 = term.getSubterm(2);
      IStrategoList annos18 = term.getAnnotations();
      k_105 = annos18;
      term = v_16.invoke(context, h_105);
      if(term == null)
        break Fail45;
      l_105 = term;
      term = w_16.invoke(context, i_105);
      if(term == null)
        break Fail45;
      m_105 = term;
      term = x_16.invoke(context, j_105);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSetDynRuleDepends_3, new IStrategoTerm[]{l_105, m_105, term}), checkListAnnos(termFactory, k_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}