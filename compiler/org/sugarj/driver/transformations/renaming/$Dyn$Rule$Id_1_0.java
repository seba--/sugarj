package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleId_1_0");
    Fail253:
    { 
      IStrategoTerm n_175 = null;
      IStrategoTerm m_175 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail253;
      m_175 = term.getSubterm(0);
      IStrategoList annos200 = term.getAnnotations();
      n_175 = annos200;
      term = w_40.invoke(context, m_175);
      if(term == null)
        break Fail253;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_175));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}