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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_23, Strategy c_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyAnd_2_0");
    Fail122:
    { 
      IStrategoTerm a_122 = null;
      IStrategoTerm y_121 = null;
      IStrategoTerm z_121 = null;
      IStrategoTerm b_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      y_121 = term.getSubterm(0);
      z_121 = term.getSubterm(1);
      IStrategoList annos102 = term.getAnnotations();
      a_122 = annos102;
      term = b_23.invoke(context, y_121);
      if(term == null)
        break Fail122;
      b_122 = term;
      term = c_23.invoke(context, z_121);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLazyAnd_2, new IStrategoTerm[]{b_122, term}), checkListAnnos(termFactory, a_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}