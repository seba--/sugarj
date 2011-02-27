package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Scope$Id_1_0 extends Strategy 
{ 
  public static $Dyn$Rule$Scope$Id_1_0 instance = new $Dyn$Rule$Scope$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScopeId_1_0");
    Fail27:
    { 
      IStrategoTerm e_104 = null;
      IStrategoTerm d_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleScopeId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      d_104 = term.getSubterm(0);
      IStrategoList annos4 = term.getAnnotations();
      e_104 = annos4;
      term = m_16.invoke(context, d_104);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleScopeId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}