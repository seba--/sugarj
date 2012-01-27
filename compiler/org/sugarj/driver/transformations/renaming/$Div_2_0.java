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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_23, Strategy f_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Div_2_0");
    Fail130:
    { 
      IStrategoTerm s_123 = null;
      IStrategoTerm q_123 = null;
      IStrategoTerm r_123 = null;
      IStrategoTerm t_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail130;
      q_123 = term.getSubterm(0);
      r_123 = term.getSubterm(1);
      IStrategoList annos115 = term.getAnnotations();
      s_123 = annos115;
      term = e_23.invoke(context, q_123);
      if(term == null)
        break Fail130;
      t_123 = term;
      term = f_23.invoke(context, r_123);
      if(term == null)
        break Fail130;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDiv_2, new IStrategoTerm[]{t_123, term}), checkListAnnos(termFactory, s_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}