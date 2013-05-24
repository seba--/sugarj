package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_344, Strategy n_344, Strategy o_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoice_3_0");
    Fail923:
    { 
      IStrategoTerm r_451 = null;
      IStrategoTerm o_451 = null;
      IStrategoTerm p_451 = null;
      IStrategoTerm q_451 = null;
      IStrategoTerm s_451 = null;
      IStrategoTerm t_451 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSwitchChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail923;
      o_451 = term.getSubterm(0);
      p_451 = term.getSubterm(1);
      q_451 = term.getSubterm(2);
      IStrategoList annos168 = term.getAnnotations();
      r_451 = annos168;
      term = m_344.invoke(context, o_451);
      if(term == null)
        break Fail923;
      s_451 = term;
      term = n_344.invoke(context, p_451);
      if(term == null)
        break Fail923;
      t_451 = term;
      term = o_344.invoke(context, q_451);
      if(term == null)
        break Fail923;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSwitchChoice_3, new IStrategoTerm[]{s_451, t_451, term}), checkListAnnos(termFactory, r_451));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}