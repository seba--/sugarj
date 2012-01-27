package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Post$Incr_1_0 extends Strategy 
{ 
  public static $Post$Incr_1_0 instance = new $Post$Incr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostIncr_1_0");
    Fail142:
    { 
      IStrategoTerm w_125 = null;
      IStrategoTerm v_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      v_125 = term.getSubterm(0);
      IStrategoList annos127 = term.getAnnotations();
      w_125 = annos127;
      term = v_23.invoke(context, v_125);
      if(term == null)
        break Fail142;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPostIncr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}