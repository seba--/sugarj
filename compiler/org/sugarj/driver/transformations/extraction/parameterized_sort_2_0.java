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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_27, Strategy o_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parameterized_sort_2_0");
    Fail227:
    { 
      IStrategoTerm f_140 = null;
      IStrategoTerm a_140 = null;
      IStrategoTerm e_140 = null;
      IStrategoTerm j_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consparameterized_sort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail227;
      a_140 = term.getSubterm(0);
      e_140 = term.getSubterm(1);
      IStrategoList annos185 = term.getAnnotations();
      f_140 = annos185;
      term = n_27.invoke(context, a_140);
      if(term == null)
        break Fail227;
      j_140 = term;
      term = o_27.invoke(context, e_140);
      if(term == null)
        break Fail227;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consparameterized_sort_2, new IStrategoTerm[]{j_140, term}), checkListAnnos(termFactory, f_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}