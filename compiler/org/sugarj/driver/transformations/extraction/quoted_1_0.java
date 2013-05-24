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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("quoted_1_0");
    Fail995:
    { 
      IStrategoTerm f_462 = null;
      IStrategoTerm e_462 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consquoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail995;
      e_462 = term.getSubterm(0);
      IStrategoList annos232 = term.getAnnotations();
      f_462 = annos232;
      term = o_348.invoke(context, e_462);
      if(term == null)
        break Fail995;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consquoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_462));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}