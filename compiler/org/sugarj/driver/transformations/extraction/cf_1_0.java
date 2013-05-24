package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class cf_1_0 extends Strategy 
{ 
  public static cf_1_0 instance = new cf_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("cf_1_0");
    Fail1059:
    { 
      IStrategoTerm j_470 = null;
      IStrategoTerm i_470 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conscf_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1059;
      i_470 = term.getSubterm(0);
      IStrategoList annos286 = term.getAnnotations();
      j_470 = annos286;
      term = p_351.invoke(context, i_470);
      if(term == null)
        break Fail1059;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conscf_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_470));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}