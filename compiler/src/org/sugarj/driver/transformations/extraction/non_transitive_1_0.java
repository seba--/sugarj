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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("non_transitive_1_0");
    Fail205:
    { 
      IStrategoTerm w_136 = null;
      IStrategoTerm v_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consnon_transitive_1 != ((IStrategoAppl)term).getConstructor())
        break Fail205;
      v_136 = term.getSubterm(0);
      IStrategoList annos169 = term.getAnnotations();
      w_136 = annos169;
      term = q_26.invoke(context, v_136);
      if(term == null)
        break Fail205;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consnon_transitive_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}