package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_2_0 extends Strategy 
{ 
  public static $Minus_2_0 instance = new $Minus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_28, Strategy z_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_2_0");
    Fail178:
    { 
      IStrategoTerm u_140 = null;
      IStrategoTerm m_140 = null;
      IStrategoTerm q_140 = null;
      IStrategoTerm v_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail178;
      m_140 = term.getSubterm(0);
      q_140 = term.getSubterm(1);
      IStrategoList annos153 = term.getAnnotations();
      u_140 = annos153;
      term = y_28.invoke(context, m_140);
      if(term == null)
        break Fail178;
      v_140 = term;
      term = z_28.invoke(context, q_140);
      if(term == null)
        break Fail178;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMinus_2, new IStrategoTerm[]{v_140, term}), checkListAnnos(termFactory, u_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}