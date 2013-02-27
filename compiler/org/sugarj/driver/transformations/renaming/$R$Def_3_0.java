package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_11, Strategy m_11, Strategy n_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDef_3_0");
    Fail33:
    { 
      IStrategoTerm m_94 = null;
      IStrategoTerm j_94 = null;
      IStrategoTerm k_94 = null;
      IStrategoTerm l_94 = null;
      IStrategoTerm n_94 = null;
      IStrategoTerm o_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      j_94 = term.getSubterm(0);
      k_94 = term.getSubterm(1);
      l_94 = term.getSubterm(2);
      IStrategoList annos23 = term.getAnnotations();
      m_94 = annos23;
      term = l_11.invoke(context, j_94);
      if(term == null)
        break Fail33;
      n_94 = term;
      term = m_11.invoke(context, k_94);
      if(term == null)
        break Fail33;
      o_94 = term;
      term = n_11.invoke(context, l_94);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDef_3, new IStrategoTerm[]{n_94, o_94, term}), checkListAnnos(termFactory, m_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}