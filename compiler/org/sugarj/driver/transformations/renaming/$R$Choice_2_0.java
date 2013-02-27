package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Choice_2_0 extends Strategy 
{ 
  public static $R$Choice_2_0 instance = new $R$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_14, Strategy m_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RChoice_2_0");
    Fail71:
    { 
      IStrategoTerm t_102 = null;
      IStrategoTerm r_102 = null;
      IStrategoTerm s_102 = null;
      IStrategoTerm u_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      r_102 = term.getSubterm(0);
      s_102 = term.getSubterm(1);
      IStrategoList annos61 = term.getAnnotations();
      t_102 = annos61;
      term = l_14.invoke(context, r_102);
      if(term == null)
        break Fail71;
      u_102 = term;
      term = m_14.invoke(context, s_102);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRChoice_2, new IStrategoTerm[]{u_102, term}), checkListAnnos(termFactory, t_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}