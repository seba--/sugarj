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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_46, Strategy k_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail331:
    { 
      IStrategoTerm u_190 = null;
      IStrategoTerm s_190 = null;
      IStrategoTerm t_190 = null;
      IStrategoTerm v_190 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail331;
      s_190 = term.getSubterm(0);
      t_190 = term.getSubterm(1);
      IStrategoList annos277 = term.getAnnotations();
      u_190 = annos277;
      term = j_46.invoke(context, s_190);
      if(term == null)
        break Fail331;
      v_190 = term;
      term = k_46.invoke(context, t_190);
      if(term == null)
        break Fail331;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCall_2, new IStrategoTerm[]{v_190, term}), checkListAnnos(termFactory, u_190));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}