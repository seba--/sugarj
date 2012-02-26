package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Block_1_0 extends Strategy 
{ 
  public static $Block_1_0 instance = new $Block_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Block_1_0");
    Fail70:
    { 
      IStrategoTerm i_112 = null;
      IStrategoTerm h_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBlock_1 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      h_112 = term.getSubterm(0);
      IStrategoList annos56 = term.getAnnotations();
      i_112 = annos56;
      term = k_19.invoke(context, h_112);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBlock_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}