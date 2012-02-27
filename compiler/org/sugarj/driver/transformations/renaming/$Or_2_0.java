package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Or_2_0 extends Strategy 
{ 
  public static $Or_2_0 instance = new $Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_22, Strategy u_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Or_2_0");
    Fail118:
    { 
      IStrategoTerm c_121 = null;
      IStrategoTerm a_121 = null;
      IStrategoTerm b_121 = null;
      IStrategoTerm d_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      a_121 = term.getSubterm(0);
      b_121 = term.getSubterm(1);
      IStrategoList annos98 = term.getAnnotations();
      c_121 = annos98;
      term = t_22.invoke(context, a_121);
      if(term == null)
        break Fail118;
      d_121 = term;
      term = u_22.invoke(context, b_121);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consOr_2, new IStrategoTerm[]{d_121, term}), checkListAnnos(termFactory, c_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}