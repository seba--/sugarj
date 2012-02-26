package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Or_2_0 extends Strategy 
{ 
  public static $Assign$Or_2_0 instance = new $Assign$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_21, Strategy o_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignOr_2_0");
    Fail104:
    { 
      IStrategoTerm b_118 = null;
      IStrategoTerm z_117 = null;
      IStrategoTerm a_118 = null;
      IStrategoTerm c_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      z_117 = term.getSubterm(0);
      a_118 = term.getSubterm(1);
      IStrategoList annos86 = term.getAnnotations();
      b_118 = annos86;
      term = n_21.invoke(context, z_117);
      if(term == null)
        break Fail104;
      c_118 = term;
      term = o_21.invoke(context, a_118);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignOr_2, new IStrategoTerm[]{c_118, term}), checkListAnnos(termFactory, b_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}