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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportTerm_1_0");
    Fail97:
    { 
      IStrategoTerm c_107 = null;
      IStrategoTerm b_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImportTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      b_107 = term.getSubterm(0);
      IStrategoList annos87 = term.getAnnotations();
      c_107 = annos87;
      term = d_16.invoke(context, b_107);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImportTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}