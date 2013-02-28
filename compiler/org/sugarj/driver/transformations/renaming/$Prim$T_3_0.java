package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim$T_3_0 extends Strategy 
{ 
  public static $Prim$T_3_0 instance = new $Prim$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_16, Strategy e_16, Strategy f_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimT_3_0");
    Fail101:
    { 
      IStrategoTerm p_107 = null;
      IStrategoTerm j_107 = null;
      IStrategoTerm k_107 = null;
      IStrategoTerm o_107 = null;
      IStrategoTerm q_107 = null;
      IStrategoTerm r_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrimT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      j_107 = term.getSubterm(0);
      k_107 = term.getSubterm(1);
      o_107 = term.getSubterm(2);
      IStrategoList annos90 = term.getAnnotations();
      p_107 = annos90;
      term = d_16.invoke(context, j_107);
      if(term == null)
        break Fail101;
      q_107 = term;
      term = e_16.invoke(context, k_107);
      if(term == null)
        break Fail101;
      r_107 = term;
      term = f_16.invoke(context, o_107);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrimT_3, new IStrategoTerm[]{q_107, r_107, term}), checkListAnnos(termFactory, p_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}