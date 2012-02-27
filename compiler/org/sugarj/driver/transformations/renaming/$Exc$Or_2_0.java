package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Exc$Or_2_0 extends Strategy 
{ 
  public static $Exc$Or_2_0 instance = new $Exc$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_22, Strategy w_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExcOr_2_0");
    Fail119:
    { 
      IStrategoTerm h_121 = null;
      IStrategoTerm f_121 = null;
      IStrategoTerm g_121 = null;
      IStrategoTerm i_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail119;
      f_121 = term.getSubterm(0);
      g_121 = term.getSubterm(1);
      IStrategoList annos99 = term.getAnnotations();
      h_121 = annos99;
      term = v_22.invoke(context, f_121);
      if(term == null)
        break Fail119;
      i_121 = term;
      term = w_22.invoke(context, g_121);
      if(term == null)
        break Fail119;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExcOr_2, new IStrategoTerm[]{i_121, term}), checkListAnnos(termFactory, h_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}