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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("non_transitive_1_0");
    Fail1031:
    { 
      IStrategoTerm b_466 = null;
      IStrategoTerm a_466 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consnon_transitive_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1031;
      a_466 = term.getSubterm(0);
      IStrategoList annos258 = term.getAnnotations();
      b_466 = annos258;
      term = z_349.invoke(context, a_466);
      if(term == null)
        break Fail1031;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consnon_transitive_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_466));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}