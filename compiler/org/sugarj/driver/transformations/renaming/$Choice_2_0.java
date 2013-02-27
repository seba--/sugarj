package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Choice_2_0 extends Strategy 
{ 
  public static $Choice_2_0 instance = new $Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_14, Strategy o_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Choice_2_0");
    Fail72:
    { 
      IStrategoTerm y_102 = null;
      IStrategoTerm w_102 = null;
      IStrategoTerm x_102 = null;
      IStrategoTerm z_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      w_102 = term.getSubterm(0);
      x_102 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      y_102 = annos62;
      term = n_14.invoke(context, w_102);
      if(term == null)
        break Fail72;
      z_102 = term;
      term = o_14.invoke(context, x_102);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChoice_2, new IStrategoTerm[]{z_102, term}), checkListAnnos(termFactory, y_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}