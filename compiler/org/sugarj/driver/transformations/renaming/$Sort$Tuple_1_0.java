package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortTuple_1_0");
    Fail121:
    { 
      IStrategoTerm v_110 = null;
      IStrategoTerm u_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail121;
      u_110 = term.getSubterm(0);
      IStrategoList annos108 = term.getAnnotations();
      v_110 = annos108;
      term = i_17.invoke(context, u_110);
      if(term == null)
        break Fail121;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}