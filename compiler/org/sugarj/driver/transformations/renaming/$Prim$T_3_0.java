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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_16, Strategy b_16, Strategy c_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimT_3_0");
    Fail101:
    { 
      IStrategoTerm j_107 = null;
      IStrategoTerm e_107 = null;
      IStrategoTerm g_107 = null;
      IStrategoTerm h_107 = null;
      IStrategoTerm k_107 = null;
      IStrategoTerm o_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrimT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      e_107 = term.getSubterm(0);
      g_107 = term.getSubterm(1);
      h_107 = term.getSubterm(2);
      IStrategoList annos90 = term.getAnnotations();
      j_107 = annos90;
      term = a_16.invoke(context, e_107);
      if(term == null)
        break Fail101;
      k_107 = term;
      term = b_16.invoke(context, g_107);
      if(term == null)
        break Fail101;
      o_107 = term;
      term = c_16.invoke(context, h_107);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrimT_3, new IStrategoTerm[]{k_107, o_107, term}), checkListAnnos(termFactory, j_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}