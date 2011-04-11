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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("quoted_1_0");
    Fail170:
    { 
      IStrategoTerm t_130 = null;
      IStrategoTerm r_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consquoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail170;
      r_130 = term.getSubterm(0);
      IStrategoList annos142 = term.getAnnotations();
      t_130 = annos142;
      term = p_25.invoke(context, r_130);
      if(term == null)
        break Fail170;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consquoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}