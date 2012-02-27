package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Minus_2_0 extends Strategy 
{ 
  public static $Assign$Minus_2_0 instance = new $Assign$Minus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_22, Strategy i_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMinus_2_0");
    Fail112:
    { 
      IStrategoTerm n_119 = null;
      IStrategoTerm l_119 = null;
      IStrategoTerm m_119 = null;
      IStrategoTerm o_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      l_119 = term.getSubterm(0);
      m_119 = term.getSubterm(1);
      IStrategoList annos92 = term.getAnnotations();
      n_119 = annos92;
      term = h_22.invoke(context, l_119);
      if(term == null)
        break Fail112;
      o_119 = term;
      term = i_22.invoke(context, m_119);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignMinus_2, new IStrategoTerm[]{o_119, term}), checkListAnnos(termFactory, n_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}