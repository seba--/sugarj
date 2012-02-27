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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_21, Strategy w_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignOr_2_0");
    Fail106:
    { 
      IStrategoTerm j_118 = null;
      IStrategoTerm h_118 = null;
      IStrategoTerm i_118 = null;
      IStrategoTerm k_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail106;
      h_118 = term.getSubterm(0);
      i_118 = term.getSubterm(1);
      IStrategoList annos86 = term.getAnnotations();
      j_118 = annos86;
      term = v_21.invoke(context, h_118);
      if(term == null)
        break Fail106;
      k_118 = term;
      term = w_21.invoke(context, i_118);
      if(term == null)
        break Fail106;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignOr_2, new IStrategoTerm[]{k_118, term}), checkListAnnos(termFactory, j_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}