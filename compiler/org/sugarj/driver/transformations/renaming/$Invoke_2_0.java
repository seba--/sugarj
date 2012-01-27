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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_23, Strategy x_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Invoke_2_0");
    Fail143:
    { 
      IStrategoTerm a_126 = null;
      IStrategoTerm y_125 = null;
      IStrategoTerm z_125 = null;
      IStrategoTerm b_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInvoke_2 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      y_125 = term.getSubterm(0);
      z_125 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      a_126 = annos128;
      term = w_23.invoke(context, y_125);
      if(term == null)
        break Fail143;
      b_126 = term;
      term = x_23.invoke(context, z_125);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInvoke_2, new IStrategoTerm[]{b_126, term}), checkListAnnos(termFactory, a_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}