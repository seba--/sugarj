package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Alt$Constr$Inv_2_0 extends Strategy 
{ 
  public static $Alt$Constr$Inv_2_0 instance = new $Alt$Constr$Inv_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_23, Strategy m_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AltConstrInv_2_0");
    Fail103:
    { 
      IStrategoTerm g_121 = null;
      IStrategoTerm e_121 = null;
      IStrategoTerm f_121 = null;
      IStrategoTerm h_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAltConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      e_121 = term.getSubterm(0);
      f_121 = term.getSubterm(1);
      IStrategoList annos84 = term.getAnnotations();
      g_121 = annos84;
      term = l_23.invoke(context, e_121);
      if(term == null)
        break Fail103;
      h_121 = term;
      term = m_23.invoke(context, f_121);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAltConstrInv_2, new IStrategoTerm[]{h_121, term}), checkListAnnos(termFactory, g_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}