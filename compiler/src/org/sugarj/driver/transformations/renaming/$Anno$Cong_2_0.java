package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Cong_2_0 extends Strategy 
{ 
  public static $Anno$Cong_2_0 instance = new $Anno$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_15, Strategy g_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoCong_2_0");
    Fail80:
    { 
      IStrategoTerm n_104 = null;
      IStrategoTerm l_104 = null;
      IStrategoTerm m_104 = null;
      IStrategoTerm o_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      l_104 = term.getSubterm(0);
      m_104 = term.getSubterm(1);
      IStrategoList annos70 = term.getAnnotations();
      n_104 = annos70;
      term = f_15.invoke(context, l_104);
      if(term == null)
        break Fail80;
      o_104 = term;
      term = g_15.invoke(context, m_104);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoCong_2, new IStrategoTerm[]{o_104, term}), checkListAnnos(termFactory, n_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}