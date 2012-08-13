package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Dec_2_0 extends Strategy 
{ 
  public static $Interface$Dec_2_0 instance = new $Interface$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_21, Strategy v_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDec_2_0");
    Fail88:
    { 
      IStrategoTerm y_116 = null;
      IStrategoTerm w_116 = null;
      IStrategoTerm x_116 = null;
      IStrategoTerm z_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail88;
      w_116 = term.getSubterm(0);
      x_116 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      y_116 = annos69;
      term = u_21.invoke(context, w_116);
      if(term == null)
        break Fail88;
      z_116 = term;
      term = v_21.invoke(context, x_116);
      if(term == null)
        break Fail88;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceDec_2, new IStrategoTerm[]{z_116, term}), checkListAnnos(termFactory, y_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}