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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_16, Strategy h_16, Strategy i_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimT_3_0");
    Fail100:
    { 
      IStrategoTerm s_107 = null;
      IStrategoTerm p_107 = null;
      IStrategoTerm q_107 = null;
      IStrategoTerm r_107 = null;
      IStrategoTerm t_107 = null;
      IStrategoTerm u_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrimT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      p_107 = term.getSubterm(0);
      q_107 = term.getSubterm(1);
      r_107 = term.getSubterm(2);
      IStrategoList annos90 = term.getAnnotations();
      s_107 = annos90;
      term = g_16.invoke(context, p_107);
      if(term == null)
        break Fail100;
      t_107 = term;
      term = h_16.invoke(context, q_107);
      if(term == null)
        break Fail100;
      u_107 = term;
      term = i_16.invoke(context, r_107);
      if(term == null)
        break Fail100;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrimT_3, new IStrategoTerm[]{t_107, u_107, term}), checkListAnnos(termFactory, s_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}