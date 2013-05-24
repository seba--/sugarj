package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Token_1_0 extends Strategy 
{ 
  public static $Token_1_0 instance = new $Token_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Token_1_0");
    Fail791:
    { 
      IStrategoTerm s_432 = null;
      IStrategoTerm r_432 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consToken_1 != ((IStrategoAppl)term).getConstructor())
        break Fail791;
      r_432 = term.getSubterm(0);
      IStrategoList annos55 = term.getAnnotations();
      s_432 = annos55;
      term = b_337.invoke(context, r_432);
      if(term == null)
        break Fail791;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consToken_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_432));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}