package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $As_2_0 extends Strategy 
{ 
  public static $As_2_0 instance = new $As_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_24, Strategy m_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("As_2_0");
    Fail149:
    { 
      IStrategoTerm w_126 = null;
      IStrategoTerm u_126 = null;
      IStrategoTerm v_126 = null;
      IStrategoTerm x_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consAs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail149;
      u_126 = term.getSubterm(0);
      v_126 = term.getSubterm(1);
      IStrategoList annos121 = term.getAnnotations();
      w_126 = annos121;
      term = l_24.invoke(context, u_126);
      if(term == null)
        break Fail149;
      x_126 = term;
      term = m_24.invoke(context, v_126);
      if(term == null)
        break Fail149;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consAs_2, new IStrategoTerm[]{x_126, term}), checkListAnnos(termFactory, w_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}