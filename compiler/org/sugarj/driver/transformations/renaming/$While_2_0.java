package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $While_2_0 extends Strategy 
{ 
  public static $While_2_0 instance = new $While_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_19, Strategy w_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("While_2_0");
    Fail82:
    { 
      IStrategoTerm j_114 = null;
      IStrategoTerm h_114 = null;
      IStrategoTerm i_114 = null;
      IStrategoTerm k_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      h_114 = term.getSubterm(0);
      i_114 = term.getSubterm(1);
      IStrategoList annos70 = term.getAnnotations();
      j_114 = annos70;
      term = v_19.invoke(context, h_114);
      if(term == null)
        break Fail82;
      k_114 = term;
      term = w_19.invoke(context, i_114);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWhile_2, new IStrategoTerm[]{k_114, term}), checkListAnnos(termFactory, j_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}