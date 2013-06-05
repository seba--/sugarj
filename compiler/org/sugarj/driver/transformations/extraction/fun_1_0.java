package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fun_1_0 extends Strategy 
{ 
  public static fun_1_0 instance = new fun_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fun_1_0");
    Fail275:
    { 
      IStrategoTerm b_149 = null;
      IStrategoTerm a_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consfun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail275;
      a_149 = term.getSubterm(0);
      IStrategoList annos226 = term.getAnnotations();
      b_149 = annos226;
      term = q_29.invoke(context, a_149);
      if(term == null)
        break Fail275;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consfun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}