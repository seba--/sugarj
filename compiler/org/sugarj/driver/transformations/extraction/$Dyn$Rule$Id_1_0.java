package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Id_1_0 extends Strategy 
{ 
  public static $Dyn$Rule$Id_1_0 instance = new $Dyn$Rule$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleId_1_0");
    Fail29:
    { 
      IStrategoTerm n_104 = null;
      IStrategoTerm m_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      m_104 = term.getSubterm(0);
      IStrategoList annos6 = term.getAnnotations();
      n_104 = annos6;
      term = p_16.invoke(context, m_104);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}