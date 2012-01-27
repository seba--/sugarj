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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17, Strategy o_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrBody_2_0");
    Fail53:
    { 
      IStrategoTerm f_108 = null;
      IStrategoTerm d_108 = null;
      IStrategoTerm e_108 = null;
      IStrategoTerm g_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrBody_2 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      d_108 = term.getSubterm(0);
      e_108 = term.getSubterm(1);
      IStrategoList annos44 = term.getAnnotations();
      f_108 = annos44;
      term = n_17.invoke(context, d_108);
      if(term == null)
        break Fail53;
      g_108 = term;
      term = o_17.invoke(context, e_108);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrBody_2, new IStrategoTerm[]{g_108, term}), checkListAnnos(termFactory, f_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}