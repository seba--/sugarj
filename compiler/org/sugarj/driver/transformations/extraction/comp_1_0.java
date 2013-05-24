package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class comp_1_0 extends Strategy 
{ 
  public static comp_1_0 instance = new comp_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("comp_1_0");
    Fail1019:
    { 
      IStrategoTerm y_464 = null;
      IStrategoTerm x_464 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conscomp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1019;
      x_464 = term.getSubterm(0);
      IStrategoList annos251 = term.getAnnotations();
      y_464 = annos251;
      term = o_349.invoke(context, x_464);
      if(term == null)
        break Fail1019;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conscomp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_464));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}