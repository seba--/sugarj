package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Eq_2_0 extends Strategy 
{ 
  public static $Eq_2_0 instance = new $Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_36, Strategy r_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Eq_2_0");
    Fail160:
    { 
      IStrategoTerm v_160 = null;
      IStrategoTerm t_160 = null;
      IStrategoTerm u_160 = null;
      IStrategoTerm w_160 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail160;
      t_160 = term.getSubterm(0);
      u_160 = term.getSubterm(1);
      IStrategoList annos130 = term.getAnnotations();
      v_160 = annos130;
      term = q_36.invoke(context, t_160);
      if(term == null)
        break Fail160;
      w_160 = term;
      term = r_36.invoke(context, u_160);
      if(term == null)
        break Fail160;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consEq_2, new IStrategoTerm[]{w_160, term}), checkListAnnos(termFactory, v_160));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}