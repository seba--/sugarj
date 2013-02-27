package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_16, Strategy t_16, Strategy u_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallT_3_0");
    Fail110:
    { 
      IStrategoTerm a_109 = null;
      IStrategoTerm x_108 = null;
      IStrategoTerm y_108 = null;
      IStrategoTerm z_108 = null;
      IStrategoTerm b_109 = null;
      IStrategoTerm c_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      x_108 = term.getSubterm(0);
      y_108 = term.getSubterm(1);
      z_108 = term.getSubterm(2);
      IStrategoList annos97 = term.getAnnotations();
      a_109 = annos97;
      term = s_16.invoke(context, x_108);
      if(term == null)
        break Fail110;
      b_109 = term;
      term = t_16.invoke(context, y_108);
      if(term == null)
        break Fail110;
      c_109 = term;
      term = u_16.invoke(context, z_108);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallT_3, new IStrategoTerm[]{b_109, c_109, term}), checkListAnnos(termFactory, a_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}