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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("positive_1_0");
    Fail280:
    { 
      IStrategoTerm u_149 = null;
      IStrategoTerm t_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conspositive_1 != ((IStrategoAppl)term).getConstructor())
        break Fail280;
      t_149 = term.getSubterm(0);
      IStrategoList annos231 = term.getAnnotations();
      u_149 = annos231;
      term = x_29.invoke(context, t_149);
      if(term == null)
        break Fail280;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conspositive_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}