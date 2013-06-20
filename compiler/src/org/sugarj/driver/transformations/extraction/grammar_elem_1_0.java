package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class grammar_elem_1_0 extends Strategy 
{ 
  public static grammar_elem_1_0 instance = new grammar_elem_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("grammar_elem_1_0");
    Fail30:
    { 
      IStrategoTerm u_102 = null;
      IStrategoTerm t_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consgrammar_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      t_102 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      u_102 = annos3;
      term = x_15.invoke(context, t_102);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consgrammar_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}