package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportTerm_1_0");
    Fail112:
    { 
      IStrategoTerm p_120 = null;
      IStrategoTerm o_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consImportTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      o_120 = term.getSubterm(0);
      IStrategoList annos87 = term.getAnnotations();
      p_120 = annos87;
      term = j_22.invoke(context, o_120);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consImportTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}