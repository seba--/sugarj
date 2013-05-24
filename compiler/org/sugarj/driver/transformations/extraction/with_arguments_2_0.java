package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class with_arguments_2_0 extends Strategy 
{ 
  public static with_arguments_2_0 instance = new with_arguments_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_349, Strategy y_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("with_arguments_2_0");
    Fail1030:
    { 
      IStrategoTerm x_465 = null;
      IStrategoTerm v_465 = null;
      IStrategoTerm w_465 = null;
      IStrategoTerm y_465 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conswith_arguments_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1030;
      v_465 = term.getSubterm(0);
      w_465 = term.getSubterm(1);
      IStrategoList annos257 = term.getAnnotations();
      x_465 = annos257;
      term = x_349.invoke(context, v_465);
      if(term == null)
        break Fail1030;
      y_465 = term;
      term = y_349.invoke(context, w_465);
      if(term == null)
        break Fail1030;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conswith_arguments_2, new IStrategoTerm[]{y_465, term}), checkListAnnos(termFactory, x_465));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}