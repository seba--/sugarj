package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_11, Strategy z_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchCase_2_0");
    Fail37:
    { 
      IStrategoTerm p_95 = null;
      IStrategoTerm n_95 = null;
      IStrategoTerm o_95 = null;
      IStrategoTerm q_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchCase_2 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      n_95 = term.getSubterm(0);
      o_95 = term.getSubterm(1);
      IStrategoList annos27 = term.getAnnotations();
      p_95 = annos27;
      term = y_11.invoke(context, n_95);
      if(term == null)
        break Fail37;
      q_95 = term;
      term = z_11.invoke(context, o_95);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchCase_2, new IStrategoTerm[]{q_95, term}), checkListAnnos(termFactory, p_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}