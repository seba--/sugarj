package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Try_2_0 extends Strategy 
{ 
  public static $Try_2_0 instance = new $Try_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_20, Strategy c_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_2_0");
    Fail78:
    { 
      IStrategoTerm q_113 = null;
      IStrategoTerm n_113 = null;
      IStrategoTerm o_113 = null;
      IStrategoTerm r_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTry_2 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      n_113 = term.getSubterm(0);
      o_113 = term.getSubterm(1);
      IStrategoList annos61 = term.getAnnotations();
      q_113 = annos61;
      term = b_20.invoke(context, n_113);
      if(term == null)
        break Fail78;
      r_113 = term;
      term = c_20.invoke(context, o_113);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTry_2, new IStrategoTerm[]{r_113, term}), checkListAnnos(termFactory, q_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}