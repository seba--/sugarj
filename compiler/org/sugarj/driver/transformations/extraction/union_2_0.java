package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class union_2_0 extends Strategy 
{ 
  public static union_2_0 instance = new union_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_25, Strategy s_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("union_2_0");
    Fail184:
    { 
      IStrategoTerm l_131 = null;
      IStrategoTerm i_131 = null;
      IStrategoTerm j_131 = null;
      IStrategoTerm n_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consunion_2 != ((IStrategoAppl)term).getConstructor())
        break Fail184;
      i_131 = term.getSubterm(0);
      j_131 = term.getSubterm(1);
      IStrategoList annos153 = term.getAnnotations();
      l_131 = annos153;
      term = r_25.invoke(context, i_131);
      if(term == null)
        break Fail184;
      n_131 = term;
      term = s_25.invoke(context, j_131);
      if(term == null)
        break Fail184;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consunion_2, new IStrategoTerm[]{n_131, term}), checkListAnnos(termFactory, l_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}