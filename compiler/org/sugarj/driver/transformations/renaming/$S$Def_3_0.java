package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def_3_0 extends Strategy 
{ 
  public static $S$Def_3_0 instance = new $S$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_43, Strategy f_43, Strategy g_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDef_3_0");
    Fail288:
    { 
      IStrategoTerm l_182 = null;
      IStrategoTerm i_182 = null;
      IStrategoTerm j_182 = null;
      IStrategoTerm k_182 = null;
      IStrategoTerm m_182 = null;
      IStrategoTerm n_182 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail288;
      i_182 = term.getSubterm(0);
      j_182 = term.getSubterm(1);
      k_182 = term.getSubterm(2);
      IStrategoList annos235 = term.getAnnotations();
      l_182 = annos235;
      term = e_43.invoke(context, i_182);
      if(term == null)
        break Fail288;
      m_182 = term;
      term = f_43.invoke(context, j_182);
      if(term == null)
        break Fail288;
      n_182 = term;
      term = g_43.invoke(context, k_182);
      if(term == null)
        break Fail288;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDef_3, new IStrategoTerm[]{m_182, n_182, term}), checkListAnnos(termFactory, l_182));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}