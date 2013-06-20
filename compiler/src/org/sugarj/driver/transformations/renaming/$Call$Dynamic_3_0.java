package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$Dynamic_3_0 extends Strategy 
{ 
  public static $Call$Dynamic_3_0 instance = new $Call$Dynamic_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_16, Strategy t_16, Strategy u_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallDynamic_3_0");
    Fail108:
    { 
      IStrategoTerm w_108 = null;
      IStrategoTerm t_108 = null;
      IStrategoTerm u_108 = null;
      IStrategoTerm v_108 = null;
      IStrategoTerm x_108 = null;
      IStrategoTerm y_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallDynamic_3 != ((IStrategoAppl)term).getConstructor())
        break Fail108;
      t_108 = term.getSubterm(0);
      u_108 = term.getSubterm(1);
      v_108 = term.getSubterm(2);
      IStrategoList annos96 = term.getAnnotations();
      w_108 = annos96;
      term = s_16.invoke(context, t_108);
      if(term == null)
        break Fail108;
      x_108 = term;
      term = t_16.invoke(context, u_108);
      if(term == null)
        break Fail108;
      y_108 = term;
      term = u_16.invoke(context, v_108);
      if(term == null)
        break Fail108;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallDynamic_3, new IStrategoTerm[]{x_108, y_108, term}), checkListAnnos(termFactory, w_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}