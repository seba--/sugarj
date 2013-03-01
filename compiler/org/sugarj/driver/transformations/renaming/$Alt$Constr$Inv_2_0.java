package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Alt$Constr$Inv_2_0 extends Strategy 
{ 
  public static $Alt$Constr$Inv_2_0 instance = new $Alt$Constr$Inv_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_31, Strategy u_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AltConstrInv_2_0");
    Fail93:
    { 
      IStrategoTerm t_143 = null;
      IStrategoTerm r_143 = null;
      IStrategoTerm s_143 = null;
      IStrategoTerm v_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAltConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail93;
      r_143 = term.getSubterm(0);
      s_143 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      t_143 = annos69;
      term = t_31.invoke(context, r_143);
      if(term == null)
        break Fail93;
      v_143 = term;
      term = u_31.invoke(context, s_143);
      if(term == null)
        break Fail93;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAltConstrInv_2, new IStrategoTerm[]{v_143, term}), checkListAnnos(termFactory, t_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}