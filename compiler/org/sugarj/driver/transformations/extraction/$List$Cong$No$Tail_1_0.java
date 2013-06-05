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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCongNoTail_1_0");
    Fail103:
    { 
      IStrategoTerm o_117 = null;
      IStrategoTerm n_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consListCongNoTail_1 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      n_117 = term.getSubterm(0);
      IStrategoList annos76 = term.getAnnotations();
      o_117 = annos76;
      term = h_21.invoke(context, n_117);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consListCongNoTail_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}