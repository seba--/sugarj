package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class range_2_0 extends Strategy 
{ 
  public static range_2_0 instance = new range_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_349, Strategy j_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("range_2_0");
    Fail1014:
    { 
      IStrategoTerm j_464 = null;
      IStrategoTerm h_464 = null;
      IStrategoTerm i_464 = null;
      IStrategoTerm k_464 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consrange_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1014;
      h_464 = term.getSubterm(0);
      i_464 = term.getSubterm(1);
      IStrategoList annos247 = term.getAnnotations();
      j_464 = annos247;
      term = i_349.invoke(context, h_464);
      if(term == null)
        break Fail1014;
      k_464 = term;
      term = j_349.invoke(context, i_464);
      if(term == null)
        break Fail1014;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consrange_2, new IStrategoTerm[]{k_464, term}), checkListAnnos(termFactory, j_464));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}