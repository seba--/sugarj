package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Folding_2_0 extends Strategy 
{ 
  public static $Folding_2_0 instance = new $Folding_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_337, Strategy m_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Folding_2_0");
    Fail812:
    { 
      IStrategoTerm t_433 = null;
      IStrategoTerm r_433 = null;
      IStrategoTerm s_433 = null;
      IStrategoTerm u_433 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consFolding_2 != ((IStrategoAppl)term).getConstructor())
        break Fail812;
      r_433 = term.getSubterm(0);
      s_433 = term.getSubterm(1);
      IStrategoList annos61 = term.getAnnotations();
      t_433 = annos61;
      term = l_337.invoke(context, r_433);
      if(term == null)
        break Fail812;
      u_433 = term;
      term = m_337.invoke(context, s_433);
      if(term == null)
        break Fail812;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consFolding_2, new IStrategoTerm[]{u_433, term}), checkListAnnos(termFactory, t_433));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}