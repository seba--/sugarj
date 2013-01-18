package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import$Term_1_0 extends Strategy 
{ 
  public static $Import$Term_1_0 instance = new $Import$Term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportTerm_1_0");
    Fail332:
    { 
      IStrategoTerm y_190 = null;
      IStrategoTerm x_190 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImportTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail332;
      x_190 = term.getSubterm(0);
      IStrategoList annos278 = term.getAnnotations();
      y_190 = annos278;
      term = l_46.invoke(context, x_190);
      if(term == null)
        break Fail332;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImportTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_190));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}