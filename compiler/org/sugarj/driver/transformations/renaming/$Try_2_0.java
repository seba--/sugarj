package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Try_2_0 extends Strategy 
{ 
  public static $Try_2_0 instance = new $Try_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_19, Strategy u_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_2_0");
    Fail76:
    { 
      IStrategoTerm g_113 = null;
      IStrategoTerm e_113 = null;
      IStrategoTerm f_113 = null;
      IStrategoTerm i_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTry_2 != ((IStrategoAppl)term).getConstructor())
        break Fail76;
      e_113 = term.getSubterm(0);
      f_113 = term.getSubterm(1);
      IStrategoList annos61 = term.getAnnotations();
      g_113 = annos61;
      term = t_19.invoke(context, e_113);
      if(term == null)
        break Fail76;
      i_113 = term;
      term = u_19.invoke(context, f_113);
      if(term == null)
        break Fail76;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTry_2, new IStrategoTerm[]{i_113, term}), checkListAnnos(termFactory, g_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}