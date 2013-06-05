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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_23, Strategy v_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortListTl_2_0");
    Fail147:
    { 
      IStrategoTerm h_125 = null;
      IStrategoTerm e_125 = null;
      IStrategoTerm f_125 = null;
      IStrategoTerm i_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSortListTl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail147;
      e_125 = term.getSubterm(0);
      f_125 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      h_125 = annos117;
      term = u_23.invoke(context, e_125);
      if(term == null)
        break Fail147;
      i_125 = term;
      term = v_23.invoke(context, f_125);
      if(term == null)
        break Fail147;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSortListTl_2, new IStrategoTerm[]{i_125, term}), checkListAnnos(termFactory, h_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}