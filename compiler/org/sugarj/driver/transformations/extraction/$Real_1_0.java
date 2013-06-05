package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real_1_0 extends Strategy 
{ 
  public static $Real_1_0 instance = new $Real_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Real_1_0");
    Fail170:
    { 
      IStrategoTerm r_128 = null;
      IStrategoTerm o_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consReal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail170;
      o_128 = term.getSubterm(0);
      IStrategoList annos139 = term.getAnnotations();
      r_128 = annos139;
      term = z_24.invoke(context, o_128);
      if(term == null)
        break Fail170;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consReal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}