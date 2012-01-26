package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Constr$Inv_2_0 extends Strategy 
{ 
  public static $Super$Constr$Inv_2_0 instance = new $Super$Constr$Inv_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_17, Strategy k_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperConstrInv_2_0");
    Fail51:
    { 
      IStrategoTerm v_107 = null;
      IStrategoTerm t_107 = null;
      IStrategoTerm u_107 = null;
      IStrategoTerm w_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      t_107 = term.getSubterm(0);
      u_107 = term.getSubterm(1);
      IStrategoList annos42 = term.getAnnotations();
      v_107 = annos42;
      term = j_17.invoke(context, t_107);
      if(term == null)
        break Fail51;
      w_107 = term;
      term = k_17.invoke(context, u_107);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperConstrInv_2, new IStrategoTerm[]{w_107, term}), checkListAnnos(termFactory, v_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}