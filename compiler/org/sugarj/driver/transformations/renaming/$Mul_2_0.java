package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Mul_2_0 extends Strategy 
{ 
  public static $Mul_2_0 instance = new $Mul_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_23, Strategy h_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Mul_2_0");
    Fail131:
    { 
      IStrategoTerm x_123 = null;
      IStrategoTerm v_123 = null;
      IStrategoTerm w_123 = null;
      IStrategoTerm y_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      v_123 = term.getSubterm(0);
      w_123 = term.getSubterm(1);
      IStrategoList annos116 = term.getAnnotations();
      x_123 = annos116;
      term = g_23.invoke(context, v_123);
      if(term == null)
        break Fail131;
      y_123 = term;
      term = h_23.invoke(context, w_123);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMul_2, new IStrategoTerm[]{y_123, term}), checkListAnnos(termFactory, x_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}