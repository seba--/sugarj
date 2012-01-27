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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_20, Strategy z_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignOr_2_0");
    Fail101:
    { 
      IStrategoTerm l_117 = null;
      IStrategoTerm j_117 = null;
      IStrategoTerm k_117 = null;
      IStrategoTerm m_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      j_117 = term.getSubterm(0);
      k_117 = term.getSubterm(1);
      IStrategoList annos86 = term.getAnnotations();
      l_117 = annos86;
      term = y_20.invoke(context, j_117);
      if(term == null)
        break Fail101;
      m_117 = term;
      term = z_20.invoke(context, k_117);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignOr_2, new IStrategoTerm[]{m_117, term}), checkListAnnos(termFactory, l_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}