package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class module_1_0 extends Strategy 
{ 
  public static module_1_0 instance = new module_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("module_1_0");
    Fail212:
    { 
      IStrategoTerm k_137 = null;
      IStrategoTerm j_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consmodule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail212;
      j_137 = term.getSubterm(0);
      IStrategoList annos172 = term.getAnnotations();
      k_137 = annos172;
      term = u_26.invoke(context, j_137);
      if(term == null)
        break Fail212;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consmodule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}