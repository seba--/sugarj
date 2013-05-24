package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class id_1_0 extends Strategy 
{ 
  public static id_1_0 instance = new id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("id_1_0");
    Fail1054:
    { 
      IStrategoTerm s_469 = null;
      IStrategoTerm r_469 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consid_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1054;
      r_469 = term.getSubterm(0);
      IStrategoList annos281 = term.getAnnotations();
      s_469 = annos281;
      term = j_351.invoke(context, r_469);
      if(term == null)
        break Fail1054;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consid_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_469));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}