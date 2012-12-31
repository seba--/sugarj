package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Choice_3_0 extends Strategy 
{ 
  public static $Switch$Choice_3_0 instance = new $Switch$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_14, Strategy d_14, Strategy e_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoice_3_0");
    Fail63:
    { 
      IStrategoTerm x_101 = null;
      IStrategoTerm u_101 = null;
      IStrategoTerm v_101 = null;
      IStrategoTerm w_101 = null;
      IStrategoTerm y_101 = null;
      IStrategoTerm z_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      u_101 = term.getSubterm(0);
      v_101 = term.getSubterm(1);
      w_101 = term.getSubterm(2);
      IStrategoList annos57 = term.getAnnotations();
      x_101 = annos57;
      term = c_14.invoke(context, u_101);
      if(term == null)
        break Fail63;
      y_101 = term;
      term = d_14.invoke(context, v_101);
      if(term == null)
        break Fail63;
      z_101 = term;
      term = e_14.invoke(context, w_101);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchChoice_3, new IStrategoTerm[]{y_101, z_101, term}), checkListAnnos(termFactory, x_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}