package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class default_1_0 extends Strategy 
{ 
  public static default_1_0 instance = new default_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("default_1_0");
    Fail1029:
    { 
      IStrategoTerm t_465 = null;
      IStrategoTerm s_465 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consdefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1029;
      s_465 = term.getSubterm(0);
      IStrategoList annos256 = term.getAnnotations();
      t_465 = annos256;
      term = w_349.invoke(context, s_465);
      if(term == null)
        break Fail1029;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consdefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_465));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}