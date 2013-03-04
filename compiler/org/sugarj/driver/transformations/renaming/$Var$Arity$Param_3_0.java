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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_32, Strategy i_32, Strategy j_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarArityParam_3_0");
    Fail101:
    { 
      IStrategoTerm z_145 = null;
      IStrategoTerm v_145 = null;
      IStrategoTerm w_145 = null;
      IStrategoTerm y_145 = null;
      IStrategoTerm a_146 = null;
      IStrategoTerm b_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      v_145 = term.getSubterm(0);
      w_145 = term.getSubterm(1);
      y_145 = term.getSubterm(2);
      IStrategoList annos76 = term.getAnnotations();
      z_145 = annos76;
      term = h_32.invoke(context, v_145);
      if(term == null)
        break Fail101;
      a_146 = term;
      term = i_32.invoke(context, w_145);
      if(term == null)
        break Fail101;
      b_146 = term;
      term = j_32.invoke(context, y_145);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVarArityParam_3, new IStrategoTerm[]{a_146, b_146, term}), checkListAnnos(termFactory, z_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}