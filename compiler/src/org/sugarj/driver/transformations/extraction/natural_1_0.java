package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class natural_1_0 extends Strategy 
{ 
  public static natural_1_0 instance = new natural_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("natural_1_0");
    Fail270:
    { 
      IStrategoTerm u_149 = null;
      IStrategoTerm t_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consnatural_1 != ((IStrategoAppl)term).getConstructor())
        break Fail270;
      t_149 = term.getSubterm(0);
      IStrategoList annos224 = term.getAnnotations();
      u_149 = annos224;
      term = z_29.invoke(context, t_149);
      if(term == null)
        break Fail270;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consnatural_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}