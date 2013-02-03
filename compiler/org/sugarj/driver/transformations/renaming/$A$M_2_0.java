package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $A$M_2_0 extends Strategy 
{ 
  public static $A$M_2_0 instance = new $A$M_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_14, Strategy g_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AM_2_0");
    Fail65:
    { 
      IStrategoTerm w_101 = null;
      IStrategoTerm u_101 = null;
      IStrategoTerm v_101 = null;
      IStrategoTerm x_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAM_2 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      u_101 = term.getSubterm(0);
      v_101 = term.getSubterm(1);
      IStrategoList annos56 = term.getAnnotations();
      w_101 = annos56;
      term = f_14.invoke(context, u_101);
      if(term == null)
        break Fail65;
      x_101 = term;
      term = g_14.invoke(context, v_101);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAM_2, new IStrategoTerm[]{x_101, term}), checkListAnnos(termFactory, w_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}