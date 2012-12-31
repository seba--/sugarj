package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_16, Strategy c_16, Strategy d_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimT_3_0");
    Fail97:
    { 
      IStrategoTerm k_107 = null;
      IStrategoTerm g_107 = null;
      IStrategoTerm h_107 = null;
      IStrategoTerm j_107 = null;
      IStrategoTerm o_107 = null;
      IStrategoTerm p_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrimT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      g_107 = term.getSubterm(0);
      h_107 = term.getSubterm(1);
      j_107 = term.getSubterm(2);
      IStrategoList annos90 = term.getAnnotations();
      k_107 = annos90;
      term = b_16.invoke(context, g_107);
      if(term == null)
        break Fail97;
      o_107 = term;
      term = c_16.invoke(context, h_107);
      if(term == null)
        break Fail97;
      p_107 = term;
      term = d_16.invoke(context, j_107);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrimT_3, new IStrategoTerm[]{o_107, p_107, term}), checkListAnnos(termFactory, k_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}