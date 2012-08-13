package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$U$Right$Shift_2_0 extends Strategy 
{ 
  public static $Assign$U$Right$Shift_2_0 instance = new $Assign$U$Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_27, Strategy f_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignURightShift_2_0");
    Fail155:
    { 
      IStrategoTerm q_132 = null;
      IStrategoTerm m_132 = null;
      IStrategoTerm o_132 = null;
      IStrategoTerm t_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail155;
      m_132 = term.getSubterm(0);
      o_132 = term.getSubterm(1);
      IStrategoList annos130 = term.getAnnotations();
      q_132 = annos130;
      term = e_27.invoke(context, m_132);
      if(term == null)
        break Fail155;
      t_132 = term;
      term = f_27.invoke(context, o_132);
      if(term == null)
        break Fail155;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignURightShift_2, new IStrategoTerm[]{t_132, term}), checkListAnnos(termFactory, q_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}