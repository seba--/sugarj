package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail185:
    { 
      IStrategoTerm t_132 = null;
      IStrategoTerm q_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail185;
      q_132 = term.getSubterm(0);
      IStrategoList annos160 = term.getAnnotations();
      t_132 = annos160;
      term = w_25.invoke(context, q_132);
      if(term == null)
        break Fail185;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}