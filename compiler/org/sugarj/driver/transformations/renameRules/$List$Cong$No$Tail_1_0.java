package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCongNoTail_1_0");
    Fail74:
    { 
      IStrategoTerm w_103 = null;
      IStrategoTerm v_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListCongNoTail_1 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      v_103 = term.getSubterm(0);
      IStrategoList annos68 = term.getAnnotations();
      w_103 = annos68;
      term = x_14.invoke(context, v_103);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListCongNoTail_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}