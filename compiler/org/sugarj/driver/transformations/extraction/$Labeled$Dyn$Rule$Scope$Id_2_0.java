package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Labeled$Dyn$Rule$Scope$Id_2_0 extends Strategy 
{ 
  public static $Labeled$Dyn$Rule$Scope$Id_2_0 instance = new $Labeled$Dyn$Rule$Scope$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_16, Strategy n_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleScopeId_2_0");
    Fail40:
    { 
      IStrategoTerm m_104 = null;
      IStrategoTerm k_104 = null;
      IStrategoTerm l_104 = null;
      IStrategoTerm n_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consLabeledDynRuleScopeId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      k_104 = term.getSubterm(0);
      l_104 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      m_104 = annos13;
      term = m_16.invoke(context, k_104);
      if(term == null)
        break Fail40;
      n_104 = term;
      term = n_16.invoke(context, l_104);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{n_104, term}), checkListAnnos(termFactory, m_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}