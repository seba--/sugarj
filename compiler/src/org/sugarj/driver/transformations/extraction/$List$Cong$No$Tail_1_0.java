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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCongNoTail_1_0");
    Fail104:
    { 
      IStrategoTerm t_117 = null;
      IStrategoTerm s_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consListCongNoTail_1 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      s_117 = term.getSubterm(0);
      IStrategoList annos77 = term.getAnnotations();
      t_117 = annos77;
      term = j_21.invoke(context, s_117);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consListCongNoTail_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}