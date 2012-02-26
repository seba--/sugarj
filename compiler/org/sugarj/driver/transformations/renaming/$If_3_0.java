package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If_3_0 extends Strategy 
{ 
  public static $If_3_0 instance = new $If_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_20, Strategy s_20, Strategy t_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_3_0");
    Fail89:
    { 
      IStrategoTerm y_115 = null;
      IStrategoTerm v_115 = null;
      IStrategoTerm w_115 = null;
      IStrategoTerm x_115 = null;
      IStrategoTerm z_115 = null;
      IStrategoTerm a_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consIf_3 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      v_115 = term.getSubterm(0);
      w_115 = term.getSubterm(1);
      x_115 = term.getSubterm(2);
      IStrategoList annos74 = term.getAnnotations();
      y_115 = annos74;
      term = r_20.invoke(context, v_115);
      if(term == null)
        break Fail89;
      z_115 = term;
      term = s_20.invoke(context, w_115);
      if(term == null)
        break Fail89;
      a_116 = term;
      term = t_20.invoke(context, x_115);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consIf_3, new IStrategoTerm[]{z_115, a_116, term}), checkListAnnos(termFactory, y_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}