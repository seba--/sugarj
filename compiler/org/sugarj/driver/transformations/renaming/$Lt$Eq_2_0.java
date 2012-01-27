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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_22, Strategy n_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LtEq_2_0");
    Fail121:
    { 
      IStrategoTerm w_121 = null;
      IStrategoTerm t_121 = null;
      IStrategoTerm u_121 = null;
      IStrategoTerm x_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLtEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail121;
      t_121 = term.getSubterm(0);
      u_121 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      w_121 = annos106;
      term = m_22.invoke(context, t_121);
      if(term == null)
        break Fail121;
      x_121 = term;
      term = n_22.invoke(context, u_121);
      if(term == null)
        break Fail121;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLtEq_2, new IStrategoTerm[]{x_121, term}), checkListAnnos(termFactory, w_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}