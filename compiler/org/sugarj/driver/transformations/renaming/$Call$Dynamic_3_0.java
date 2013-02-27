package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$Dynamic_3_0 extends Strategy 
{ 
  public static $Call$Dynamic_3_0 instance = new $Call$Dynamic_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_16, Strategy n_16, Strategy o_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallDynamic_3_0");
    Fail109:
    { 
      IStrategoTerm q_108 = null;
      IStrategoTerm n_108 = null;
      IStrategoTerm o_108 = null;
      IStrategoTerm p_108 = null;
      IStrategoTerm r_108 = null;
      IStrategoTerm s_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallDynamic_3 != ((IStrategoAppl)term).getConstructor())
        break Fail109;
      n_108 = term.getSubterm(0);
      o_108 = term.getSubterm(1);
      p_108 = term.getSubterm(2);
      IStrategoList annos96 = term.getAnnotations();
      q_108 = annos96;
      term = m_16.invoke(context, n_108);
      if(term == null)
        break Fail109;
      r_108 = term;
      term = n_16.invoke(context, o_108);
      if(term == null)
        break Fail109;
      s_108 = term;
      term = o_16.invoke(context, p_108);
      if(term == null)
        break Fail109;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallDynamic_3, new IStrategoTerm[]{r_108, s_108, term}), checkListAnnos(termFactory, q_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}