package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unquoted_1_0 extends Strategy 
{ 
  public static unquoted_1_0 instance = new unquoted_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unquoted_1_0");
    Fail180:
    { 
      IStrategoTerm q_130 = null;
      IStrategoTerm o_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consunquoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail180;
      o_130 = term.getSubterm(0);
      IStrategoList annos149 = term.getAnnotations();
      q_130 = annos149;
      term = n_25.invoke(context, o_130);
      if(term == null)
        break Fail180;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consunquoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}