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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_11, Strategy w_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchCase_2_0");
    Fail37:
    { 
      IStrategoTerm m_95 = null;
      IStrategoTerm j_95 = null;
      IStrategoTerm l_95 = null;
      IStrategoTerm n_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchCase_2 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      j_95 = term.getSubterm(0);
      l_95 = term.getSubterm(1);
      IStrategoList annos27 = term.getAnnotations();
      m_95 = annos27;
      term = v_11.invoke(context, j_95);
      if(term == null)
        break Fail37;
      n_95 = term;
      term = w_11.invoke(context, l_95);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchCase_2, new IStrategoTerm[]{n_95, term}), checkListAnnos(termFactory, m_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}