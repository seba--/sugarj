package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class prod_3_0 extends Strategy 
{ 
  public static prod_3_0 instance = new prod_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_28, Strategy m_28, Strategy n_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prod_3_0");
    Fail243:
    { 
      IStrategoTerm i_144 = null;
      IStrategoTerm e_144 = null;
      IStrategoTerm f_144 = null;
      IStrategoTerm g_144 = null;
      IStrategoTerm j_144 = null;
      IStrategoTerm k_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail243;
      e_144 = term.getSubterm(0);
      f_144 = term.getSubterm(1);
      g_144 = term.getSubterm(2);
      IStrategoList annos200 = term.getAnnotations();
      i_144 = annos200;
      term = l_28.invoke(context, e_144);
      if(term == null)
        break Fail243;
      j_144 = term;
      term = m_28.invoke(context, f_144);
      if(term == null)
        break Fail243;
      k_144 = term;
      term = n_28.invoke(context, g_144);
      if(term == null)
        break Fail243;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consprod_3, new IStrategoTerm[]{j_144, k_144, term}), checkListAnnos(termFactory, i_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}