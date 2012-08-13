package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Id_1_0 extends Strategy 
{ 
  public static $Id_1_0 instance = new $Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Id_1_0");
    Fail255:
    { 
      IStrategoTerm k_152 = null;
      IStrategoTerm j_152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail255;
      j_152 = term.getSubterm(0);
      IStrategoList annos207 = term.getAnnotations();
      k_152 = annos207;
      term = c_32.invoke(context, j_152);
      if(term == null)
        break Fail255;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}