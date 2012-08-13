package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Left$Shift_2_0 extends Strategy 
{ 
  public static $Assign$Left$Shift_2_0 instance = new $Assign$Left$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_27, Strategy j_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignLeftShift_2_0");
    Fail157:
    { 
      IStrategoTerm o_133 = null;
      IStrategoTerm m_133 = null;
      IStrategoTerm n_133 = null;
      IStrategoTerm p_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      m_133 = term.getSubterm(0);
      n_133 = term.getSubterm(1);
      IStrategoList annos132 = term.getAnnotations();
      o_133 = annos132;
      term = i_27.invoke(context, m_133);
      if(term == null)
        break Fail157;
      p_133 = term;
      term = j_27.invoke(context, n_133);
      if(term == null)
        break Fail157;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignLeftShift_2, new IStrategoTerm[]{p_133, term}), checkListAnnos(termFactory, o_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}