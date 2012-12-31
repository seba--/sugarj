package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_11, Strategy x_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchCase_2_0");
    Fail33:
    { 
      IStrategoTerm n_95 = null;
      IStrategoTerm l_95 = null;
      IStrategoTerm m_95 = null;
      IStrategoTerm o_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchCase_2 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      l_95 = term.getSubterm(0);
      m_95 = term.getSubterm(1);
      IStrategoList annos27 = term.getAnnotations();
      n_95 = annos27;
      term = w_11.invoke(context, l_95);
      if(term == null)
        break Fail33;
      o_95 = term;
      term = x_11.invoke(context, m_95);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchCase_2, new IStrategoTerm[]{o_95, term}), checkListAnnos(termFactory, n_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}