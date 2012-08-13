package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Mul_2_0 extends Strategy 
{ 
  public static $Mul_2_0 instance = new $Mul_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_29, Strategy h_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Mul_2_0");
    Fail182:
    { 
      IStrategoTerm q_142 = null;
      IStrategoTerm o_142 = null;
      IStrategoTerm p_142 = null;
      IStrategoTerm r_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail182;
      o_142 = term.getSubterm(0);
      p_142 = term.getSubterm(1);
      IStrategoList annos157 = term.getAnnotations();
      q_142 = annos157;
      term = g_29.invoke(context, o_142);
      if(term == null)
        break Fail182;
      r_142 = term;
      term = h_29.invoke(context, p_142);
      if(term == null)
        break Fail182;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMul_2, new IStrategoTerm[]{r_142, term}), checkListAnnos(termFactory, q_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}