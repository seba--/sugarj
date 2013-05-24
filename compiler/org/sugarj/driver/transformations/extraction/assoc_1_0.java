package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class assoc_1_0 extends Strategy 
{ 
  public static assoc_1_0 instance = new assoc_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_1_0");
    Fail1028:
    { 
      IStrategoTerm q_465 = null;
      IStrategoTerm p_465 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consassoc_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1028;
      p_465 = term.getSubterm(0);
      IStrategoList annos255 = term.getAnnotations();
      q_465 = annos255;
      term = v_349.invoke(context, p_465);
      if(term == null)
        break Fail1028;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consassoc_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_465));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}