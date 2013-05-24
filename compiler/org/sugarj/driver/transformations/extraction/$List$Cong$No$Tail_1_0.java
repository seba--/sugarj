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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCongNoTail_1_0");
    Fail912:
    { 
      IStrategoTerm s_449 = null;
      IStrategoTerm r_449 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consListCongNoTail_1 != ((IStrategoAppl)term).getConstructor())
        break Fail912;
      r_449 = term.getSubterm(0);
      IStrategoList annos157 = term.getAnnotations();
      s_449 = annos157;
      term = t_343.invoke(context, r_449);
      if(term == null)
        break Fail912;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consListCongNoTail_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_449));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}