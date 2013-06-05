package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class appl_2_0 extends Strategy 
{ 
  public static appl_2_0 instance = new appl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_29, Strategy p_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("appl_2_0");
    Fail274:
    { 
      IStrategoTerm x_148 = null;
      IStrategoTerm v_148 = null;
      IStrategoTerm w_148 = null;
      IStrategoTerm y_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail274;
      v_148 = term.getSubterm(0);
      w_148 = term.getSubterm(1);
      IStrategoList annos225 = term.getAnnotations();
      x_148 = annos225;
      term = o_29.invoke(context, v_148);
      if(term == null)
        break Fail274;
      y_148 = term;
      term = p_29.invoke(context, w_148);
      if(term == null)
        break Fail274;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consappl_2, new IStrategoTerm[]{y_148, term}), checkListAnnos(termFactory, x_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}