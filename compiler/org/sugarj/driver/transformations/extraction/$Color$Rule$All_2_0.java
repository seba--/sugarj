package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Color$Rule$All_2_0 extends Strategy 
{ 
  public static $Color$Rule$All_2_0 instance = new $Color$Rule$All_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_336, Strategy o_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRuleAll_2_0");
    Fail785:
    { 
      IStrategoTerm l_431 = null;
      IStrategoTerm j_431 = null;
      IStrategoTerm k_431 = null;
      IStrategoTerm m_431 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consColorRuleAll_2 != ((IStrategoAppl)term).getConstructor())
        break Fail785;
      j_431 = term.getSubterm(0);
      k_431 = term.getSubterm(1);
      IStrategoList annos49 = term.getAnnotations();
      l_431 = annos49;
      term = n_336.invoke(context, j_431);
      if(term == null)
        break Fail785;
      m_431 = term;
      term = o_336.invoke(context, k_431);
      if(term == null)
        break Fail785;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consColorRuleAll_2, new IStrategoTerm[]{m_431, term}), checkListAnnos(termFactory, l_431));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}