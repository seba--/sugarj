package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rec_2_0 extends Strategy 
{ 
  public static $Rec_2_0 instance = new $Rec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_22, Strategy b_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rec_2_0");
    Fail107:
    { 
      IStrategoTerm k_119 = null;
      IStrategoTerm i_119 = null;
      IStrategoTerm j_119 = null;
      IStrategoTerm l_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail107;
      i_119 = term.getSubterm(0);
      j_119 = term.getSubterm(1);
      IStrategoList annos82 = term.getAnnotations();
      k_119 = annos82;
      term = a_22.invoke(context, i_119);
      if(term == null)
        break Fail107;
      l_119 = term;
      term = b_22.invoke(context, j_119);
      if(term == null)
        break Fail107;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRec_2, new IStrategoTerm[]{l_119, term}), checkListAnnos(termFactory, k_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}