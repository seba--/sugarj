package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch_2_0 extends Strategy 
{ 
  public static $Switch_2_0 instance = new $Switch_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_20, Strategy v_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Switch_2_0");
    Fail88:
    { 
      IStrategoTerm s_115 = null;
      IStrategoTerm q_115 = null;
      IStrategoTerm r_115 = null;
      IStrategoTerm t_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail88;
      q_115 = term.getSubterm(0);
      r_115 = term.getSubterm(1);
      IStrategoList annos71 = term.getAnnotations();
      s_115 = annos71;
      term = u_20.invoke(context, q_115);
      if(term == null)
        break Fail88;
      t_115 = term;
      term = v_20.invoke(context, r_115);
      if(term == null)
        break Fail88;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitch_2, new IStrategoTerm[]{t_115, term}), checkListAnnos(termFactory, s_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}