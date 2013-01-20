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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_35, Strategy j_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignExcOr_2_0");
    Fail143:
    { 
      IStrategoTerm r_156 = null;
      IStrategoTerm n_156 = null;
      IStrategoTerm p_156 = null;
      IStrategoTerm s_156 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      n_156 = term.getSubterm(0);
      p_156 = term.getSubterm(1);
      IStrategoList annos113 = term.getAnnotations();
      r_156 = annos113;
      term = i_35.invoke(context, n_156);
      if(term == null)
        break Fail143;
      s_156 = term;
      term = j_35.invoke(context, p_156);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignExcOr_2, new IStrategoTerm[]{s_156, term}), checkListAnnos(termFactory, r_156));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}