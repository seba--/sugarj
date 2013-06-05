package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$T_3_0 extends Strategy 
{ 
  public static $Call$T_3_0 instance = new $Call$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_23, Strategy b_23, Strategy c_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallT_3_0");
    Fail135:
    { 
      IStrategoTerm x_122 = null;
      IStrategoTerm u_122 = null;
      IStrategoTerm v_122 = null;
      IStrategoTerm w_122 = null;
      IStrategoTerm y_122 = null;
      IStrategoTerm z_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      u_122 = term.getSubterm(0);
      v_122 = term.getSubterm(1);
      w_122 = term.getSubterm(2);
      IStrategoList annos105 = term.getAnnotations();
      x_122 = annos105;
      term = a_23.invoke(context, u_122);
      if(term == null)
        break Fail135;
      y_122 = term;
      term = b_23.invoke(context, v_122);
      if(term == null)
        break Fail135;
      z_122 = term;
      term = c_23.invoke(context, w_122);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consCallT_3, new IStrategoTerm[]{y_122, z_122, term}), checkListAnnos(termFactory, x_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}