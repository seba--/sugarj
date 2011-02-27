package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class simple_group_1_0 extends Strategy 
{ 
  public static simple_group_1_0 instance = new simple_group_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simple_group_1_0");
    Fail191:
    { 
      IStrategoTerm k_136 = null;
      IStrategoTerm j_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conssimple_group_1 != ((IStrategoAppl)term).getConstructor())
        break Fail191;
      j_136 = term.getSubterm(0);
      IStrategoList annos159 = term.getAnnotations();
      k_136 = annos159;
      term = o_26.invoke(context, j_136);
      if(term == null)
        break Fail191;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conssimple_group_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}