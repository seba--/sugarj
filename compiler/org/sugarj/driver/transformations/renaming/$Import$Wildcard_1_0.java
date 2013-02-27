package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import$Wildcard_1_0 extends Strategy 
{ 
  public static $Import$Wildcard_1_0 instance = new $Import$Wildcard_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportWildcard_1_0");
    Fail40:
    { 
      IStrategoTerm y_95 = null;
      IStrategoTerm x_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImportWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      x_95 = term.getSubterm(0);
      IStrategoList annos30 = term.getAnnotations();
      y_95 = annos30;
      term = z_11.invoke(context, x_95);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImportWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}