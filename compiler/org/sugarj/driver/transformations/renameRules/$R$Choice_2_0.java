package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_14, Strategy n_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RChoice_2_0");
    Fail67:
    { 
      IStrategoTerm u_102 = null;
      IStrategoTerm s_102 = null;
      IStrategoTerm t_102 = null;
      IStrategoTerm v_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      s_102 = term.getSubterm(0);
      t_102 = term.getSubterm(1);
      IStrategoList annos61 = term.getAnnotations();
      u_102 = annos61;
      term = m_14.invoke(context, s_102);
      if(term == null)
        break Fail67;
      v_102 = term;
      term = n_14.invoke(context, t_102);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRChoice_2, new IStrategoTerm[]{v_102, term}), checkListAnnos(termFactory, u_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}