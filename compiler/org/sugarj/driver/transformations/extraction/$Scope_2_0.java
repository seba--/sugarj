package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope_2_0 extends Strategy 
{ 
  public static $Scope_2_0 instance = new $Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_22, Strategy v_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_2_0");
    Fail117:
    { 
      IStrategoTerm y_121 = null;
      IStrategoTerm w_121 = null;
      IStrategoTerm x_121 = null;
      IStrategoTerm z_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      w_121 = term.getSubterm(0);
      x_121 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      y_121 = annos93;
      term = u_22.invoke(context, w_121);
      if(term == null)
        break Fail117;
      z_121 = term;
      term = v_22.invoke(context, x_121);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consScope_2, new IStrategoTerm[]{z_121, term}), checkListAnnos(termFactory, y_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}