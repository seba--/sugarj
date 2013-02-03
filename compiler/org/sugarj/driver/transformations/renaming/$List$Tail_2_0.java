package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Tail_2_0 extends Strategy 
{ 
  public static $List$Tail_2_0 instance = new $List$Tail_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_18, Strategy i_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListTail_2_0");
    Fail135:
    { 
      IStrategoTerm m_113 = null;
      IStrategoTerm k_113 = null;
      IStrategoTerm l_113 = null;
      IStrategoTerm n_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListTail_2 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      k_113 = term.getSubterm(0);
      l_113 = term.getSubterm(1);
      IStrategoList annos122 = term.getAnnotations();
      m_113 = annos122;
      term = h_18.invoke(context, k_113);
      if(term == null)
        break Fail135;
      n_113 = term;
      term = i_18.invoke(context, l_113);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListTail_2, new IStrategoTerm[]{n_113, term}), checkListAnnos(termFactory, m_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}