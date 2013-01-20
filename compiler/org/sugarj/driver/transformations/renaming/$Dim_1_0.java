package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dim_1_0 extends Strategy 
{ 
  public static $Dim_1_0 instance = new $Dim_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Dim_1_0");
    Fail68:
    { 
      IStrategoTerm n_133 = null;
      IStrategoTerm m_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDim_1 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      m_133 = term.getSubterm(0);
      IStrategoList annos44 = term.getAnnotations();
      n_133 = annos44;
      term = i_29.invoke(context, m_133);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDim_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}