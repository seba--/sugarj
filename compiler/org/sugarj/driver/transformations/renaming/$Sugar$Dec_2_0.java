package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Dec_2_0 extends Strategy 
{ 
  public static $Sugar$Dec_2_0 instance = new $Sugar$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_17, Strategy w_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarDec_2_0");
    Fail23:
    { 
      IStrategoTerm m_105 = null;
      IStrategoTerm k_105 = null;
      IStrategoTerm l_105 = null;
      IStrategoTerm n_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSugarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      k_105 = term.getSubterm(0);
      l_105 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      m_105 = annos5;
      term = v_17.invoke(context, k_105);
      if(term == null)
        break Fail23;
      n_105 = term;
      term = w_17.invoke(context, l_105);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSugarDec_2, new IStrategoTerm[]{n_105, term}), checkListAnnos(termFactory, m_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}