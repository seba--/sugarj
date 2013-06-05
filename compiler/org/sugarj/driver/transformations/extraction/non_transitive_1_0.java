package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class non_transitive_1_0 extends Strategy 
{ 
  public static non_transitive_1_0 instance = new non_transitive_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("non_transitive_1_0");
    Fail204:
    { 
      IStrategoTerm q_136 = null;
      IStrategoTerm p_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consnon_transitive_1 != ((IStrategoAppl)term).getConstructor())
        break Fail204;
      p_136 = term.getSubterm(0);
      IStrategoList annos168 = term.getAnnotations();
      q_136 = annos168;
      term = o_26.invoke(context, p_136);
      if(term == null)
        break Fail204;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consnon_transitive_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}