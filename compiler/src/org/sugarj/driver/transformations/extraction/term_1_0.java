package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class term_1_0 extends Strategy 
{ 
  public static term_1_0 instance = new term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("term_1_0");
    Fail253:
    { 
      IStrategoTerm i_145 = null;
      IStrategoTerm h_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consterm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail253;
      h_145 = term.getSubterm(0);
      IStrategoList annos205 = term.getAnnotations();
      i_145 = annos205;
      term = t_28.invoke(context, h_145);
      if(term == null)
        break Fail253;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consterm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}