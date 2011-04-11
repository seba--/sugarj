package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class cf_1_0 extends Strategy 
{ 
  public static cf_1_0 instance = new cf_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("cf_1_0");
    Fail230:
    { 
      IStrategoTerm o_143 = null;
      IStrategoTerm n_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conscf_1 != ((IStrategoAppl)term).getConstructor())
        break Fail230;
      n_143 = term.getSubterm(0);
      IStrategoList annos190 = term.getAnnotations();
      o_143 = annos190;
      term = h_28.invoke(context, n_143);
      if(term == null)
        break Fail230;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conscf_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}