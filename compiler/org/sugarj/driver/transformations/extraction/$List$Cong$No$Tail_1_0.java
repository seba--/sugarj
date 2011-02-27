package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Cong$No$Tail_1_0 extends Strategy 
{ 
  public static $List$Cong$No$Tail_1_0 instance = new $List$Cong$No$Tail_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCongNoTail_1_0");
    Fail91:
    { 
      IStrategoTerm l_117 = null;
      IStrategoTerm k_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consListCongNoTail_1 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      k_117 = term.getSubterm(0);
      IStrategoList annos68 = term.getAnnotations();
      l_117 = annos68;
      term = i_21.invoke(context, k_117);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consListCongNoTail_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}