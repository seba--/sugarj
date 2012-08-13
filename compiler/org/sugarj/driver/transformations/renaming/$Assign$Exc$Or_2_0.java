package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Exc$Or_2_0 extends Strategy 
{ 
  public static $Assign$Exc$Or_2_0 instance = new $Assign$Exc$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_27, Strategy b_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignExcOr_2_0");
    Fail153:
    { 
      IStrategoTerm c_132 = null;
      IStrategoTerm z_131 = null;
      IStrategoTerm b_132 = null;
      IStrategoTerm d_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail153;
      z_131 = term.getSubterm(0);
      b_132 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      c_132 = annos128;
      term = a_27.invoke(context, z_131);
      if(term == null)
        break Fail153;
      d_132 = term;
      term = b_27.invoke(context, b_132);
      if(term == null)
        break Fail153;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignExcOr_2, new IStrategoTerm[]{d_132, term}), checkListAnnos(termFactory, c_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}