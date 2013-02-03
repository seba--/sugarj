package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Guarded$L$Choice_3_0 extends Strategy 
{ 
  public static $Guarded$L$Choice_3_0 instance = new $Guarded$L$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_16, Strategy k_16, Strategy l_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GuardedLChoice_3_0");
    Fail101:
    { 
      IStrategoTerm z_107 = null;
      IStrategoTerm w_107 = null;
      IStrategoTerm x_107 = null;
      IStrategoTerm y_107 = null;
      IStrategoTerm a_108 = null;
      IStrategoTerm b_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      w_107 = term.getSubterm(0);
      x_107 = term.getSubterm(1);
      y_107 = term.getSubterm(2);
      IStrategoList annos91 = term.getAnnotations();
      z_107 = annos91;
      term = j_16.invoke(context, w_107);
      if(term == null)
        break Fail101;
      a_108 = term;
      term = k_16.invoke(context, x_107);
      if(term == null)
        break Fail101;
      b_108 = term;
      term = l_16.invoke(context, y_107);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGuardedLChoice_3, new IStrategoTerm[]{a_108, b_108, term}), checkListAnnos(termFactory, z_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}