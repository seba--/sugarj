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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportTerm_1_0");
    Fail123:
    { 
      IStrategoTerm s_120 = null;
      IStrategoTerm r_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consImportTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      r_120 = term.getSubterm(0);
      IStrategoList annos95 = term.getAnnotations();
      s_120 = annos95;
      term = i_22.invoke(context, r_120);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consImportTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}