package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assert$Stm_2_0 extends Strategy 
{ 
  public static $Assert$Stm_2_0 instance = new $Assert$Stm_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_20, Strategy x_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssertStm_2_0");
    Fail89:
    { 
      IStrategoTerm x_115 = null;
      IStrategoTerm v_115 = null;
      IStrategoTerm w_115 = null;
      IStrategoTerm y_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      v_115 = term.getSubterm(0);
      w_115 = term.getSubterm(1);
      IStrategoList annos72 = term.getAnnotations();
      x_115 = annos72;
      term = w_20.invoke(context, v_115);
      if(term == null)
        break Fail89;
      y_115 = term;
      term = x_20.invoke(context, w_115);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssertStm_2, new IStrategoTerm[]{y_115, term}), checkListAnnos(termFactory, x_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}