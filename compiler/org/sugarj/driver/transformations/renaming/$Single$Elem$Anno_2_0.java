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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_20, Strategy i_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SingleElemAnno_2_0");
    Fail69:
    { 
      IStrategoTerm x_112 = null;
      IStrategoTerm v_112 = null;
      IStrategoTerm w_112 = null;
      IStrategoTerm y_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSingleElemAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      v_112 = term.getSubterm(0);
      w_112 = term.getSubterm(1);
      IStrategoList annos50 = term.getAnnotations();
      x_112 = annos50;
      term = h_20.invoke(context, v_112);
      if(term == null)
        break Fail69;
      y_112 = term;
      term = i_20.invoke(context, w_112);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSingleElemAnno_2, new IStrategoTerm[]{y_112, term}), checkListAnnos(termFactory, x_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}