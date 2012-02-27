package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Type_2_0 extends Strategy 
{ 
  public static $Interface$Type_2_0 instance = new $Interface$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_25, Strategy n_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceType_2_0");
    Fail157:
    { 
      IStrategoTerm x_128 = null;
      IStrategoTerm v_128 = null;
      IStrategoTerm w_128 = null;
      IStrategoTerm y_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      v_128 = term.getSubterm(0);
      w_128 = term.getSubterm(1);
      IStrategoList annos136 = term.getAnnotations();
      x_128 = annos136;
      term = m_25.invoke(context, v_128);
      if(term == null)
        break Fail157;
      y_128 = term;
      term = n_25.invoke(context, w_128);
      if(term == null)
        break Fail157;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceType_2, new IStrategoTerm[]{y_128, term}), checkListAnnos(termFactory, x_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}