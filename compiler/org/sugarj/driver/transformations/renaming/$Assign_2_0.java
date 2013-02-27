package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_13, Strategy y_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail65:
    { 
      IStrategoTerm j_101 = null;
      IStrategoTerm h_101 = null;
      IStrategoTerm i_101 = null;
      IStrategoTerm m_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      h_101 = term.getSubterm(0);
      i_101 = term.getSubterm(1);
      IStrategoList annos55 = term.getAnnotations();
      j_101 = annos55;
      term = x_13.invoke(context, h_101);
      if(term == null)
        break Fail65;
      m_101 = term;
      term = y_13.invoke(context, i_101);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssign_2, new IStrategoTerm[]{m_101, term}), checkListAnnos(termFactory, j_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}