package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_22, Strategy m_22, Strategy n_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimT_3_0");
    Fail126:
    { 
      IStrategoTerm f_121 = null;
      IStrategoTerm c_121 = null;
      IStrategoTerm d_121 = null;
      IStrategoTerm e_121 = null;
      IStrategoTerm g_121 = null;
      IStrategoTerm h_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consPrimT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      c_121 = term.getSubterm(0);
      d_121 = term.getSubterm(1);
      e_121 = term.getSubterm(2);
      IStrategoList annos98 = term.getAnnotations();
      f_121 = annos98;
      term = l_22.invoke(context, c_121);
      if(term == null)
        break Fail126;
      g_121 = term;
      term = m_22.invoke(context, d_121);
      if(term == null)
        break Fail126;
      h_121 = term;
      term = n_22.invoke(context, e_121);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consPrimT_3, new IStrategoTerm[]{g_121, h_121, term}), checkListAnnos(termFactory, f_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}