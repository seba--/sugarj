package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cong$Q_2_0 extends Strategy 
{ 
  public static $Cong$Q_2_0 instance = new $Cong$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_343, Strategy n_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CongQ_2_0");
    Fail907:
    { 
      IStrategoTerm b_449 = null;
      IStrategoTerm z_448 = null;
      IStrategoTerm a_449 = null;
      IStrategoTerm c_449 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCongQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail907;
      z_448 = term.getSubterm(0);
      a_449 = term.getSubterm(1);
      IStrategoList annos153 = term.getAnnotations();
      b_449 = annos153;
      term = m_343.invoke(context, z_448);
      if(term == null)
        break Fail907;
      c_449 = term;
      term = n_343.invoke(context, a_449);
      if(term == null)
        break Fail907;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCongQ_2, new IStrategoTerm[]{c_449, term}), checkListAnnos(termFactory, b_449));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}