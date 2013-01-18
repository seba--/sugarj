package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not$Eq_2_0 extends Strategy 
{ 
  public static $Not$Eq_2_0 instance = new $Not$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_36, Strategy p_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NotEq_2_0");
    Fail159:
    { 
      IStrategoTerm q_160 = null;
      IStrategoTerm o_160 = null;
      IStrategoTerm p_160 = null;
      IStrategoTerm r_160 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail159;
      o_160 = term.getSubterm(0);
      p_160 = term.getSubterm(1);
      IStrategoList annos129 = term.getAnnotations();
      q_160 = annos129;
      term = o_36.invoke(context, o_160);
      if(term == null)
        break Fail159;
      r_160 = term;
      term = p_36.invoke(context, p_160);
      if(term == null)
        break Fail159;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consNotEq_2, new IStrategoTerm[]{r_160, term}), checkListAnnos(termFactory, q_160));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}