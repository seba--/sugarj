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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_18, Strategy p_18, Strategy q_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarArityParam_3_0");
    Fail63:
    { 
      IStrategoTerm d_110 = null;
      IStrategoTerm a_110 = null;
      IStrategoTerm b_110 = null;
      IStrategoTerm c_110 = null;
      IStrategoTerm e_110 = null;
      IStrategoTerm f_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      a_110 = term.getSubterm(0);
      b_110 = term.getSubterm(1);
      c_110 = term.getSubterm(2);
      IStrategoList annos50 = term.getAnnotations();
      d_110 = annos50;
      term = o_18.invoke(context, a_110);
      if(term == null)
        break Fail63;
      e_110 = term;
      term = p_18.invoke(context, b_110);
      if(term == null)
        break Fail63;
      f_110 = term;
      term = q_18.invoke(context, c_110);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarArityParam_3, new IStrategoTerm[]{e_110, f_110, term}), checkListAnnos(termFactory, d_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}