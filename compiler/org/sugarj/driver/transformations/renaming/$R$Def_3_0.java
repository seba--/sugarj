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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_11, Strategy p_11, Strategy q_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDef_3_0");
    Fail33:
    { 
      IStrategoTerm p_94 = null;
      IStrategoTerm m_94 = null;
      IStrategoTerm n_94 = null;
      IStrategoTerm o_94 = null;
      IStrategoTerm r_94 = null;
      IStrategoTerm s_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      m_94 = term.getSubterm(0);
      n_94 = term.getSubterm(1);
      o_94 = term.getSubterm(2);
      IStrategoList annos23 = term.getAnnotations();
      p_94 = annos23;
      term = o_11.invoke(context, m_94);
      if(term == null)
        break Fail33;
      r_94 = term;
      term = p_11.invoke(context, n_94);
      if(term == null)
        break Fail33;
      s_94 = term;
      term = q_11.invoke(context, o_94);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDef_3, new IStrategoTerm[]{r_94, s_94, term}), checkListAnnos(termFactory, p_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}