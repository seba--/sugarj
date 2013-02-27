package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$Then_2_0 extends Strategy 
{ 
  public static $If$Then_2_0 instance = new $If$Then_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_14, Strategy k_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThen_2_0");
    Fail69:
    { 
      IStrategoTerm k_102 = null;
      IStrategoTerm i_102 = null;
      IStrategoTerm j_102 = null;
      IStrategoTerm l_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consIfThen_2 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      i_102 = term.getSubterm(0);
      j_102 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      k_102 = annos59;
      term = j_14.invoke(context, i_102);
      if(term == null)
        break Fail69;
      l_102 = term;
      term = k_14.invoke(context, j_102);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consIfThen_2, new IStrategoTerm[]{l_102, term}), checkListAnnos(termFactory, k_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}