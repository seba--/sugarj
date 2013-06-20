package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sorts_1_0 extends Strategy 
{ 
  public static sorts_1_0 instance = new sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sorts_1_0");
    Fail263:
    { 
      IStrategoTerm j_147 = null;
      IStrategoTerm g_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conssorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail263;
      g_147 = term.getSubterm(0);
      IStrategoList annos215 = term.getAnnotations();
      j_147 = annos215;
      term = d_29.invoke(context, g_147);
      if(term == null)
        break Fail263;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conssorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}