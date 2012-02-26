package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Method_2_0 extends Strategy 
{ 
  public static $Super$Method_2_0 instance = new $Super$Method_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_15, Strategy f_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperMethod_2_0");
    Fail24:
    { 
      IStrategoTerm g_101 = null;
      IStrategoTerm e_101 = null;
      IStrategoTerm f_101 = null;
      IStrategoTerm h_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperMethod_2 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      e_101 = term.getSubterm(0);
      f_101 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      g_101 = annos12;
      term = e_15.invoke(context, e_101);
      if(term == null)
        break Fail24;
      h_101 = term;
      term = f_15.invoke(context, f_101);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperMethod_2, new IStrategoTerm[]{h_101, term}), checkListAnnos(termFactory, g_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}