package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Single$Elem$Anno_2_0 extends Strategy 
{ 
  public static $Single$Elem$Anno_2_0 instance = new $Single$Elem$Anno_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_14, Strategy i_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SingleElemAnno_2_0");
    Fail18:
    { 
      IStrategoTerm x_99 = null;
      IStrategoTerm v_99 = null;
      IStrategoTerm w_99 = null;
      IStrategoTerm y_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSingleElemAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      v_99 = term.getSubterm(0);
      w_99 = term.getSubterm(1);
      IStrategoList annos9 = term.getAnnotations();
      x_99 = annos9;
      term = h_14.invoke(context, v_99);
      if(term == null)
        break Fail18;
      y_99 = term;
      term = i_14.invoke(context, w_99);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSingleElemAnno_2, new IStrategoTerm[]{y_99, term}), checkListAnnos(termFactory, x_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}