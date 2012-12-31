package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pre$Decr_1_0 extends Strategy 
{ 
  public static $Pre$Decr_1_0 instance = new $Pre$Decr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PreDecr_1_0");
    Fail178:
    { 
      IStrategoTerm o_166 = null;
      IStrategoTerm n_166 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail178;
      n_166 = term.getSubterm(0);
      IStrategoList annos148 = term.getAnnotations();
      o_166 = annos148;
      term = y_37.invoke(context, n_166);
      if(term == null)
        break Fail178;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPreDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_166));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}