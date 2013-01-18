package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCongNoTail_1_0");
    Fail313:
    { 
      IStrategoTerm f_188 = null;
      IStrategoTerm e_188 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListCongNoTail_1 != ((IStrategoAppl)term).getConstructor())
        break Fail313;
      e_188 = term.getSubterm(0);
      IStrategoList annos260 = term.getAnnotations();
      f_188 = annos260;
      term = l_45.invoke(context, e_188);
      if(term == null)
        break Fail313;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListCongNoTail_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_188));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}