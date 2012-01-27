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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_24, Strategy q_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceType_2_0");
    Fail152:
    { 
      IStrategoTerm x_127 = null;
      IStrategoTerm v_127 = null;
      IStrategoTerm w_127 = null;
      IStrategoTerm y_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail152;
      v_127 = term.getSubterm(0);
      w_127 = term.getSubterm(1);
      IStrategoList annos136 = term.getAnnotations();
      x_127 = annos136;
      term = p_24.invoke(context, v_127);
      if(term == null)
        break Fail152;
      y_127 = term;
      term = q_24.invoke(context, w_127);
      if(term == null)
        break Fail152;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceType_2, new IStrategoTerm[]{y_127, term}), checkListAnnos(termFactory, x_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}