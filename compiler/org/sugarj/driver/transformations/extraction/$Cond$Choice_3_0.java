package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cond$Choice_3_0 extends Strategy 
{ 
  public static $Cond$Choice_3_0 instance = new $Cond$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_344, Strategy g_344, Strategy h_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CondChoice_3_0");
    Fail920:
    { 
      IStrategoTerm a_451 = null;
      IStrategoTerm x_450 = null;
      IStrategoTerm y_450 = null;
      IStrategoTerm z_450 = null;
      IStrategoTerm b_451 = null;
      IStrategoTerm c_451 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCondChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail920;
      x_450 = term.getSubterm(0);
      y_450 = term.getSubterm(1);
      z_450 = term.getSubterm(2);
      IStrategoList annos165 = term.getAnnotations();
      a_451 = annos165;
      term = f_344.invoke(context, x_450);
      if(term == null)
        break Fail920;
      b_451 = term;
      term = g_344.invoke(context, y_450);
      if(term == null)
        break Fail920;
      c_451 = term;
      term = h_344.invoke(context, z_450);
      if(term == null)
        break Fail920;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCondChoice_3, new IStrategoTerm[]{b_451, c_451, term}), checkListAnnos(termFactory, a_451));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}