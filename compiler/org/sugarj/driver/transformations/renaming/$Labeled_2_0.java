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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_20, Strategy j_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Labeled_2_0");
    Fail89:
    { 
      IStrategoTerm w_115 = null;
      IStrategoTerm u_115 = null;
      IStrategoTerm v_115 = null;
      IStrategoTerm x_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLabeled_2 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      u_115 = term.getSubterm(0);
      v_115 = term.getSubterm(1);
      IStrategoList annos77 = term.getAnnotations();
      w_115 = annos77;
      term = i_20.invoke(context, u_115);
      if(term == null)
        break Fail89;
      x_115 = term;
      term = j_20.invoke(context, v_115);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLabeled_2, new IStrategoTerm[]{x_115, term}), checkListAnnos(termFactory, w_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}