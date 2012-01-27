package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method_3_0 extends Strategy 
{ 
  public static $Method_3_0 instance = new $Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_14, Strategy s_14, Strategy t_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_3_0");
    Fail22:
    { 
      IStrategoTerm w_100 = null;
      IStrategoTerm t_100 = null;
      IStrategoTerm u_100 = null;
      IStrategoTerm v_100 = null;
      IStrategoTerm x_100 = null;
      IStrategoTerm y_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      t_100 = term.getSubterm(0);
      u_100 = term.getSubterm(1);
      v_100 = term.getSubterm(2);
      IStrategoList annos13 = term.getAnnotations();
      w_100 = annos13;
      term = r_14.invoke(context, t_100);
      if(term == null)
        break Fail22;
      x_100 = term;
      term = s_14.invoke(context, u_100);
      if(term == null)
        break Fail22;
      y_100 = term;
      term = t_14.invoke(context, v_100);
      if(term == null)
        break Fail22;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethod_3, new IStrategoTerm[]{x_100, y_100, term}), checkListAnnos(termFactory, w_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}