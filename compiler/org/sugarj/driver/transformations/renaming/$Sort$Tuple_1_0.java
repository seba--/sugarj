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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortTuple_1_0");
    Fail355:
    { 
      IStrategoTerm i_195 = null;
      IStrategoTerm h_195 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail355;
      h_195 = term.getSubterm(0);
      IStrategoList annos299 = term.getAnnotations();
      i_195 = annos299;
      term = w_47.invoke(context, h_195);
      if(term == null)
        break Fail355;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_195));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}