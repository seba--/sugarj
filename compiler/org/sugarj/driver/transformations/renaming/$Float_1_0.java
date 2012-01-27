package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Float_1_0 extends Strategy 
{ 
  public static $Float_1_0 instance = new $Float_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Float_1_0");
    Fail189:
    { 
      IStrategoTerm l_133 = null;
      IStrategoTerm j_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFloat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail189;
      j_133 = term.getSubterm(0);
      IStrategoList annos162 = term.getAnnotations();
      l_133 = annos162;
      term = y_25.invoke(context, j_133);
      if(term == null)
        break Fail189;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFloat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}