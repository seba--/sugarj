package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class prods_group_1_0 extends Strategy 
{ 
  public static prods_group_1_0 instance = new prods_group_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prods_group_1_0");
    Fail190:
    { 
      IStrategoTerm h_136 = null;
      IStrategoTerm f_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consprods_group_1 != ((IStrategoAppl)term).getConstructor())
        break Fail190;
      f_136 = term.getSubterm(0);
      IStrategoList annos158 = term.getAnnotations();
      h_136 = annos158;
      term = n_26.invoke(context, f_136);
      if(term == null)
        break Fail190;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consprods_group_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}