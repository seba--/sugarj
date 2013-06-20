package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class positive_1_0 extends Strategy 
{ 
  public static positive_1_0 instance = new positive_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("positive_1_0");
    Fail281:
    { 
      IStrategoTerm z_149 = null;
      IStrategoTerm y_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conspositive_1 != ((IStrategoAppl)term).getConstructor())
        break Fail281;
      y_149 = term.getSubterm(0);
      IStrategoList annos232 = term.getAnnotations();
      z_149 = annos232;
      term = z_29.invoke(context, y_149);
      if(term == null)
        break Fail281;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conspositive_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}