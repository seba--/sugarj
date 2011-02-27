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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("positive_1_0");
    Fail268:
    { 
      IStrategoTerm r_149 = null;
      IStrategoTerm q_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conspositive_1 != ((IStrategoAppl)term).getConstructor())
        break Fail268;
      q_149 = term.getSubterm(0);
      IStrategoList annos223 = term.getAnnotations();
      r_149 = annos223;
      term = y_29.invoke(context, q_149);
      if(term == null)
        break Fail268;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conspositive_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}