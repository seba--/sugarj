package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Div_2_0 extends Strategy 
{ 
  public static $Div_2_0 instance = new $Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_29, Strategy f_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Div_2_0");
    Fail181:
    { 
      IStrategoTerm k_142 = null;
      IStrategoTerm x_141 = null;
      IStrategoTerm y_141 = null;
      IStrategoTerm m_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail181;
      x_141 = term.getSubterm(0);
      y_141 = term.getSubterm(1);
      IStrategoList annos156 = term.getAnnotations();
      k_142 = annos156;
      term = e_29.invoke(context, x_141);
      if(term == null)
        break Fail181;
      m_142 = term;
      term = f_29.invoke(context, y_141);
      if(term == null)
        break Fail181;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDiv_2, new IStrategoTerm[]{m_142, term}), checkListAnnos(termFactory, k_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}