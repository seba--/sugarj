package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$This_1_0 extends Strategy 
{ 
  public static $Q$This_1_0 instance = new $Q$This_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QThis_1_0");
    Fail187:
    { 
      IStrategoTerm j_168 = null;
      IStrategoTerm i_168 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consQThis_1 != ((IStrategoAppl)term).getConstructor())
        break Fail187;
      i_168 = term.getSubterm(0);
      IStrategoList annos157 = term.getAnnotations();
      j_168 = annos157;
      term = q_38.invoke(context, i_168);
      if(term == null)
        break Fail187;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consQThis_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_168));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}