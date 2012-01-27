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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_23, Strategy n_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastPrim_2_0");
    Fail134:
    { 
      IStrategoTerm u_124 = null;
      IStrategoTerm s_124 = null;
      IStrategoTerm t_124 = null;
      IStrategoTerm v_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      s_124 = term.getSubterm(0);
      t_124 = term.getSubterm(1);
      IStrategoList annos119 = term.getAnnotations();
      u_124 = annos119;
      term = m_23.invoke(context, s_124);
      if(term == null)
        break Fail134;
      v_124 = term;
      term = n_23.invoke(context, t_124);
      if(term == null)
        break Fail134;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCastPrim_2, new IStrategoTerm[]{v_124, term}), checkListAnnos(termFactory, u_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}