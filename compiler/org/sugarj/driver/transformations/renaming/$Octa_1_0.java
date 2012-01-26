package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Octa_1_0 extends Strategy 
{ 
  public static $Octa_1_0 instance = new $Octa_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Octa_1_0");
    Fail190:
    { 
      IStrategoTerm o_133 = null;
      IStrategoTerm n_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consOcta_1 != ((IStrategoAppl)term).getConstructor())
        break Fail190;
      n_133 = term.getSubterm(0);
      IStrategoList annos163 = term.getAnnotations();
      o_133 = annos163;
      term = z_25.invoke(context, n_133);
      if(term == null)
        break Fail190;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consOcta_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}