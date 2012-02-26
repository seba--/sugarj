package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $String_1_0 extends Strategy 
{ 
  public static $String_1_0 instance = new $String_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("String_1_0");
    Fail186:
    { 
      IStrategoTerm s_133 = null;
      IStrategoTerm p_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consString_1 != ((IStrategoAppl)term).getConstructor())
        break Fail186;
      p_133 = term.getSubterm(0);
      IStrategoList annos158 = term.getAnnotations();
      s_133 = annos158;
      term = j_26.invoke(context, p_133);
      if(term == null)
        break Fail186;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consString_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}