package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $All_1_0 extends Strategy 
{ 
  public static $All_1_0 instance = new $All_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("All_1_0");
    Fail124:
    { 
      IStrategoTerm x_120 = null;
      IStrategoTerm v_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consAll_1 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      v_120 = term.getSubterm(0);
      IStrategoList annos96 = term.getAnnotations();
      x_120 = annos96;
      term = j_22.invoke(context, v_120);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consAll_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}