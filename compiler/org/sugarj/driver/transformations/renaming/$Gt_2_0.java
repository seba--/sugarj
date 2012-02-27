package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt_2_0 extends Strategy 
{ 
  public static $Gt_2_0 instance = new $Gt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_23, Strategy m_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gt_2_0");
    Fail127:
    { 
      IStrategoTerm c_123 = null;
      IStrategoTerm a_123 = null;
      IStrategoTerm b_123 = null;
      IStrategoTerm d_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail127;
      a_123 = term.getSubterm(0);
      b_123 = term.getSubterm(1);
      IStrategoList annos107 = term.getAnnotations();
      c_123 = annos107;
      term = l_23.invoke(context, a_123);
      if(term == null)
        break Fail127;
      d_123 = term;
      term = m_23.invoke(context, b_123);
      if(term == null)
        break Fail127;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGt_2, new IStrategoTerm[]{d_123, term}), checkListAnnos(termFactory, c_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}