package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rules_1_0 extends Strategy 
{ 
  public static $Rules_1_0 instance = new $Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rules_1_0");
    Fail280:
    { 
      IStrategoTerm j_181 = null;
      IStrategoTerm i_181 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail280;
      i_181 = term.getSubterm(0);
      IStrategoList annos227 = term.getAnnotations();
      j_181 = annos227;
      term = v_42.invoke(context, i_181);
      if(term == null)
        break Fail280;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_181));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}