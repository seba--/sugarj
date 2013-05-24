package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Line$Comment$Prefix_1_0 extends Strategy 
{ 
  public static $Line$Comment$Prefix_1_0 instance = new $Line$Comment$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LineCommentPrefix_1_0");
    Fail833:
    { 
      IStrategoTerm k_436 = null;
      IStrategoTerm j_436 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLineCommentPrefix_1 != ((IStrategoAppl)term).getConstructor())
        break Fail833;
      j_436 = term.getSubterm(0);
      IStrategoList annos81 = term.getAnnotations();
      k_436 = annos81;
      term = n_338.invoke(context, j_436);
      if(term == null)
        break Fail833;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLineCommentPrefix_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_436));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}