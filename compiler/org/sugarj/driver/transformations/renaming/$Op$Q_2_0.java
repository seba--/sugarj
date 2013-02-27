package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Q_2_0 extends Strategy 
{ 
  public static $Op$Q_2_0 instance = new $Op$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_18, Strategy n_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpQ_2_0");
    Fail142:
    { 
      IStrategoTerm g_114 = null;
      IStrategoTerm e_114 = null;
      IStrategoTerm f_114 = null;
      IStrategoTerm h_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      e_114 = term.getSubterm(0);
      f_114 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      g_114 = annos128;
      term = m_18.invoke(context, e_114);
      if(term == null)
        break Fail142;
      h_114 = term;
      term = n_18.invoke(context, f_114);
      if(term == null)
        break Fail142;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpQ_2, new IStrategoTerm[]{h_114, term}), checkListAnnos(termFactory, g_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}