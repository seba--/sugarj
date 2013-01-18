package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Instance$Of_2_0 extends Strategy 
{ 
  public static $Instance$Of_2_0 instance = new $Instance$Of_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_37, Strategy r_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InstanceOf_2_0");
    Fail173:
    { 
      IStrategoTerm p_165 = null;
      IStrategoTerm m_165 = null;
      IStrategoTerm n_165 = null;
      IStrategoTerm q_165 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInstanceOf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail173;
      m_165 = term.getSubterm(0);
      n_165 = term.getSubterm(1);
      IStrategoList annos143 = term.getAnnotations();
      p_165 = annos143;
      term = q_37.invoke(context, m_165);
      if(term == null)
        break Fail173;
      q_165 = term;
      term = r_37.invoke(context, n_165);
      if(term == null)
        break Fail173;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInstanceOf_2, new IStrategoTerm[]{q_165, term}), checkListAnnos(termFactory, p_165));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}