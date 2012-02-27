package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Try_3_0 extends Strategy 
{ 
  public static $Try_3_0 instance = new $Try_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_19, Strategy z_19, Strategy a_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_3_0");
    Fail77:
    { 
      IStrategoTerm j_113 = null;
      IStrategoTerm f_113 = null;
      IStrategoTerm g_113 = null;
      IStrategoTerm i_113 = null;
      IStrategoTerm k_113 = null;
      IStrategoTerm l_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTry_3 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      f_113 = term.getSubterm(0);
      g_113 = term.getSubterm(1);
      i_113 = term.getSubterm(2);
      IStrategoList annos60 = term.getAnnotations();
      j_113 = annos60;
      term = y_19.invoke(context, f_113);
      if(term == null)
        break Fail77;
      k_113 = term;
      term = z_19.invoke(context, g_113);
      if(term == null)
        break Fail77;
      l_113 = term;
      term = a_20.invoke(context, i_113);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTry_3, new IStrategoTerm[]{k_113, l_113, term}), checkListAnnos(termFactory, j_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}