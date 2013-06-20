package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class placeholder_1_0 extends Strategy 
{ 
  public static placeholder_1_0 instance = new placeholder_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("placeholder_1_0");
    Fail274:
    { 
      IStrategoTerm y_148 = null;
      IStrategoTerm x_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consplaceholder_1 != ((IStrategoAppl)term).getConstructor())
        break Fail274;
      x_148 = term.getSubterm(0);
      IStrategoList annos225 = term.getAnnotations();
      y_148 = annos225;
      term = p_29.invoke(context, x_148);
      if(term == null)
        break Fail274;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consplaceholder_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}