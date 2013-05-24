package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Case_2_0 extends Strategy 
{ 
  public static $Switch$Case_2_0 instance = new $Switch$Case_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_344, Strategy q_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchCase_2_0");
    Fail924:
    { 
      IStrategoTerm x_451 = null;
      IStrategoTerm v_451 = null;
      IStrategoTerm w_451 = null;
      IStrategoTerm y_451 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSwitchCase_2 != ((IStrategoAppl)term).getConstructor())
        break Fail924;
      v_451 = term.getSubterm(0);
      w_451 = term.getSubterm(1);
      IStrategoList annos169 = term.getAnnotations();
      x_451 = annos169;
      term = p_344.invoke(context, v_451);
      if(term == null)
        break Fail924;
      y_451 = term;
      term = q_344.invoke(context, w_451);
      if(term == null)
        break Fail924;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSwitchCase_2, new IStrategoTerm[]{y_451, term}), checkListAnnos(termFactory, x_451));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}