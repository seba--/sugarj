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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_26, Strategy z_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignOr_2_0");
    Fail152:
    { 
      IStrategoTerm v_131 = null;
      IStrategoTerm s_131 = null;
      IStrategoTerm u_131 = null;
      IStrategoTerm x_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail152;
      s_131 = term.getSubterm(0);
      u_131 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      v_131 = annos127;
      term = y_26.invoke(context, s_131);
      if(term == null)
        break Fail152;
      x_131 = term;
      term = z_26.invoke(context, u_131);
      if(term == null)
        break Fail152;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignOr_2, new IStrategoTerm[]{x_131, term}), checkListAnnos(termFactory, v_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}