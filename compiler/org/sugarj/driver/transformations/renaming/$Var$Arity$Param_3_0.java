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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_18, Strategy x_18, Strategy y_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarArityParam_3_0");
    Fail65:
    { 
      IStrategoTerm l_110 = null;
      IStrategoTerm i_110 = null;
      IStrategoTerm j_110 = null;
      IStrategoTerm k_110 = null;
      IStrategoTerm m_110 = null;
      IStrategoTerm n_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      i_110 = term.getSubterm(0);
      j_110 = term.getSubterm(1);
      k_110 = term.getSubterm(2);
      IStrategoList annos50 = term.getAnnotations();
      l_110 = annos50;
      term = w_18.invoke(context, i_110);
      if(term == null)
        break Fail65;
      m_110 = term;
      term = x_18.invoke(context, j_110);
      if(term == null)
        break Fail65;
      n_110 = term;
      term = y_18.invoke(context, k_110);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarArityParam_3, new IStrategoTerm[]{m_110, n_110, term}), checkListAnnos(termFactory, l_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}