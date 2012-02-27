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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_18, Strategy h_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperConstrInv_2_0");
    Fail56:
    { 
      IStrategoTerm t_108 = null;
      IStrategoTerm r_108 = null;
      IStrategoTerm s_108 = null;
      IStrategoTerm u_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      r_108 = term.getSubterm(0);
      s_108 = term.getSubterm(1);
      IStrategoList annos42 = term.getAnnotations();
      t_108 = annos42;
      term = g_18.invoke(context, r_108);
      if(term == null)
        break Fail56;
      u_108 = term;
      term = h_18.invoke(context, s_108);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperConstrInv_2, new IStrategoTerm[]{u_108, term}), checkListAnnos(termFactory, t_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}