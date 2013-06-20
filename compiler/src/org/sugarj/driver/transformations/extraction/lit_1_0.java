package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lit_1_0 extends Strategy 
{ 
  public static lit_1_0 instance = new lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lit_1_0");
    Fail227:
    { 
      IStrategoTerm j_140 = null;
      IStrategoTerm f_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conslit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail227;
      f_140 = term.getSubterm(0);
      IStrategoList annos185 = term.getAnnotations();
      j_140 = annos185;
      term = o_27.invoke(context, f_140);
      if(term == null)
        break Fail227;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conslit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}