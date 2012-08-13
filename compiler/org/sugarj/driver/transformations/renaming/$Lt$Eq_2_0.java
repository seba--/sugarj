package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt$Eq_2_0 extends Strategy 
{ 
  public static $Lt$Eq_2_0 instance = new $Lt$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_28, Strategy n_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LtEq_2_0");
    Fail172:
    { 
      IStrategoTerm p_138 = null;
      IStrategoTerm n_138 = null;
      IStrategoTerm o_138 = null;
      IStrategoTerm q_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLtEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail172;
      n_138 = term.getSubterm(0);
      o_138 = term.getSubterm(1);
      IStrategoList annos147 = term.getAnnotations();
      p_138 = annos147;
      term = m_28.invoke(context, n_138);
      if(term == null)
        break Fail172;
      q_138 = term;
      term = n_28.invoke(context, o_138);
      if(term == null)
        break Fail172;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLtEq_2, new IStrategoTerm[]{q_138, term}), checkListAnnos(termFactory, p_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}