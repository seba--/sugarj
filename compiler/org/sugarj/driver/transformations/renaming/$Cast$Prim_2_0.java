package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cast$Prim_2_0 extends Strategy 
{ 
  public static $Cast$Prim_2_0 instance = new $Cast$Prim_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_29, Strategy n_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastPrim_2_0");
    Fail185:
    { 
      IStrategoTerm g_143 = null;
      IStrategoTerm e_143 = null;
      IStrategoTerm f_143 = null;
      IStrategoTerm h_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail185;
      e_143 = term.getSubterm(0);
      f_143 = term.getSubterm(1);
      IStrategoList annos160 = term.getAnnotations();
      g_143 = annos160;
      term = m_29.invoke(context, e_143);
      if(term == null)
        break Fail185;
      h_143 = term;
      term = n_29.invoke(context, f_143);
      if(term == null)
        break Fail185;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCastPrim_2, new IStrategoTerm[]{h_143, term}), checkListAnnos(termFactory, g_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}