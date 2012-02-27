package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Invoke_2_0 extends Strategy 
{ 
  public static $Invoke_2_0 instance = new $Invoke_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_24, Strategy u_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Invoke_2_0");
    Fail148:
    { 
      IStrategoTerm y_126 = null;
      IStrategoTerm w_126 = null;
      IStrategoTerm x_126 = null;
      IStrategoTerm z_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInvoke_2 != ((IStrategoAppl)term).getConstructor())
        break Fail148;
      w_126 = term.getSubterm(0);
      x_126 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      y_126 = annos128;
      term = t_24.invoke(context, w_126);
      if(term == null)
        break Fail148;
      z_126 = term;
      term = u_24.invoke(context, x_126);
      if(term == null)
        break Fail148;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInvoke_2, new IStrategoTerm[]{z_126, term}), checkListAnnos(termFactory, y_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}