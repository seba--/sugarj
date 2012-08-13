package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Field_2_0 extends Strategy 
{ 
  public static $Q$Super$Field_2_0 instance = new $Q$Super$Field_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_20, Strategy w_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperField_2_0");
    Fail75:
    { 
      IStrategoTerm h_114 = null;
      IStrategoTerm f_114 = null;
      IStrategoTerm g_114 = null;
      IStrategoTerm i_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperField_2 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      f_114 = term.getSubterm(0);
      g_114 = term.getSubterm(1);
      IStrategoList annos56 = term.getAnnotations();
      h_114 = annos56;
      term = v_20.invoke(context, f_114);
      if(term == null)
        break Fail75;
      i_114 = term;
      term = w_20.invoke(context, g_114);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperField_2, new IStrategoTerm[]{i_114, term}), checkListAnnos(termFactory, h_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}