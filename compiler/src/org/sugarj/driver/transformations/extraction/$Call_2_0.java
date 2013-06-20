package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_22, Strategy j_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail123:
    { 
      IStrategoTerm t_120 = null;
      IStrategoTerm r_120 = null;
      IStrategoTerm s_120 = null;
      IStrategoTerm v_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      r_120 = term.getSubterm(0);
      s_120 = term.getSubterm(1);
      IStrategoList annos95 = term.getAnnotations();
      t_120 = annos95;
      term = i_22.invoke(context, r_120);
      if(term == null)
        break Fail123;
      v_120 = term;
      term = j_22.invoke(context, s_120);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consCall_2, new IStrategoTerm[]{v_120, term}), checkListAnnos(termFactory, t_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}