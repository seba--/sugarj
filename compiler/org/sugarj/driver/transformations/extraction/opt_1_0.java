package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class opt_1_0 extends Strategy 
{ 
  public static opt_1_0 instance = new opt_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("opt_1_0");
    Fail225:
    { 
      IStrategoTerm d_143 = null;
      IStrategoTerm c_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consopt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail225;
      c_143 = term.getSubterm(0);
      IStrategoList annos187 = term.getAnnotations();
      d_143 = annos187;
      term = e_28.invoke(context, c_143);
      if(term == null)
        break Fail225;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consopt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}