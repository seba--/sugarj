package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt_2_0 extends Strategy 
{ 
  public static $Gt_2_0 instance = new $Gt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_36, Strategy x_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gt_2_0");
    Fail163:
    { 
      IStrategoTerm k_161 = null;
      IStrategoTerm i_161 = null;
      IStrategoTerm j_161 = null;
      IStrategoTerm l_161 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail163;
      i_161 = term.getSubterm(0);
      j_161 = term.getSubterm(1);
      IStrategoList annos133 = term.getAnnotations();
      k_161 = annos133;
      term = w_36.invoke(context, i_161);
      if(term == null)
        break Fail163;
      l_161 = term;
      term = x_36.invoke(context, j_161);
      if(term == null)
        break Fail163;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGt_2, new IStrategoTerm[]{l_161, term}), checkListAnnos(termFactory, k_161));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}