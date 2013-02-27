package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_18, Strategy i_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Explode_2_0");
    Fail141:
    { 
      IStrategoTerm y_113 = null;
      IStrategoTerm w_113 = null;
      IStrategoTerm x_113 = null;
      IStrategoTerm z_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExplode_2 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      w_113 = term.getSubterm(0);
      x_113 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      y_113 = annos127;
      term = h_18.invoke(context, w_113);
      if(term == null)
        break Fail141;
      z_113 = term;
      term = i_18.invoke(context, x_113);
      if(term == null)
        break Fail141;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExplode_2, new IStrategoTerm[]{z_113, term}), checkListAnnos(termFactory, y_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}