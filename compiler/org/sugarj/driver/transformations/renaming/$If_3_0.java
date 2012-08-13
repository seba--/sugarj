package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If_3_0 extends Strategy 
{ 
  public static $If_3_0 instance = new $If_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_26, Strategy d_26, Strategy e_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_3_0");
    Fail137:
    { 
      IStrategoTerm r_128 = null;
      IStrategoTerm m_128 = null;
      IStrategoTerm n_128 = null;
      IStrategoTerm o_128 = null;
      IStrategoTerm s_128 = null;
      IStrategoTerm t_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consIf_3 != ((IStrategoAppl)term).getConstructor())
        break Fail137;
      m_128 = term.getSubterm(0);
      n_128 = term.getSubterm(1);
      o_128 = term.getSubterm(2);
      IStrategoList annos115 = term.getAnnotations();
      r_128 = annos115;
      term = c_26.invoke(context, m_128);
      if(term == null)
        break Fail137;
      s_128 = term;
      term = d_26.invoke(context, n_128);
      if(term == null)
        break Fail137;
      t_128 = term;
      term = e_26.invoke(context, o_128);
      if(term == null)
        break Fail137;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consIf_3, new IStrategoTerm[]{s_128, t_128, term}), checkListAnnos(termFactory, r_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}