package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Method_3_0 extends Strategy 
{ 
  public static $Q$Super$Method_3_0 instance = new $Q$Super$Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_15, Strategy k_15, Strategy l_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperMethod_3_0");
    Fail25:
    { 
      IStrategoTerm i_101 = null;
      IStrategoTerm f_101 = null;
      IStrategoTerm g_101 = null;
      IStrategoTerm h_101 = null;
      IStrategoTerm j_101 = null;
      IStrategoTerm m_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      f_101 = term.getSubterm(0);
      g_101 = term.getSubterm(1);
      h_101 = term.getSubterm(2);
      IStrategoList annos11 = term.getAnnotations();
      i_101 = annos11;
      term = j_15.invoke(context, f_101);
      if(term == null)
        break Fail25;
      j_101 = term;
      term = k_15.invoke(context, g_101);
      if(term == null)
        break Fail25;
      m_101 = term;
      term = l_15.invoke(context, h_101);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperMethod_3, new IStrategoTerm[]{j_101, m_101, term}), checkListAnnos(termFactory, i_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}