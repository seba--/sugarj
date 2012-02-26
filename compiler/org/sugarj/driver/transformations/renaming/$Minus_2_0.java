package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_2_0 extends Strategy 
{ 
  public static $Minus_2_0 instance = new $Minus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_23, Strategy o_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_2_0");
    Fail130:
    { 
      IStrategoTerm t_123 = null;
      IStrategoTerm r_123 = null;
      IStrategoTerm s_123 = null;
      IStrategoTerm u_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail130;
      r_123 = term.getSubterm(0);
      s_123 = term.getSubterm(1);
      IStrategoList annos112 = term.getAnnotations();
      t_123 = annos112;
      term = n_23.invoke(context, r_123);
      if(term == null)
        break Fail130;
      u_123 = term;
      term = o_23.invoke(context, s_123);
      if(term == null)
        break Fail130;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMinus_2, new IStrategoTerm[]{u_123, term}), checkListAnnos(termFactory, t_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}