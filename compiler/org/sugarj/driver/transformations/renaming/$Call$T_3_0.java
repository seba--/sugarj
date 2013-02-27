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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_16, Strategy q_16, Strategy r_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallT_3_0");
    Fail110:
    { 
      IStrategoTerm x_108 = null;
      IStrategoTerm u_108 = null;
      IStrategoTerm v_108 = null;
      IStrategoTerm w_108 = null;
      IStrategoTerm y_108 = null;
      IStrategoTerm z_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      u_108 = term.getSubterm(0);
      v_108 = term.getSubterm(1);
      w_108 = term.getSubterm(2);
      IStrategoList annos97 = term.getAnnotations();
      x_108 = annos97;
      term = p_16.invoke(context, u_108);
      if(term == null)
        break Fail110;
      y_108 = term;
      term = q_16.invoke(context, v_108);
      if(term == null)
        break Fail110;
      z_108 = term;
      term = r_16.invoke(context, w_108);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallT_3, new IStrategoTerm[]{y_108, z_108, term}), checkListAnnos(termFactory, x_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}