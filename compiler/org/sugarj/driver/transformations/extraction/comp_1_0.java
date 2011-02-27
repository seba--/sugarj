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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("comp_1_0");
    Fail175:
    { 
      IStrategoTerm e_132 = null;
      IStrategoTerm d_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conscomp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail175;
      d_132 = term.getSubterm(0);
      IStrategoList annos148 = term.getAnnotations();
      e_132 = annos148;
      term = y_25.invoke(context, d_132);
      if(term == null)
        break Fail175;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conscomp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}