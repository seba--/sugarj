package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Group_2_0 extends Strategy 
{ 
  public static $Switch$Group_2_0 instance = new $Switch$Group_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_24, Strategy y_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchGroup_2_0");
    Fail121:
    { 
      IStrategoTerm l_125 = null;
      IStrategoTerm j_125 = null;
      IStrategoTerm k_125 = null;
      IStrategoTerm m_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitchGroup_2 != ((IStrategoAppl)term).getConstructor())
        break Fail121;
      j_125 = term.getSubterm(0);
      k_125 = term.getSubterm(1);
      IStrategoList annos99 = term.getAnnotations();
      l_125 = annos99;
      term = x_24.invoke(context, j_125);
      if(term == null)
        break Fail121;
      m_125 = term;
      term = y_24.invoke(context, k_125);
      if(term == null)
        break Fail121;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitchGroup_2, new IStrategoTerm[]{m_125, term}), checkListAnnos(termFactory, l_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}