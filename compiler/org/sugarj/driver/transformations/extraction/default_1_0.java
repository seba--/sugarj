package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class default_1_0 extends Strategy 
{ 
  public static default_1_0 instance = new default_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("default_1_0");
    Fail206:
    { 
      IStrategoTerm b_137 = null;
      IStrategoTerm a_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consdefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail206;
      a_137 = term.getSubterm(0);
      IStrategoList annos170 = term.getAnnotations();
      b_137 = annos170;
      term = r_26.invoke(context, a_137);
      if(term == null)
        break Fail206;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consdefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}