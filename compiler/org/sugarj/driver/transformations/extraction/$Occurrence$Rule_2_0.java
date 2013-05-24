package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Occurrence$Rule_2_0 extends Strategy 
{ 
  public static $Occurrence$Rule_2_0 instance = new $Occurrence$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_336, Strategy k_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OccurrenceRule_2_0");
    Fail783:
    { 
      IStrategoTerm b_431 = null;
      IStrategoTerm z_430 = null;
      IStrategoTerm a_431 = null;
      IStrategoTerm c_431 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOccurrenceRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail783;
      z_430 = term.getSubterm(0);
      a_431 = term.getSubterm(1);
      IStrategoList annos47 = term.getAnnotations();
      b_431 = annos47;
      term = j_336.invoke(context, z_430);
      if(term == null)
        break Fail783;
      c_431 = term;
      term = k_336.invoke(context, a_431);
      if(term == null)
        break Fail783;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOccurrenceRule_2, new IStrategoTerm[]{c_431, term}), checkListAnnos(termFactory, b_431));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}