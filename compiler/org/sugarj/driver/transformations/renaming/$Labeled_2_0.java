package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Labeled_2_0 extends Strategy 
{ 
  public static $Labeled_2_0 instance = new $Labeled_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_21, Strategy g_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Labeled_2_0");
    Fail94:
    { 
      IStrategoTerm u_116 = null;
      IStrategoTerm s_116 = null;
      IStrategoTerm t_116 = null;
      IStrategoTerm v_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLabeled_2 != ((IStrategoAppl)term).getConstructor())
        break Fail94;
      s_116 = term.getSubterm(0);
      t_116 = term.getSubterm(1);
      IStrategoList annos77 = term.getAnnotations();
      u_116 = annos77;
      term = f_21.invoke(context, s_116);
      if(term == null)
        break Fail94;
      v_116 = term;
      term = g_21.invoke(context, t_116);
      if(term == null)
        break Fail94;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLabeled_2, new IStrategoTerm[]{v_116, term}), checkListAnnos(termFactory, u_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}