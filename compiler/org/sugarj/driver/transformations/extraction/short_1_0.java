package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class short_1_0 extends Strategy 
{ 
  public static short_1_0 instance = new short_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("short_1_0");
    Fail197:
    { 
      IStrategoTerm x_133 = null;
      IStrategoTerm u_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consshort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail197;
      u_133 = term.getSubterm(0);
      IStrategoList annos161 = term.getAnnotations();
      x_133 = annos161;
      term = e_26.invoke(context, u_133);
      if(term == null)
        break Fail197;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consshort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}