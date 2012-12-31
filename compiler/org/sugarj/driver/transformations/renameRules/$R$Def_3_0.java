package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Def_3_0 extends Strategy 
{ 
  public static $R$Def_3_0 instance = new $R$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_11, Strategy n_11, Strategy o_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDef_3_0");
    Fail29:
    { 
      IStrategoTerm n_94 = null;
      IStrategoTerm k_94 = null;
      IStrategoTerm l_94 = null;
      IStrategoTerm m_94 = null;
      IStrategoTerm o_94 = null;
      IStrategoTerm p_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      k_94 = term.getSubterm(0);
      l_94 = term.getSubterm(1);
      m_94 = term.getSubterm(2);
      IStrategoList annos23 = term.getAnnotations();
      n_94 = annos23;
      term = m_11.invoke(context, k_94);
      if(term == null)
        break Fail29;
      o_94 = term;
      term = n_11.invoke(context, l_94);
      if(term == null)
        break Fail29;
      p_94 = term;
      term = o_11.invoke(context, m_94);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDef_3, new IStrategoTerm[]{o_94, p_94, term}), checkListAnnos(termFactory, n_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}