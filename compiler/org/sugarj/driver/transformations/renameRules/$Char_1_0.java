package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail135:
    { 
      IStrategoTerm s_113 = null;
      IStrategoTerm r_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      r_113 = term.getSubterm(0);
      IStrategoList annos125 = term.getAnnotations();
      s_113 = annos125;
      term = g_18.invoke(context, r_113);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}