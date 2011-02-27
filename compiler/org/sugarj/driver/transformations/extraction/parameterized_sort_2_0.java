package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parameterized_sort_2_0 extends Strategy 
{ 
  public static parameterized_sort_2_0 instance = new parameterized_sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_27, Strategy p_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parameterized_sort_2_0");
    Fail215:
    { 
      IStrategoTerm c_140 = null;
      IStrategoTerm x_139 = null;
      IStrategoTerm y_139 = null;
      IStrategoTerm d_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consparameterized_sort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail215;
      x_139 = term.getSubterm(0);
      y_139 = term.getSubterm(1);
      IStrategoList annos177 = term.getAnnotations();
      c_140 = annos177;
      term = o_27.invoke(context, x_139);
      if(term == null)
        break Fail215;
      d_140 = term;
      term = p_27.invoke(context, y_139);
      if(term == null)
        break Fail215;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consparameterized_sort_2, new IStrategoTerm[]{d_140, term}), checkListAnnos(termFactory, c_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}