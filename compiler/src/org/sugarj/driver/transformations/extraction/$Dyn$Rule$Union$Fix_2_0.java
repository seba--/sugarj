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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_20, Strategy e_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnionFix_2_0");
    Fail87:
    { 
      IStrategoTerm l_114 = null;
      IStrategoTerm j_114 = null;
      IStrategoTerm k_114 = null;
      IStrategoTerm m_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDynRuleUnionFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail87;
      j_114 = term.getSubterm(0);
      k_114 = term.getSubterm(1);
      IStrategoList annos60 = term.getAnnotations();
      l_114 = annos60;
      term = d_20.invoke(context, j_114);
      if(term == null)
        break Fail87;
      m_114 = term;
      term = e_20.invoke(context, k_114);
      if(term == null)
        break Fail87;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consDynRuleUnionFix_2, new IStrategoTerm[]{m_114, term}), checkListAnnos(termFactory, l_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}