package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Explode_2_0 extends Strategy 
{ 
  public static $Explode_2_0 instance = new $Explode_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_24, Strategy t_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Explode_2_0");
    Fail166:
    { 
      IStrategoTerm y_127 = null;
      IStrategoTerm w_127 = null;
      IStrategoTerm x_127 = null;
      IStrategoTerm z_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consExplode_2 != ((IStrategoAppl)term).getConstructor())
        break Fail166;
      w_127 = term.getSubterm(0);
      x_127 = term.getSubterm(1);
      IStrategoList annos135 = term.getAnnotations();
      y_127 = annos135;
      term = s_24.invoke(context, w_127);
      if(term == null)
        break Fail166;
      z_127 = term;
      term = t_24.invoke(context, x_127);
      if(term == null)
        break Fail166;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consExplode_2, new IStrategoTerm[]{z_127, term}), checkListAnnos(termFactory, y_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}