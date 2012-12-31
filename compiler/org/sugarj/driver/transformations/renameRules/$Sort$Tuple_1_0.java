package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$Tuple_1_0 extends Strategy 
{ 
  public static $Sort$Tuple_1_0 instance = new $Sort$Tuple_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortTuple_1_0");
    Fail117:
    { 
      IStrategoTerm b_111 = null;
      IStrategoTerm v_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      v_110 = term.getSubterm(0);
      IStrategoList annos108 = term.getAnnotations();
      b_111 = annos108;
      term = j_17.invoke(context, v_110);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}