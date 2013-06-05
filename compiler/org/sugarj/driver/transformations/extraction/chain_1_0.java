package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class chain_1_0 extends Strategy 
{ 
  public static chain_1_0 instance = new chain_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_1_0");
    Fail200:
    { 
      IStrategoTerm r_135 = null;
      IStrategoTerm o_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conschain_1 != ((IStrategoAppl)term).getConstructor())
        break Fail200;
      o_135 = term.getSubterm(0);
      IStrategoList annos164 = term.getAnnotations();
      r_135 = annos164;
      term = j_26.invoke(context, o_135);
      if(term == null)
        break Fail200;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conschain_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}