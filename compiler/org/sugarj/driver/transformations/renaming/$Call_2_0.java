package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call_2_0 extends Strategy 
{ 
  public static $Call_2_0 instance = new $Call_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_15, Strategy w_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail97:
    { 
      IStrategoTerm r_106 = null;
      IStrategoTerm p_106 = null;
      IStrategoTerm q_106 = null;
      IStrategoTerm s_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      p_106 = term.getSubterm(0);
      q_106 = term.getSubterm(1);
      IStrategoList annos86 = term.getAnnotations();
      r_106 = annos86;
      term = v_15.invoke(context, p_106);
      if(term == null)
        break Fail97;
      s_106 = term;
      term = w_15.invoke(context, q_106);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCall_2, new IStrategoTerm[]{s_106, term}), checkListAnnos(termFactory, r_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}