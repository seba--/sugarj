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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_24, Strategy k_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastPrim_2_0");
    Fail139:
    { 
      IStrategoTerm v_125 = null;
      IStrategoTerm t_125 = null;
      IStrategoTerm u_125 = null;
      IStrategoTerm w_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail139;
      t_125 = term.getSubterm(0);
      u_125 = term.getSubterm(1);
      IStrategoList annos119 = term.getAnnotations();
      v_125 = annos119;
      term = j_24.invoke(context, t_125);
      if(term == null)
        break Fail139;
      w_125 = term;
      term = k_24.invoke(context, u_125);
      if(term == null)
        break Fail139;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCastPrim_2, new IStrategoTerm[]{w_125, term}), checkListAnnos(termFactory, v_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}