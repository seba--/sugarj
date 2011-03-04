package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Add$Scope$Label_2_0 extends Strategy 
{ 
  public static $Add$Scope$Label_2_0 instance = new $Add$Scope$Label_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_17, Strategy k_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddScopeLabel_2_0");
    Fail40:
    { 
      IStrategoTerm o_106 = null;
      IStrategoTerm m_106 = null;
      IStrategoTerm n_106 = null;
      IStrategoTerm p_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consAddScopeLabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      m_106 = term.getSubterm(0);
      n_106 = term.getSubterm(1);
      IStrategoList annos16 = term.getAnnotations();
      o_106 = annos16;
      term = j_17.invoke(context, m_106);
      if(term == null)
        break Fail40;
      p_106 = term;
      term = k_17.invoke(context, n_106);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consAddScopeLabel_2, new IStrategoTerm[]{p_106, term}), checkListAnnos(termFactory, o_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}