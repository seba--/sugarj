package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Explode_2_0 extends Strategy 
{ 
  public static $Explode_2_0 instance = new $Explode_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_24, Strategy u_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Explode_2_0");
    Fail154:
    { 
      IStrategoTerm v_127 = null;
      IStrategoTerm t_127 = null;
      IStrategoTerm u_127 = null;
      IStrategoTerm w_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consExplode_2 != ((IStrategoAppl)term).getConstructor())
        break Fail154;
      t_127 = term.getSubterm(0);
      u_127 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      v_127 = annos127;
      term = t_24.invoke(context, t_127);
      if(term == null)
        break Fail154;
      w_127 = term;
      term = u_24.invoke(context, u_127);
      if(term == null)
        break Fail154;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consExplode_2, new IStrategoTerm[]{w_127, term}), checkListAnnos(termFactory, v_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}