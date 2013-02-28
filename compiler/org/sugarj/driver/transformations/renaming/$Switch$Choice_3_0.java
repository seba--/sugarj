package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_14, Strategy f_14, Strategy g_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoice_3_0");
    Fail67:
    { 
      IStrategoTerm z_101 = null;
      IStrategoTerm w_101 = null;
      IStrategoTerm x_101 = null;
      IStrategoTerm y_101 = null;
      IStrategoTerm a_102 = null;
      IStrategoTerm b_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      w_101 = term.getSubterm(0);
      x_101 = term.getSubterm(1);
      y_101 = term.getSubterm(2);
      IStrategoList annos57 = term.getAnnotations();
      z_101 = annos57;
      term = e_14.invoke(context, w_101);
      if(term == null)
        break Fail67;
      a_102 = term;
      term = f_14.invoke(context, x_101);
      if(term == null)
        break Fail67;
      b_102 = term;
      term = g_14.invoke(context, y_101);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchChoice_3, new IStrategoTerm[]{a_102, b_102, term}), checkListAnnos(termFactory, z_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}