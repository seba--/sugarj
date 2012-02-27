package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Left$Shift_2_0 extends Strategy 
{ 
  public static $Left$Shift_2_0 instance = new $Left$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_23, Strategy u_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LeftShift_2_0");
    Fail131:
    { 
      IStrategoTerm w_123 = null;
      IStrategoTerm u_123 = null;
      IStrategoTerm v_123 = null;
      IStrategoTerm x_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      u_123 = term.getSubterm(0);
      v_123 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      w_123 = annos111;
      term = t_23.invoke(context, u_123);
      if(term == null)
        break Fail131;
      x_123 = term;
      term = u_23.invoke(context, v_123);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLeftShift_2, new IStrategoTerm[]{x_123, term}), checkListAnnos(termFactory, w_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}