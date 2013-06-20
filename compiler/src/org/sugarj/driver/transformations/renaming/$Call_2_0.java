package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call_2_0 extends Strategy 
{ 
  public static $Call_2_0 instance = new $Call_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_16, Strategy c_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail96:
    { 
      IStrategoTerm y_106 = null;
      IStrategoTerm v_106 = null;
      IStrategoTerm x_106 = null;
      IStrategoTerm z_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail96;
      v_106 = term.getSubterm(0);
      x_106 = term.getSubterm(1);
      IStrategoList annos86 = term.getAnnotations();
      y_106 = annos86;
      term = b_16.invoke(context, v_106);
      if(term == null)
        break Fail96;
      z_106 = term;
      term = c_16.invoke(context, x_106);
      if(term == null)
        break Fail96;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCall_2, new IStrategoTerm[]{z_106, term}), checkListAnnos(termFactory, y_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}