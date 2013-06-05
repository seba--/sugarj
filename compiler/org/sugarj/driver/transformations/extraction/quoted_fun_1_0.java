package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class quoted_fun_1_0 extends Strategy 
{ 
  public static quoted_fun_1_0 instance = new quoted_fun_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("quoted_fun_1_0");
    Fail182:
    { 
      IStrategoTerm z_130 = null;
      IStrategoTerm y_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consquoted_fun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail182;
      y_130 = term.getSubterm(0);
      IStrategoList annos151 = term.getAnnotations();
      z_130 = annos151;
      term = p_25.invoke(context, y_130);
      if(term == null)
        break Fail182;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consquoted_fun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}