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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_20, Strategy s_20, Strategy t_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_3_0");
    Fail73:
    { 
      IStrategoTerm y_113 = null;
      IStrategoTerm v_113 = null;
      IStrategoTerm w_113 = null;
      IStrategoTerm x_113 = null;
      IStrategoTerm z_113 = null;
      IStrategoTerm a_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail73;
      v_113 = term.getSubterm(0);
      w_113 = term.getSubterm(1);
      x_113 = term.getSubterm(2);
      IStrategoList annos54 = term.getAnnotations();
      y_113 = annos54;
      term = r_20.invoke(context, v_113);
      if(term == null)
        break Fail73;
      z_113 = term;
      term = s_20.invoke(context, w_113);
      if(term == null)
        break Fail73;
      a_114 = term;
      term = t_20.invoke(context, x_113);
      if(term == null)
        break Fail73;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethod_3, new IStrategoTerm[]{z_113, a_114, term}), checkListAnnos(termFactory, y_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}