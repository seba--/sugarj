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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_31, Strategy w_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrBody_2_0");
    Fail94:
    { 
      IStrategoTerm z_143 = null;
      IStrategoTerm x_143 = null;
      IStrategoTerm y_143 = null;
      IStrategoTerm b_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstrBody_2 != ((IStrategoAppl)term).getConstructor())
        break Fail94;
      x_143 = term.getSubterm(0);
      y_143 = term.getSubterm(1);
      IStrategoList annos70 = term.getAnnotations();
      z_143 = annos70;
      term = v_31.invoke(context, x_143);
      if(term == null)
        break Fail94;
      b_144 = term;
      term = w_31.invoke(context, y_143);
      if(term == null)
        break Fail94;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstrBody_2, new IStrategoTerm[]{b_144, term}), checkListAnnos(termFactory, z_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}