package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Body_2_0 extends Strategy 
{ 
  public static $Constr$Body_2_0 instance = new $Constr$Body_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_18, Strategy d_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrBody_2_0");
    Fail56:
    { 
      IStrategoTerm v_108 = null;
      IStrategoTerm t_108 = null;
      IStrategoTerm u_108 = null;
      IStrategoTerm w_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrBody_2 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      t_108 = term.getSubterm(0);
      u_108 = term.getSubterm(1);
      IStrategoList annos44 = term.getAnnotations();
      v_108 = annos44;
      term = c_18.invoke(context, t_108);
      if(term == null)
        break Fail56;
      w_108 = term;
      term = d_18.invoke(context, u_108);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrBody_2, new IStrategoTerm[]{w_108, term}), checkListAnnos(termFactory, v_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}