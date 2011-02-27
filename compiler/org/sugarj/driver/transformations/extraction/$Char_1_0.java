package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Char_1_0 extends Strategy 
{ 
  public static $Char_1_0 instance = new $Char_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail152:
    { 
      IStrategoTerm o_127 = null;
      IStrategoTerm n_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail152;
      n_127 = term.getSubterm(0);
      IStrategoList annos125 = term.getAnnotations();
      o_127 = annos125;
      term = r_24.invoke(context, n_127);
      if(term == null)
        break Fail152;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}