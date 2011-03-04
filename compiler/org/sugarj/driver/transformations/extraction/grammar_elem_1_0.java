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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("grammar_elem_1_0");
    Fail283:
    { 
      IStrategoTerm u_152 = null;
      IStrategoTerm p_152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consgrammar_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail283;
      p_152 = term.getSubterm(0);
      IStrategoList annos237 = term.getAnnotations();
      u_152 = annos237;
      term = v_30.invoke(context, p_152);
      if(term == null)
        break Fail283;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consgrammar_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}