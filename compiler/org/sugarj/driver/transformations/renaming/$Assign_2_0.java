package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_22, Strategy s_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail117:
    { 
      IStrategoTerm x_120 = null;
      IStrategoTerm t_120 = null;
      IStrategoTerm v_120 = null;
      IStrategoTerm y_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      t_120 = term.getSubterm(0);
      v_120 = term.getSubterm(1);
      IStrategoList annos97 = term.getAnnotations();
      x_120 = annos97;
      term = r_22.invoke(context, t_120);
      if(term == null)
        break Fail117;
      y_120 = term;
      term = s_22.invoke(context, v_120);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssign_2, new IStrategoTerm[]{y_120, term}), checkListAnnos(termFactory, x_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}