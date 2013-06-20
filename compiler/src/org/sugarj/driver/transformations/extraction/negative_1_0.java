package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class negative_1_0 extends Strategy 
{ 
  public static negative_1_0 instance = new negative_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("negative_1_0");
    Fail280:
    { 
      IStrategoTerm w_149 = null;
      IStrategoTerm v_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consnegative_1 != ((IStrategoAppl)term).getConstructor())
        break Fail280;
      v_149 = term.getSubterm(0);
      IStrategoList annos231 = term.getAnnotations();
      w_149 = annos231;
      term = y_29.invoke(context, v_149);
      if(term == null)
        break Fail280;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consnegative_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}