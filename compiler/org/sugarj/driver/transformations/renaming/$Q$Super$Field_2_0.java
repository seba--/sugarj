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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_14, Strategy w_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperField_2_0");
    Fail24:
    { 
      IStrategoTerm f_101 = null;
      IStrategoTerm d_101 = null;
      IStrategoTerm e_101 = null;
      IStrategoTerm g_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperField_2 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      d_101 = term.getSubterm(0);
      e_101 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      f_101 = annos15;
      term = v_14.invoke(context, d_101);
      if(term == null)
        break Fail24;
      g_101 = term;
      term = w_14.invoke(context, e_101);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperField_2, new IStrategoTerm[]{g_101, term}), checkListAnnos(termFactory, f_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}