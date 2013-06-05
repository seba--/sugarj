package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class quoted_1_0 extends Strategy 
{ 
  public static quoted_1_0 instance = new quoted_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("quoted_1_0");
    Fail181:
    { 
      IStrategoTerm w_130 = null;
      IStrategoTerm v_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consquoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail181;
      v_130 = term.getSubterm(0);
      IStrategoList annos150 = term.getAnnotations();
      w_130 = annos150;
      term = o_25.invoke(context, v_130);
      if(term == null)
        break Fail181;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consquoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}