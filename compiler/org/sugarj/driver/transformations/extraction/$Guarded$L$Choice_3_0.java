package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_347, Strategy s_347, Strategy t_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GuardedLChoice_3_0");
    Fail978:
    { 
      IStrategoTerm z_459 = null;
      IStrategoTerm w_459 = null;
      IStrategoTerm x_459 = null;
      IStrategoTerm y_459 = null;
      IStrategoTerm a_460 = null;
      IStrategoTerm b_460 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail978;
      w_459 = term.getSubterm(0);
      x_459 = term.getSubterm(1);
      y_459 = term.getSubterm(2);
      IStrategoList annos218 = term.getAnnotations();
      z_459 = annos218;
      term = r_347.invoke(context, w_459);
      if(term == null)
        break Fail978;
      a_460 = term;
      term = s_347.invoke(context, x_459);
      if(term == null)
        break Fail978;
      b_460 = term;
      term = t_347.invoke(context, y_459);
      if(term == null)
        break Fail978;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consGuardedLChoice_3, new IStrategoTerm[]{a_460, b_460, term}), checkListAnnos(termFactory, z_459));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}