package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Scope_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Scope_2_0 instance = new $Dyn$Rule$Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_14, Strategy c_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScope_2_0");
    Fail63:
    { 
      IStrategoTerm m_101 = null;
      IStrategoTerm i_101 = null;
      IStrategoTerm j_101 = null;
      IStrategoTerm n_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      i_101 = term.getSubterm(0);
      j_101 = term.getSubterm(1);
      IStrategoList annos54 = term.getAnnotations();
      m_101 = annos54;
      term = b_14.invoke(context, i_101);
      if(term == null)
        break Fail63;
      n_101 = term;
      term = c_14.invoke(context, j_101);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleScope_2, new IStrategoTerm[]{n_101, term}), checkListAnnos(termFactory, m_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}