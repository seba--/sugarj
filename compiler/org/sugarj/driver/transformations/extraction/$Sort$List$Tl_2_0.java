package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$List$Tl_2_0 extends Strategy 
{ 
  public static $Sort$List$Tl_2_0 instance = new $Sort$List$Tl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_23, Strategy w_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortListTl_2_0");
    Fail136:
    { 
      IStrategoTerm d_125 = null;
      IStrategoTerm b_125 = null;
      IStrategoTerm c_125 = null;
      IStrategoTerm e_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSortListTl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      b_125 = term.getSubterm(0);
      c_125 = term.getSubterm(1);
      IStrategoList annos109 = term.getAnnotations();
      d_125 = annos109;
      term = v_23.invoke(context, b_125);
      if(term == null)
        break Fail136;
      e_125 = term;
      term = w_23.invoke(context, c_125);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSortListTl_2, new IStrategoTerm[]{e_125, term}), checkListAnnos(termFactory, d_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}