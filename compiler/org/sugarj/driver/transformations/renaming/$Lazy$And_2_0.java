package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lazy$And_2_0 extends Strategy 
{ 
  public static $Lazy$And_2_0 instance = new $Lazy$And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_22, Strategy f_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyAnd_2_0");
    Fail117:
    { 
      IStrategoTerm y_120 = null;
      IStrategoTerm v_120 = null;
      IStrategoTerm x_120 = null;
      IStrategoTerm z_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      v_120 = term.getSubterm(0);
      x_120 = term.getSubterm(1);
      IStrategoList annos102 = term.getAnnotations();
      y_120 = annos102;
      term = e_22.invoke(context, v_120);
      if(term == null)
        break Fail117;
      z_120 = term;
      term = f_22.invoke(context, x_120);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLazyAnd_2, new IStrategoTerm[]{z_120, term}), checkListAnnos(termFactory, y_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}