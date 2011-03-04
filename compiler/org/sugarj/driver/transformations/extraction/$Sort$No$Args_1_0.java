package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$No$Args_1_0 extends Strategy 
{ 
  public static $Sort$No$Args_1_0 instance = new $Sort$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortNoArgs_1_0");
    Fail139:
    { 
      IStrategoTerm q_125 = null;
      IStrategoTerm p_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSortNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail139;
      p_125 = term.getSubterm(0);
      IStrategoList annos112 = term.getAnnotations();
      q_125 = annos112;
      term = a_24.invoke(context, p_125);
      if(term == null)
        break Fail139;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSortNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}