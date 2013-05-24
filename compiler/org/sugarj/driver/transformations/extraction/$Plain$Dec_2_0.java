package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plain$Dec_2_0 extends Strategy 
{ 
  public static $Plain$Dec_2_0 instance = new $Plain$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_352, Strategy p_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PlainDec_2_0");
    Fail1082:
    { 
      IStrategoTerm a_473 = null;
      IStrategoTerm y_472 = null;
      IStrategoTerm z_472 = null;
      IStrategoTerm b_473 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPlainDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1082;
      y_472 = term.getSubterm(0);
      z_472 = term.getSubterm(1);
      IStrategoList annos304 = term.getAnnotations();
      a_473 = annos304;
      term = o_352.invoke(context, y_472);
      if(term == null)
        break Fail1082;
      b_473 = term;
      term = p_352.invoke(context, z_472);
      if(term == null)
        break Fail1082;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPlainDec_2, new IStrategoTerm[]{b_473, term}), checkListAnnos(termFactory, a_473));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}