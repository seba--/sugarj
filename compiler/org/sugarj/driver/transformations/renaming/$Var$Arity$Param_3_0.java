package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Arity$Param_3_0 extends Strategy 
{ 
  public static $Var$Arity$Param_3_0 instance = new $Var$Arity$Param_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_23, Strategy a_24, Strategy b_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarArityParam_3_0");
    Fail111:
    { 
      IStrategoTerm x_122 = null;
      IStrategoTerm u_122 = null;
      IStrategoTerm v_122 = null;
      IStrategoTerm w_122 = null;
      IStrategoTerm y_122 = null;
      IStrategoTerm z_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      u_122 = term.getSubterm(0);
      v_122 = term.getSubterm(1);
      w_122 = term.getSubterm(2);
      IStrategoList annos91 = term.getAnnotations();
      x_122 = annos91;
      term = z_23.invoke(context, u_122);
      if(term == null)
        break Fail111;
      y_122 = term;
      term = a_24.invoke(context, v_122);
      if(term == null)
        break Fail111;
      z_122 = term;
      term = b_24.invoke(context, w_122);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarArityParam_3, new IStrategoTerm[]{y_122, z_122, term}), checkListAnnos(termFactory, x_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}