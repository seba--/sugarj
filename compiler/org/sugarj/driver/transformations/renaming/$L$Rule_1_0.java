package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Rule_1_0 extends Strategy 
{ 
  public static $L$Rule_1_0 instance = new $L$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LRule_1_0");
    Fail74:
    { 
      IStrategoTerm i_103 = null;
      IStrategoTerm h_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      h_103 = term.getSubterm(0);
      IStrategoList annos64 = term.getAnnotations();
      i_103 = annos64;
      term = t_14.invoke(context, h_103);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}