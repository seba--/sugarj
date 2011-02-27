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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("negative_1_0");
    Fail267:
    { 
      IStrategoTerm o_149 = null;
      IStrategoTerm n_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consnegative_1 != ((IStrategoAppl)term).getConstructor())
        break Fail267;
      n_149 = term.getSubterm(0);
      IStrategoList annos222 = term.getAnnotations();
      o_149 = annos222;
      term = x_29.invoke(context, n_149);
      if(term == null)
        break Fail267;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consnegative_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}