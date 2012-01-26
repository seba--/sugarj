package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Eq_2_0 extends Strategy 
{ 
  public static $Eq_2_0 instance = new $Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_22, Strategy j_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Eq_2_0");
    Fail119:
    { 
      IStrategoTerm i_121 = null;
      IStrategoTerm g_121 = null;
      IStrategoTerm h_121 = null;
      IStrategoTerm j_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail119;
      g_121 = term.getSubterm(0);
      h_121 = term.getSubterm(1);
      IStrategoList annos104 = term.getAnnotations();
      i_121 = annos104;
      term = i_22.invoke(context, g_121);
      if(term == null)
        break Fail119;
      j_121 = term;
      term = j_22.invoke(context, h_121);
      if(term == null)
        break Fail119;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEq_2, new IStrategoTerm[]{j_121, term}), checkListAnnos(termFactory, i_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}