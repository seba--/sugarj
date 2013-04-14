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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_28, Strategy n_28, Strategy o_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prod_3_0");
    Fail232:
    { 
      IStrategoTerm e_144 = null;
      IStrategoTerm b_144 = null;
      IStrategoTerm c_144 = null;
      IStrategoTerm d_144 = null;
      IStrategoTerm g_144 = null;
      IStrategoTerm h_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail232;
      b_144 = term.getSubterm(0);
      c_144 = term.getSubterm(1);
      d_144 = term.getSubterm(2);
      IStrategoList annos192 = term.getAnnotations();
      e_144 = annos192;
      term = m_28.invoke(context, b_144);
      if(term == null)
        break Fail232;
      g_144 = term;
      term = n_28.invoke(context, c_144);
      if(term == null)
        break Fail232;
      h_144 = term;
      term = o_28.invoke(context, d_144);
      if(term == null)
        break Fail232;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consprod_3, new IStrategoTerm[]{g_144, h_144, term}), checkListAnnos(termFactory, e_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}